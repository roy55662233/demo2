package org.example.domain.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointType {
    private UUID typeId;
    private String type;
    private String description;

    public PointType(String type, String description) {
        this.type = type;
        this.description = description;
    }
}