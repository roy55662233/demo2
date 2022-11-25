package org.example.domain.common.repository;


import org.example.domain.common.PointType;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointTypeRepository {
    List<PointType> getAll();
    UUID save(PointType type);
    Optional<PointType> findById(UUID id);
}
