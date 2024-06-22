package com.derekdiniz.allsimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.derekdiniz.allsimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    

}
