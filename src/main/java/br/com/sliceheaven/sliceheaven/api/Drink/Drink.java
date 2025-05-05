package br.com.sliceheaven.sliceheaven.api.Drink;

import br.com.sliceheaven.sliceheaven.api.Additionals.Additionals;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Table(name = "drinks")
@Entity(name = "Drink")
@NoArgsConstructor
public class Drink extends Additionals {

}
