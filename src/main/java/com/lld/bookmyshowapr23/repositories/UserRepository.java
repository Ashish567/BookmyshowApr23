package com.lld.bookmyshowapr23.repositories;

import com.lld.bookmyshowapr23.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    Optional<User> findById(Integer integer);
}

// class

// select * from users where id = ? ;