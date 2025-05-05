package br.com.sliceheaven.sliceheaven.api.Controller;

import br.com.sliceheaven.sliceheaven.api.Additionals.AdditionalsDTO;
import br.com.sliceheaven.sliceheaven.api.Desserts.DessertsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/desserts")
public class DessertController {

    @Autowired
    private DessertsRepository repository;

    @PostMapping @Transactional
    public void registerDessert(){

    }

    @GetMapping
    public Page<AdditionalsDTO> getDessert(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable){
        return repository.findAll(pageable).map(AdditionalsDTO::new);
    }

    @PutMapping @Transactional
    public void updateDessert(){

    }

    @DeleteMapping("/{id}") @Transactional
    public void deleteDessert(){

    }
}
