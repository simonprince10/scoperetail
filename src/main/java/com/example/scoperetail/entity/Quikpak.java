package com.example.scoperetail.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "quikpak_Info")
@NoArgsConstructor
public class Quikpak {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String department;

    private String description;

    private String price;

//    @Column(nullable = false, unique = true)
    private String email;
}
