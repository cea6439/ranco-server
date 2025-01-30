package com.van.ranco.global.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("RANCO - API 명세서")
                .description("사이드 프로젝트 RANCO에 사용되는 API 명세서")
                .version("1.0.0");

        return new OpenAPI().info(info);
    }

}
