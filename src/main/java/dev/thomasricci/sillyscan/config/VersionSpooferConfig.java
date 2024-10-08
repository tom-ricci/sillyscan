package dev.thomasricci.sillyscan.config;

import com.velocitypowered.api.proxy.server.ServerPing;

public record VersionSpooferConfig(ServerPing.Version version) {}
