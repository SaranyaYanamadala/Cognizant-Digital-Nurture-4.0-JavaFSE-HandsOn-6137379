package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByName() {
        // Arrange
        User user1 = new User(1L, "Saranya");
        User user2 = new User(2L, "Deepika");
        User user3 = new User(3L, "Anu");
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        // Act
        List<User> alices = userRepository.findByName("Saranya");

        // Assert
        assertThat(alices).hasSize(2);
        assertThat(alices.get(0).getName()).isEqualTo("Anu");
        assertThat(alices.get(1).getName()).isEqualTo("Anu");
    }
}
