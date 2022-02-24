package com.kh.config;

import com.kh.enums.BrowserType;
import org.aeonbits.owner.ConfigCache;

import java.awt.*;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
