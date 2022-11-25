package org.example.domain.common.service;


import org.example.domain.common.PointType;

import java.util.List;
import java.util.UUID;

public interface PointTypeService {
    UUID createPointType(PointType type);
    List<PointType> allTypes();
}
