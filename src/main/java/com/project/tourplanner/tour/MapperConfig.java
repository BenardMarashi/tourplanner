package com.project.tourplanner.tour;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper{};
    }
    
}