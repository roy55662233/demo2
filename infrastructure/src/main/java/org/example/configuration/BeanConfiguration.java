package org.example.configuration;

import org.example.domain.common.repository.PointTypeRepository;
import org.example.domain.common.service.PointTypeService;
import org.example.domain.common.service.PointTypeServiceImpl;
import org.example.repository.PointTypeDBRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    PointTypeService pointTypeService(PointTypeRepository repository) {
        return new PointTypeServiceImpl(repository);
    }

    @Bean
    PointTypeRepository pointTypeRepository() {
        //return new PointTypeMemRepository();
        return new PointTypeDBRepository();
    }
}
