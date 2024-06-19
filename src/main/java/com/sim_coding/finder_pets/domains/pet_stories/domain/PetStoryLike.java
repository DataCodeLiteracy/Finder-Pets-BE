package com.sim_coding.finder_pets.domains.pet_stories.domain;

import com.sim_coding.finder_pets.common.config.UUIDGenerator;
import com.sim_coding.finder_pets.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@EntityListeners(UUIDGenerator.class)
@Getter
@Setter
public class PetStoryLike extends BaseEntity {

    @Id
    @Column(name = "like_id")
    private String id;

    @Column(name = "is_like")
    private boolean isLike;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private PetStories petStories;

}
