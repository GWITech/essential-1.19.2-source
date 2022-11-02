package gg.essential.handlers;

import gg.essential.universal.*;
import gg.essential.*;
import gg.essential.event.client.*;
import gg.essential.lib.kbrewster.eventbus.*;
import net.minecraft.client.util.*;
import gg.essential.gui.account.factory.*;
import java.util.*;

public class ReAuthChecker
{
    private String token;
    
    public ReAuthChecker() {
        super();
        this.token = UMinecraft.getMinecraft().getSession().getAccessToken();
    }
    
    @Subscribe
    public void tick(final ClientTickEvent event) {
        final String token1 = UMinecraft.getMinecraft().getSession().getAccessToken();
        if (this.token == null || !this.token.equals(token1)) {
            this.token = token1;
            Essential.EVENT_BUS.post(new ReAuthEvent.Post(UMinecraft.getMinecraft().getSession()));
        }
    }
    
    @Subscribe
    public void onPreReAuth(final ReAuthEvent.Pre event) {
        final Optional<SessionFactory> session = Essential.getInstance().getSessionFactories().stream().filter(sessionFactory -> sessionFactory.getSessions().containsKey(event.getSession().getProfile().getId())).findFirst();
        if (session.isPresent()) {
            this.token = session.get().getSessions().get(event.getSession().getProfile().getId()).getAccessToken();
            Essential.EVENT_BUS.post(new ReAuthEvent.Post(event.getSession()));
        }
        else {
            this.token = UMinecraft.getMinecraft().getSession().getAccessToken();
            Essential.EVENT_BUS.post(new ReAuthEvent.Post(UMinecraft.getMinecraft().getSession()));
        }
    }
    
    private static /* synthetic */ boolean lambda$onPreReAuth$0(final ReAuthEvent.Pre event, final SessionFactory sessionFactory) {
        return sessionFactory.getSessions().containsKey(event.getSession().getProfile().getId());
    }
}
