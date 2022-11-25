package org.example.domain.common;


import org.example.domain.common.repository.PointTypeRepository;
import org.example.domain.common.service.PointTypeService;
import org.example.domain.common.service.PointTypeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class PointTypeServiceUnitTest {
    private PointTypeRepository repository;
    private PointTypeService service;

    @BeforeEach
    void prepare() {
        repository = mock(PointTypeRepository.class);
        when(repository.save(ArgumentMatchers.any(PointType.class))).thenReturn(UUID.randomUUID());
        service = new PointTypeServiceImpl(repository);
    }

    @Test
    void domainTest1() {
        PointType type = new PointType("type1","desc1");
        UUID id = service.createPointType(type);
        System.out.println("UUID:"+id);
        assertNotNull(id);
    }

    @Test
    void domainTest2() {
        service.allTypes();
        verify(repository).getAll();
    }
}
