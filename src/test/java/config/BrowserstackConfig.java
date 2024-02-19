package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:browserstack_android.properties")
public interface BrowserstackConfig extends Config {
    @Key("browserstack.user")
    String browserstackUser();
    @Key("browserstack.key")
    String browserstackKey();
    String app();
    String device();
    @Key("os_version")
    String osVersion();
    String project();
    String build();
    String name();
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String baseUrl();
}
