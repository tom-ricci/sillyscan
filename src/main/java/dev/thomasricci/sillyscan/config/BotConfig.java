package dev.thomasricci.sillyscan.config;

public record BotConfig(String name, String description, FingerprintConfig fingerprint, LoggerConfig logging) {}
