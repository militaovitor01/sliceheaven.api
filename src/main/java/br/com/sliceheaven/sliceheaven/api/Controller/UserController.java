package br.com.sliceheaven.sliceheaven.api.Controller;

import br.com.sliceheaven.sliceheaven.api.Pizza.PizzaDTO;
import br.com.sliceheaven.sliceheaven.api.Pizza.PizzaUpdateDTO;
import br.com.sliceheaven.sliceheaven.api.User.User;
import br.com.sliceheaven.sliceheaven.api.User.UserDTO;
import br.com.sliceheaven.sliceheaven.api.User.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping @Transactional
    public void registerUser(@RequestBody @Valid UserDTO data){
        repository.save(new User(data));
    }

    @GetMapping
    public Page<UserDTO> getUser(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable){
        return repository.findAllByActiveTrue(pageable).map(UserDTO::new);
    }

    @DeleteMapping("/{id}") @Transactional
    public void deleteUser(@PathVariable Long id){
        var user = repository.getReferenceById(id);
        user.delete();
    }
}
