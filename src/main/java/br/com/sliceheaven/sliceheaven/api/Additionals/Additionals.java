package br.com.sliceheaven.sliceheaven.api.Additionals;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Additionals {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String name;
    protected String description;
    protected Double price;

    @Column(name = "image_url")
    protected String imageUrl;

    protected String category;
    protected Boolean featured;
    protected Integer discount;

    @Column(name = "created_at")
    protected LocalDateTime createdAt = LocalDateTime.now();

    public Additionals(AdditionalsDTO data){
        this.id = data.id();
        this.name = data.name();
        this.description = data.description();
        this.price = data.price();
        this.imageUrl = data.imageUrl();
        this.category = data.category();
        this.featured = data.featured();
        this.discount = data.discount();
        this.createdAt = data.createdAt();
    }

}
