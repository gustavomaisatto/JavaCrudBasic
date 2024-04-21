package com.crud.teste.domain.user;

import jakarta.persistence.*;
import lombok.*;

/**
 * User
 */
@Table(name = "users")
@Entity(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String email;
    public Users(RequestUser requestUser) {
        this.email = requestUser.email();
    }
}
