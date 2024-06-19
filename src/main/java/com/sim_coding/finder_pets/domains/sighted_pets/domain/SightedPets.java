package com.sim_coding.finder_pets.domains.sighted_pets.domain;

import com.sim_coding.finder_pets.common.config.UUIDGenerator;
import com.sim_coding.finder_pets.common.entity.BaseEntity;
import com.sim_coding.finder_pets.domains.user.domain.Users;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@EntityListeners(UUIDGenerator.class)
@Getter
@Setter
public class SightedPets extends BaseEntity {

    @Id
    @Column(name = "pet_id")
    private String id;

    private String animal;
    private String kind;
    private String gender;
    private Long weight;
    private String color;
    private int age;
    private boolean is_neutering;
    private String character;
    private String date;
    private String area;
    private String phone;
    private String description;
    private int views;

    @Column(name = "is_completed")
    private boolean isCompleted;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;
}
