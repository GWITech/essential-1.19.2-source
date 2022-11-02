package gg.essential.elementa.impl.commonmark.internal.util;

import gg.essential.elementa.impl.commonmark.internal.inline.*;

public class LinkScanner
{
    public LinkScanner() {
        super();
    }
    
    public static boolean scanLinkLabelContent(final Scanner scanner) {
        while (scanner.hasNext()) {
            switch (scanner.peek()) {
                case '\\': {
                    scanner.next();
                    if (Parsing.isEscapable(scanner.peek())) {
                        scanner.next();
                        continue;
                    }
                    continue;
                }
                case ']': {
                    return true;
                }
                case '[': {
                    return false;
                }
                default: {
                    scanner.next();
                    continue;
                }
            }
        }
        return true;
    }
    
    public static boolean scanLinkDestination(final Scanner scanner) {
        if (!scanner.hasNext()) {
            return false;
        }
        if (scanner.next('<')) {
            while (scanner.hasNext()) {
                switch (scanner.peek()) {
                    case '\\': {
                        scanner.next();
                        if (Parsing.isEscapable(scanner.peek())) {
                            scanner.next();
                            continue;
                        }
                        continue;
                    }
                    case '\n':
                    case '<': {
                        return false;
                    }
                    case '>': {
                        scanner.next();
                        return true;
                    }
                    default: {
                        scanner.next();
                        continue;
                    }
                }
            }
            return false;
        }
        return scanLinkDestinationWithBalancedParens(scanner);
    }
    
    public static boolean scanLinkTitle(final Scanner scanner) {
        if (!scanner.hasNext()) {
            return false;
        }
        char endDelimiter = '\0';
        switch (scanner.peek()) {
            case '\"': {
                endDelimiter = '\"';
                break;
            }
            case '\'': {
                endDelimiter = '\'';
                break;
            }
            case '(': {
                endDelimiter = ')';
                break;
            }
            default: {
                return false;
            }
        }
        scanner.next();
        if (!scanLinkTitleContent(scanner, endDelimiter)) {
            return false;
        }
        if (!scanner.hasNext()) {
            return false;
        }
        scanner.next();
        return true;
    }
    
    public static boolean scanLinkTitleContent(final Scanner scanner, final char endDelimiter) {
        while (scanner.hasNext()) {
            final char c = scanner.peek();
            if (c == '\\') {
                scanner.next();
                if (!Parsing.isEscapable(scanner.peek())) {
                    continue;
                }
                scanner.next();
            }
            else {
                if (c == endDelimiter) {
                    return true;
                }
                if (endDelimiter == ')' && c == '(') {
                    return false;
                }
                scanner.next();
            }
        }
        return true;
    }
    
    private static boolean scanLinkDestinationWithBalancedParens(final Scanner scanner) {
        int parens = 0;
        boolean empty = true;
        while (scanner.hasNext()) {
            final char c = scanner.peek();
            switch (c) {
                case ' ': {
                    return !empty;
                }
                case '\\': {
                    scanner.next();
                    if (Parsing.isEscapable(scanner.peek())) {
                        scanner.next();
                        break;
                    }
                    break;
                }
                case '(': {
                    if (++parens > 32) {
                        return false;
                    }
                    scanner.next();
                    break;
                }
                case ')': {
                    if (parens == 0) {
                        return true;
                    }
                    --parens;
                    scanner.next();
                    break;
                }
                default: {
                    if (Character.isISOControl(c)) {
                        return !empty;
                    }
                    scanner.next();
                    break;
                }
            }
            empty = false;
        }
        return true;
    }
}
