package com.ahmed.movies_api.Repo;

import com.ahmed.movies_api.entity.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository

public interface ReviewRepository extends MongoRepository<Review , ObjectId> {
}
