package com.rentx.api.controller;

import com.rentx.api.ApiApplication;
import com.rentx.api.models.Car;
import com.rentx.api.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;



@ContextConfiguration(classes = ApiApplication.class)
@SpringBootTest(classes = ApiApplication.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@WebMvcTest(CarController.class)
public
class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CarRepository repository;

    @Test
    void find() {
    }

    @Test
    void create() throws Exception {
        Car car = new Car(
                11,"Audi Exemplo",
                "Carro potente e resiliente",
                22.2,
                "ULN-2411",
                0.0,
                "Audi"
        );

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/carros")
                        .content(String.valueOf(car))
                        .content(String.valueOf(MediaType.APPLICATION_JSON))
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists());
    }
}