package trilha.back.financys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
//@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("trilha.back.financys"))
                .paths(PathSelectors.regex("/api.*"))
                .build();
//                .apiInfo(metaInfo());
    }

//    private ApiInfo metaInfo() {
//        ApiInfo apiInfo = new ApiInfo(
//                "FINANCYS API REST",
//                "API REST de financys.",
//                "1.0",
//                "Terms of service",
//                new Contact("Laura Kimberly", "teste.com", "lauraksp@icloud,com"),
//                "Apache Licence Version 2.0",
//                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
//        );
//        return apiInfo;
//    }
}
