package com.dem.kek.repository;

import com.dem.kek.model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface QuizRepository extends MongoRepository<Quiz, Integer> {
    @Query("{id:'?0'}")
    Quiz findQuizById(Integer id);
}
