package com.slomek.CoupleMe.user.controller;

import com.slomek.CoupleMe.user.domain.User;
import com.slomek.CoupleMe.user.infrastructure.UserRepository;
import com.slomek.CoupleMe.response.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final String TEMPLATE = "";
    private static long counter = 0;

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/{username}")
    User get(
            @PathVariable String username
    ) {
        return userRepository.findByUsername(username).orElseThrow(
                () -> new UserNotFoundException(username)
        );
    }

    @PostMapping
    User add(@RequestBody User input) {
        return this.userRepository.save(input);


    }

//    private Optional<T> validateUser(String username) {
//        this.userRepository.findByUsername()
//    }
}
