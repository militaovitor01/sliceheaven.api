package br.com.sliceheaven.sliceheaven.api.Desserts;

import br.com.sliceheaven.sliceheaven.api.Additionals.Additionals;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Table(name = "desserts")
@Entity(name = "Dessert")
@NoArgsConstructor
public class Dessert extends Additionals {

}