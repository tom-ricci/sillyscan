package dev.thomasricci.sillyscan.config;

import com.velocitypowered.api.proxy.server.ServerPing;

import java.util.List;

public record FingerprintConfig(List<String> ips, List<Integer> ports, List<ServerPing.Version> versions) {}
