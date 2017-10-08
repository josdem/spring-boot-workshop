package com.jos.dem.springboot.workshop

import org.springframework.stereotype.Controller
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.validation.BindingResult

import com.jos.dem.springboot.workshop.model.Person
import com.jos.dem.springboot.workshop.command.PersonCommand
import com.jos.dem.springboot.workshop.repository.PersonRepository

import javax.validation.Valid

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Controller
class PersonController{

  @Autowired
  PersonRepository personRepository

  Logger log = LoggerFactory.getLogger(this.class)

  @RequestMapping('/')
  ModelAndView index(){
    log.info "Home"
    ModelAndView modelAndView = new ModelAndView('index')
    modelAndView.addObject('personCommand' , new PersonCommand())
    modelAndView
  }

  @RequestMapping('/save')
  ModelAndView save(@Valid PersonCommand personCommand, BindingResult bindingResult){
    log.info "Registering new Person: ${personCommand.nickname}"
    ModelAndView modelAndView = new ModelAndView('list')
    if (bindingResult.hasErrors()) {
      modelAndView.setViewName('index')
      modelAndView.addObject('personCommand', personCommand)
      modelAndView
    }
    Person person = new Person(nickname: personCommand.nickname, email: personCommand.email)
    personRepository.save(person)
    List<Person> persons = personRepository.findAll()
    modelAndView.addObject('persons', persons)
    modelAndView
  }

}
