package com.sim_coding.finder_pets;

import com.sim_coding.finder_pets.domains.user.domain.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserEntityTest {

    @PersistenceContext
    private EntityManager em;

    @Test
    @Transactional
    @Commit
    public void testUUIDGeneration() {
        // Given
        Users user = new Users();
        user.setEmail("test@example.com");
        user.setPassword("password");
        user.setName("Test User");
        user.setPhone("123-456-7890");
        user.setNickname("Tester");
        user.setIntro("Intro");

        // When
        em.persist(user);
        em.flush();

        // Then
        assertNotNull(user.getId(), "UUID should be generated and not null");
        assertTrue(user.getId().length() > 0, "UUID should be a valid string");
    }
}
