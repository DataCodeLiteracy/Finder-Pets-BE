package com.sim_coding.finder_pets.domains.pet_stories.domain;

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
public class PetStories extends BaseEntity {

    @Id
    @Column(name = "board_id")
    private String id;

    private String title;
    private String description;
    private int views;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

}
