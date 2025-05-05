package br.com.sliceheaven.sliceheaven.api.Pizza;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record PizzaUpdateDTO(
        @NotNull
        Long id,

        @NotBlank
        String name,

        @NotNull
        BigDecimal price,

        Integer discount
) {
}
