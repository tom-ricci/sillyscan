package dev.thomasricci.sillyscan;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.proxy.ProxyPingEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.server.ServerPing;
import org.slf4j.Logger;

@Plugin(id = "sillyscan", name = "sillyscan", version = BuildConstants.VERSION)
public class Main {

    @Inject
    private Logger logger;

    @Inject
    private ProxyServer server;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        // something will go here later
    }

    /**
     * Spoofs the version of the server to prevent matscan from fingerprinting it as Velocity and skipping it.
     */
    @Subscribe
    public void onPing(ProxyPingEvent event) {
        ServerPing.Version version = event.getPing().getVersion();
        ServerPing ping = event
                .getPing()
                .asBuilder()
                .version(new ServerPing.Version(
                    version.getProtocol(),
                    version.getName().replaceFirst("Velocity", "").trim()))
                .build();
        event.setPing(ping);
    }

}
