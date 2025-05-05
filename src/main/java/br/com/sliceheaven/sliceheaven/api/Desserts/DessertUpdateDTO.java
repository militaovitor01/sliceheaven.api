package br.com.sliceheaven.sliceheaven.api.Desserts;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DessertUpdateDTO(
        @NotNull
        Long id,

        @NotBlank
        String name,

        @NotNull
        Double price,

        Integer discount
) {} 