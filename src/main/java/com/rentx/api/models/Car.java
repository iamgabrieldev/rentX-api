package com.rentx.api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 255)
    @NotEmpty(message = "Nome é obrigatório")
    private String name;

    @Column(name ="description")
    @NotEmpty(message = "Descrição é obrigatório")
    private String description;

    @Column(name = "daily_rate")
    private Double daily_rate;

    @Column(name = "license_plate", unique = true)
    private String license_plate;

    @Column(name = "fine_amount")
    private Double fine_amount;

    @Column(name = "brand")
    @NotEmpty(message = "Modelo do carro é obrigatório")
    private String brand;

}
