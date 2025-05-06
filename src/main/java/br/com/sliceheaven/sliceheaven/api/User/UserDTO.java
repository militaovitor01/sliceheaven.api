package br.com.sliceheaven.sliceheaven.api.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.sql.Timestamp;

public record UserDTO(
        Long id,

        @NotBlank
        String name,

        @NotBlank @Email
        String email,

        @NotBlank
        String password_hash,
        String address,

        @NotBlank
        String phone,
        Timestamp created_at
) {
    public UserDTO(User user){
        this(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword_hash(),
                user.getAddress(),
                user.getPhone(),
                user.getCreated_at()
        );
    }
}
