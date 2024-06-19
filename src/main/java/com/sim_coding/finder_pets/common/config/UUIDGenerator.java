package com.sim_coding.finder_pets.common.config;

import jakarta.persistence.PrePersist;

import java.util.UUID;

public class UUIDGenerator {

    @PrePersist
    public void prePersist(Object entity) {
        if(entity instanceof Identifiable identifiable) {
            if(identifiable.getId() == null) {
                identifiable.setId(UUID.randomUUID().toString());
            }
        }
    }
}
