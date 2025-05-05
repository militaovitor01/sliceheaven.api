package br.com.sliceheaven.sliceheaven.api.Desserts;

import br.com.sliceheaven.sliceheaven.api.Additionals.Additionals;
import br.com.sliceheaven.sliceheaven.api.Additionals.AdditionalsDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Table(name = "desserts")
@Entity(name = "Dessert")
@NoArgsConstructor
public class Dessert extends Additionals {

    public Dessert(AdditionalsDTO data) {
        super(data);
    }

    public void updateData(DessertUpdateDTO data) {
        if(data.name() != null) {
            this.name = data.name();
        }

        if(data.price() != null) {
            this.price = data.price();
        }

        if(data.discount() != null) {
            this.discount = data.discount();
        }
    }
}