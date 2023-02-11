package com.rentx.api.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
public class CarDto {
        private UUID id;
        private String name;
        private String description;
        private Integer daily_rate;
        private String license_plate;
        private BigDecimal fine_amount;
        private String brand;
        private UUID category_id;
}
