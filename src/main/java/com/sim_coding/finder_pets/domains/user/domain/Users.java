package com.sim_coding.finder_pets.domains.user.domain;

import com.sim_coding.finder_pets.common.config.UUIDGenerator;
import com.sim_coding.finder_pets.common.entity.BaseEntity;
import com.sim_coding.finder_pets.domains.lost_pets.domain.LostPets;
import com.sim_coding.finder_pets.domains.my_pets.domain.MyPets;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@EntityListeners(UUIDGenerator.class)
@Getter
@Setter
public class Users extends BaseEntity {

    @Id
    @Column(name = "user_id")
    private String id;

    private String email;
    private String password;
    private String name;
    private String phone;
    private String nickname;
    private String intro;

    @Column(name ="profile_image")
    private String profileImage;

    @Column(name = "like_animal")
    private String likeAnimal;

    @Column(name = "like_area")
    private String likeArea;

    @Column(name = "kind")
    private String likeKind;

    @OneToMany(mappedBy = "user")
    private List<MyPets> myPets;

    @OneToMany(mappedBy = "user")
    private  List<LostPets> lostPets;

}
