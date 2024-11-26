package com.nikhil.TinderApplicationDemo.controller;

import com.nikhil.TinderApplicationDemo.entity.Person;
import com.nikhil.TinderApplicationDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tinder")
public class TinderController {

    @Autowired
    PersonService personService;

    @GetMapping("/getPerson")
    public List<Person> getAllPerson(@RequestParam String gender) {
        List<Person> list = personService.filterDataBasedOnGender(gender);
        return list;
    }

    @PostMapping("/create-person")
    public Person createUser(@RequestBody Person person) {
        return personService.addAccount(person);
    }
}
