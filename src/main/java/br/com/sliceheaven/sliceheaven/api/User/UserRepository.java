package br.com.sliceheaven.sliceheaven.api.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Page<User> findAllByActiveTrue(Pageable pageable);
}
