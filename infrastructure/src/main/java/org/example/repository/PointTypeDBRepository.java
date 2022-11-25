package org.example.repository;

import org.example.domain.common.PointType;
import org.example.domain.common.repository.PointTypeRepository;
import org.example.model.PointTypeEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PointTypeDBRepository implements PointTypeRepository {
    @Autowired
    private PointTypeJPARepository repository;
    @Override
    public List<PointType> getAll() {
        List<PointType> allPointType = new ArrayList<>();
        for (PointTypeEntity e: repository.findAll()) {
            PointType type = new PointType();
            BeanUtils.copyProperties(e,type);
            allPointType.add(type);
        }
        return allPointType;
    }

    @Override
    public UUID save(PointType type) {
        PointTypeEntity t = repository.save(new PointTypeEntity(type.getType(), type.getDescription()));
        return t.getTypeId();
    }

    @Override
    public Optional<PointType> findById(UUID id) {
        Optional<PointTypeEntity>optionalPointTypeEntity =  repository.findById(id);
        Optional<PointType> optionalPointType = Optional.empty();
        if (optionalPointTypeEntity.isPresent()) {
            PointTypeEntity typeEntity = optionalPointTypeEntity.get();
            PointType type = new PointType();
            BeanUtils.copyProperties(typeEntity, type);
            optionalPointType = Optional.ofNullable(type);
        }

        return optionalPointType;
    }
}