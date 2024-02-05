package com.easybytes.accounts;

import com.easybytes.accounts.audit.AuditAwareImpl;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "EasyBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name= "majohnc",
						email = "majohnc@hotmail.com",
						url = "https://majohnc.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://majohnc.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EasyBank Accounts microservice REST API Documentation",
				url = "http://localhost:8080/swagger-ui/index.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

	@Bean
	public AuditorAware<String> auditorProvider() {
		// our implementation of AuditorAware
		return new AuditAwareImpl();
	}

}
