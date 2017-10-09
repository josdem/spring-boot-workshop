Spring Boot Workshop
----------------------------------------------

This repository show you how to create a basic project using Spring Boot and this topics:

* Building a basic MVC Spring Boot project
* Adding Spring Data JPA
* Model validation with Hibernate Validator
* Adding Thymeleaf
* Adding Bootstrap

#### Create Project

In order to create a basic Spring Boot project you need to install [SDKMAN](http://sdkman.io/) if you are using Linux or Mac, or [posh-gvm](https://github.com/flofreud/posh-gvm) if you are using Windows. After that you can easily install:

* Spring Boot
* Groovy
* Gradle

Then execute this command in your terminal.


```bash
spring init --dependencies=web --language=groovy --build=gradle spring-boot-workshop
```

#### To Run the Project

```bash
gradle bootRun
```

#### Read this as Reference


* http://josdem.io/techtalk/spring/spring_boot/
* http://josdem.io/techtalk/spring/spring_boot_thymeleaf/
* http://josdem.io/techtalk/spring/spring_boot_internationalization/
* http://josdem.io/techtalk/spring/spring_boot_bower_plugin/
* http://josdem.io/techtalk/spring/spring_boot_validation/

