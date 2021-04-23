package io.github.ronadobarros.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientesAppication {

    /*
    @Bean  //metodo para apenas para teste, testar incersão
    public CommandLineRunner run(@Autowired ClienteRepository repository){
        return args -> {
            Cliente cliente = Cliente.builder().cpf("99836211187").nome("Ronaldo").build();
            repository.save(cliente);
        };
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ClientesAppication.class, args);
    }
}
