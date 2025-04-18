package group.taskmanager.TaskManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
@EnableWebSecurity(debug = true)
public class TaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

/*	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
				.csrf(csrf -> csrf.disable());
		http
				.authorizeHttpRequests((authorize) -> authorize
						.requestMatchers("/auth/login", "/auth/registration", "/error").permitAll()
						.anyRequest().authenticated() // Все остальные запросы должны быть авторизованы
				);

		http.formLogin(fL -> {
			fL
					.loginPage("/auth/login")
					.loginProcessingUrl("/process_login")
					.defaultSuccessUrl("/login", true)
					.failureUrl("/auth/login?error");
		});

		http.logout(l -> {
			l
					.logoutUrl("/logout")
					.logoutSuccessUrl("/auth/login");
		});

		return http.build();
	}*/
}
