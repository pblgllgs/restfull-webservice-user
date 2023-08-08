package com.pblgllgs.restfullwebservices;

import com.github.javafaker.Faker;
import com.pblgllgs.restfullwebservices.entity.User;
import com.pblgllgs.restfullwebservices.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestfullWebservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfullWebservicesApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> generate(20, userRepository);
    }

    private void generate(int quantity, UserRepository userRepository) {
        for (int i = 0; i < quantity; i++) {
            Faker faker = new Faker();
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            User user = User.builder()
                    .id(faker.number().randomNumber())
                    .firstName(firstName)
                    .lastName(lastName)
                    .email(firstName + "." + lastName + "@gmail.com")
                    .build();
            userRepository.save(user);
        }
    }

}
