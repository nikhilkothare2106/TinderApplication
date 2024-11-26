package com.nikhil.TinderApplicationDemo.repo;

import com.nikhil.TinderApplicationDemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TinderRepo extends JpaRepository<Person,Integer> {
}
