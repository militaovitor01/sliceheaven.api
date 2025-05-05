package br.com.sliceheaven.sliceheaven.api.Drink;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DrinkUpdateDTO(
        @NotNull
        Long id,

        @NotBlank
        String name,

        @NotNull
        Double price,

        Integer discount
) {} 