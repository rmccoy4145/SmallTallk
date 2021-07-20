package com.mccoy.smalltalk.repository;

import com.mccoy.smalltalk.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<User, Long> {
}
