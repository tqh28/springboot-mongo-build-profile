package com.example.springmongo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springmongo.model.Animal;

public interface AnimalRepository extends MongoRepository<Animal, String> {

	Animal findBy_id(ObjectId _id);

}
