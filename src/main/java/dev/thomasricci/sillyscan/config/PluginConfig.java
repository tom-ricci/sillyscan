package dev.thomasricci.sillyscan.config;

import java.util.List;

public record PluginConfig(List<FingerprintConfig> fingerprints, LoggerConfig logging) {}
