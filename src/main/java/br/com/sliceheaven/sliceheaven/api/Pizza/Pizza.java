package br.com.sliceheaven.sliceheaven.api.Pizza;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table(name = "pizzas")
@Entity(name = "Pizza")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pizza {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;
    private String category;
    private String subCategory;
    private Boolean featured;
    private BigDecimal rating;
    private Integer discount;
    private Timestamp createdAt;

    public Pizza(PizzaDTO data) {
        this.id = data.id();
        this.name = data.name();
        this.description = data.description();
        this.price = data.price();
        this.imageUrl = data.imageUrl();
        this.category = data.category();
        this.subCategory = data.subCategory();
        this.featured = data.featured();
        this.rating = data.rating();
        this.discount = data.discount();
        this.createdAt = data.createdAt();
    }

}
