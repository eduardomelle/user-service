package com.dailycodebuffer.user.controller;

import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping("/")
  public User saveUser(@RequestBody User user) {
    log.info("Inside saveUser method of UserController");
    return userService.saveUser(user);
  }

}