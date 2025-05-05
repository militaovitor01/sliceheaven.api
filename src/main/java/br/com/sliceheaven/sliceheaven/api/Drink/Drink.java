package br.com.sliceheaven.sliceheaven.api.Drink;

import br.com.sliceheaven.sliceheaven.api.Additionals.Additionals;
import br.com.sliceheaven.sliceheaven.api.Additionals.AdditionalsDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Table(name = "drinks")
@Entity(name = "Drink")
@NoArgsConstructor
public class Drink extends Additionals {

    public Drink(AdditionalsDTO data) {
        super(data);
    }

    public void updateData(DrinkUpdateDTO data) {
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
