package org.example.infrastructure;


import org.example.domain.common.PointType;
import org.example.model.PointTypeEntity;
import org.example.repository.PointTypeJPARepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PointTypeJPARepositorTest {

    @Autowired
    private PointTypeJPARepository repository;

    @Test
    void repositoryShouldNotBeNull() {
        assertNotNull(repository);
    }

    @Test
    void savePointTypeAndCheck() {
        PointTypeEntity t = repository.save(new PointTypeEntity("個人課", "90 minutes"));
        assertThat(repository.findById(t.getTypeId())).isNotNull();
    }
}
