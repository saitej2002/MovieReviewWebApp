package com.moviesproject.moviesapi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoAdminOperations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
