package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PointTypeEntity {
    @Id
    @GeneratedValue(generator="UUID")
    private UUID typeId;
    private String type;
    private String description;

    public PointTypeEntity(String type, String description) {
        this.type = type;
        this.description = description;
    }
}