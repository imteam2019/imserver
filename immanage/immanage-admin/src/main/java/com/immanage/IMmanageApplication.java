package com.immanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author immanage
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class IMmanageApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(IMmanageApplication.class, args);
        System.out.println("....IM2019管理平台启动成功  ....");
    }
}