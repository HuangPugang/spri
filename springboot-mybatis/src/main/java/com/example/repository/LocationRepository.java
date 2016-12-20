package com.example.repository;

import com.example.domain.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by paul on 16/11/25.
 */
public interface LocationRepository extends MongoRepository<Location, String> {
}
