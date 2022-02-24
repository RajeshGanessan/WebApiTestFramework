package com.kh.config;

import com.kh.convertors.StringToBrowserTypeConvertor;
import com.kh.enums.BrowserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("chrome")
    @ConverterClass(StringToBrowserTypeConvertor.class)
    BrowserType browser();
}
