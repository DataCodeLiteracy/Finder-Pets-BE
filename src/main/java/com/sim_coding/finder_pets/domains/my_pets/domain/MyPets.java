package com.sim_coding.finder_pets.domains.my_pets.domain;

import com.sim_coding.finder_pets.common.config.UUIDGenerator;
import com.sim_coding.finder_pets.common.entity.BaseEntity;
import com.sim_coding.finder_pets.domains.lost_pets.domain.LostPets;
import com.sim_coding.finder_pets.domains.user.domain.Users;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@EntityListeners(UUIDGenerator.class)
@Getter
@Setter
public class MyPets extends BaseEntity {

    @Id
    @Column(name = "my_pet_id")
    private String id;

    private String name;

    @Column(name = "pet_animal")
    private String petAnimal;

    @Column(name = "pet_kind")
    private String petKind;

    @Column(name = "pet_gender")
    private String petGender;

    @Column(name = "pet_color")
    private String petColor;

    @Column(name = "pet_weight")
    private String petWeight;

    @Column(name = "pet_info")
    private String petInfo;

    @Column(name = "birth_day")
    private String birthDay;

    @Column(name = "adoption_day")
    private String adaptionDay;

    @Column(name = "pet_age")
    private String petAge;

    @Column(name = "is_neutering")
    private boolean isNeutering;

    @Column(name = "is_adoption")
    private boolean isAdoption;

    @Column(name = "pet_image")
    private String petImage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

    @OneToMany(mappedBy = "myPets", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LostPets> lostPets;
}
