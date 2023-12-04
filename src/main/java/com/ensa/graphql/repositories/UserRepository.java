package com.ensa.graphql.repositories;

import com.ensa.graphql.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
