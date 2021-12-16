package rocks.voss.musicsync.plugins.output.toniebox.config;

import lombok.Data;

@Data
public class PluginConfiguration {
    private String username;
    private String password;
    private int threshold = 2000;
}
