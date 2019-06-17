package com.wcs.SpringSecurityQuest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String shieldAgent() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String adminHello() {
        return "La loupe, Orlean, Bordeaux, Lyon, Toulouse, Lille, Strasbourg, Paris, " +
                "Reims, Biarritz, Marseille, Tours, Lisboa, Madrid, Berlin, Nantes, Bruxelles";
    }
}
