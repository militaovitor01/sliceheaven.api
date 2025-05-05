package br.com.sliceheaven.sliceheaven.api.Additionals;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record AdditionalsDTO(
        Long id,

        @NotBlank
        String name,

        String description,

        @NotNull
        Double price,

        @NotBlank
        String imageUrl,
        String category,
        Boolean featured,
        Integer discount,
        LocalDateTime createdAt
) {
    public AdditionalsDTO(Additionals additional){
        this(
                additional.getId(),
                additional.getName(),
                additional.getDescription(),
                additional.getPrice(),
                additional.getImageUrl(),
                additional.getCategory(),
                additional.getFeatured(),
                additional.getDiscount(),
                additional.getCreatedAt()
        );
    }
}
