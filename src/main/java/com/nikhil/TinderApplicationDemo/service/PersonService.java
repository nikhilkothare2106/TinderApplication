package com.nikhil.TinderApplicationDemo.service;

import com.nikhil.TinderApplicationDemo.entity.Person;
import com.nikhil.TinderApplicationDemo.repo.TinderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    TinderRepo tinderRepo;

    public Person addAccount(Person person){
        return tinderRepo.save(person);
    }
    public List<Person> filterDataBasedOnGender(String gender) {
        List<Person> list = tinderRepo.findAll();
        List<Person> temp = new ArrayList<>();
        for (Person obj : list) {
            if (!gender.equalsIgnoreCase(obj.getGender())) {
                temp.add(obj);
            }
        }
        return temp;
    }
}
