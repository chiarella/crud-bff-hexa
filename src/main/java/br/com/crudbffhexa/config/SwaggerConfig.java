package br.com.crudbffhexa.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
@EnableWebMvc
@ConditionalOnProperty(value = "springdoc.swagger-ui.enabled", havingValue = "true", matchIfMissing = true)
public class SwaggerConfig implements WebMvcConfigurer {

	@Value("${info.app.name:unknown}")
	private String name;
	
	@Value("${info.app.description:unknown}")
	private String description;
	
	@Value("${info.app.version:unknown}")
	private String version;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/swagger-ui/")
				.setViewName("foward:" + "/swagger-ui/index.html");
	}	
	
	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
			.info(new Info().title(this.name)
					.description(this.description)
					.version(this.version))
					.externalDocs(new ExternalDocumentation()
							.description("CRUD DOCUMENTACAO")
							.url("http://teste.com"));
	}
	
}
