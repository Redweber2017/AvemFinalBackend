package com.redweber.backendserverAMEM.particulars;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface KitRepository extends MongoRepository<Kit, String> {

}