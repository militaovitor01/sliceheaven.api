package br.com.sliceheaven.sliceheaven.api.Controller;

import br.com.sliceheaven.sliceheaven.api.Additionals.AdditionalsDTO;
import br.com.sliceheaven.sliceheaven.api.Drink.Drink;
import br.com.sliceheaven.sliceheaven.api.Drink.DrinkRepository;
import br.com.sliceheaven.sliceheaven.api.Drink.DrinkUpdateDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drinks")
public class DrinkController {

    @Autowired
    private DrinkRepository repository;

    @PostMapping @Transactional
    public void registerDrink(@RequestBody @Valid AdditionalsDTO data) {
        repository.save(new Drink(data));
    }

    @GetMapping
    public Page<AdditionalsDTO> getDrink(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable) {
        return repository.findAll(pageable).map(AdditionalsDTO::new);
    }

    @PutMapping @Transactional
    public void updateDrink(@RequestBody @Valid DrinkUpdateDTO data) {
        var drink = repository.getReferenceById(data.id());
        drink.updateData(data);
    }

    @DeleteMapping("/{id}") @Transactional
    public void deleteDrink() {
    }
}
