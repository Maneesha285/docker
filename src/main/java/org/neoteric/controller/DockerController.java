package org.neoteric.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping(value = "/docker")
    public String getdocker(){
        return "This is Docker";
    }
}

