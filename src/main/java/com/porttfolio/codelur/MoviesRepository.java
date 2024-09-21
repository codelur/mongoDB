package com.porttfolio.codelur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MoviesRepository extends MongoRepository<Movies, String> {
    // Custom query methods can be defined here if needed
}
