package br.com.sliceheaven.sliceheaven.api.Controller;

import br.com.sliceheaven.sliceheaven.api.Pizza.PizzaDTO;
import br.com.sliceheaven.sliceheaven.api.Pizza.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired
    private PizzaRepository repository;

    @PostMapping @Transactional
    public void registerPizza(){

    }

    @GetMapping
    public Page<PizzaDTO> getPizza(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable){
        return repository.findAll(pageable).map(PizzaDTO::new);
    }

    @PutMapping @Transactional
    public void updatePizza(){

    }

    @DeleteMapping("/{id}") @Transactional
    public void deletePizza(){

    }
}
