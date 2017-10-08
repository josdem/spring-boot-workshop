package com.jos.dem.springboot.workshop

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired

import com.jos.dem.springboot.workshop.repository.PersonRepository

@Controller
class PersonController{

  @Autowired
  PersonRepository personRepository

  @RequestMapping('/')
  String index(){
    'index'
  }

}
