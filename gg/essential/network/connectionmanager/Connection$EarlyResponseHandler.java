package gg.essential.network.connectionmanager;

import java.util.function.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;

public interface EarlyResponseHandler extends Consumer<Optional<Packet>>
{
}
