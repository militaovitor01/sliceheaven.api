package br.com.sliceheaven.sliceheaven.api.Pizza;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.sql.Timestamp;

public record PizzaDTO(
        Long id,

        @NotBlank
        String name,

        String description,

        @NotNull
        BigDecimal price,

        @NotBlank
        String imageUrl,

        String category,
        String subCategory,
        Boolean featured,
        BigDecimal rating,
        Integer discount,
        Timestamp createdAt
) {
    public PizzaDTO(Pizza pizza) {
        this(
                pizza.getId(),
                pizza.getName(),
                pizza.getDescription(),
                pizza.getPrice(),
                pizza.getImageUrl(),
                pizza.getCategory(),
                pizza.getSubCategory(),
                pizza.getFeatured(),
                pizza.getRating(),
                pizza.getDiscount(),
                pizza.getCreatedAt()
        );
    }
}
