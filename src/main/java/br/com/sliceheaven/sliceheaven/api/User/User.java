package br.com.sliceheaven.sliceheaven.api.User;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Table(name = "users")
@Entity(name = "User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password_hash;
    private String address;
    private String phone;
    private Timestamp created_at;
    private Boolean active = false;

    public User(UserDTO data){
        this.id = data.id();
        this.name = data.name();
        this.email = data.email();
        this.password_hash = data.password_hash();
        this.address = data.address();
        this.phone = data.phone();
        this.created_at = data.created_at();
        this.active = true;
    }

    public void delete(){
        this.active = false;
    }
}
