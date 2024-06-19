package com.sim_coding.finder_pets.domains.lost_pets.domain;

import com.sim_coding.finder_pets.common.config.UUIDGenerator;
import com.sim_coding.finder_pets.common.entity.BaseEntity;
import com.sim_coding.finder_pets.domains.my_pets.domain.MyPets;
import com.sim_coding.finder_pets.domains.user.domain.Users;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import java.util.List;

@Entity
@EntityListeners(UUIDGenerator.class)
@Getter
@Setter
public class LostPets extends BaseEntity {

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "my_pet_id")
    private MyPets myPets;

    @OneToMany(mappedBy = "lostPets", cascade = CascadeType.ALL)
    private List<LostLike> likes;

    @OneToMany(mappedBy = "lostPets", cascade = CascadeType.ALL)
    private List<LostComments> comments;

    @OneToMany(mappedBy = "lostPets", cascade = CascadeType.ALL)
    private List<LostImage> images;

}
