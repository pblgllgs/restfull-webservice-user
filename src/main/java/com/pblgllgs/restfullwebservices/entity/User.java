package com.pblgllgs.restfullwebservices.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "User")
@Table(
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "email_UK",
                        columnNames = "email"
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            nullable = false,
            name = "first_name"
    )
    private String firstName;

    @Column(
            nullable = false,
            name = "last_name"
    )
    private String lastName;

    @Column(
            nullable = false,
            name = "email"
    )
    private String email;
}
