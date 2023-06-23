package com.rest.springrest.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
            Student mubi = new Student(
                    1L,"Mubbashir","mubashir@gmail.com", LocalDate.of(2001,05,2)
            );
            Student shakeel = new Student(
                    2L,"Shakeel","shakeel@gmail.com", LocalDate.of(1972,05,2)
            );
            repository.saveAll(
                    List.of(mubi,shakeel)
            );

        };
    };
}
