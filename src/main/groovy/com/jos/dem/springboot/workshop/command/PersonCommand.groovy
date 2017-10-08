package com.jos.dem.springboot.workshop.command

import javax.validation.constraints.Size
import javax.validation.constraints.NotNull
import org.hibernate.validator.constraints.Email

class PersonCommand implements Command {

  @NotNull
  @Size(min=3, max=50)
  String nickname

  @Email
  @NotNull
  @Size(min=1, max=250)
  String email
}
