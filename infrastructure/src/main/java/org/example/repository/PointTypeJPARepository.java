package org.example.repository;

import org.example.model.PointTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PointTypeJPARepository extends JpaRepository<PointTypeEntity, UUID> {
}