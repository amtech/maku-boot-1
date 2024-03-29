package net.maku.framework.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger配置
 *
 * @author wangkai
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi userApi() {
        String[] paths = {"/**"};
        String[] packagedToMatch = {"net.maku"};
        return GroupedOpenApi.builder().group("MakuBoot").pathsToMatch(paths).packagesToScan(packagedToMatch).build();
    }

    @Bean
    public OpenAPI customOpenApi() {
        Contact contact = new Contact();
        contact.setName("JWangZzz");
        contact.setEmail("2925285800@qq.com");

        License listener = new License();
        listener.name("MIT").url("https://github.com/wangkai147/maku-boot");

        Info info = new Info();
        info.title("MakuBoot")
                .description("MakuBoot")
                .contact(contact)
                .version("1.0")
                .termsOfService("https://github.com/wangkai147/maku-boot")
                .license(listener);

        return new OpenAPI().info(info);
    }

}