package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - Spring Cloud OpenFeign
 *
 * Para executar o projeto no terminal, digite o seguinte comando:
 * mvn spring-boot:run
 *
 * Após executar o comando acima, basta apenas abrir o seguinte endereço e
 * visualizar a execução do projeto:
 * http://localhost:8080/swagger-ui.html
 *
 * Para acessar o banco de dados em memória H2, acesse o seguinte endereço:
 * http://localhost:8080/h2-console
 *
 * Segue abaixo as credenciais de acesso ao banco de dados H2:
 * - JDBC URL: jdbc:h2:mem:db
 * - User Name: sa
 * - Password: sa12345
 *
 * @author AninhaParidni
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
