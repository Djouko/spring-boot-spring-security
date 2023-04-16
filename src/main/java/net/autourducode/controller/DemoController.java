package net.autourducode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author autourducode
 */
@RestController
@RequestMapping("/demo/")
public class DemoController {

    @GetMapping("/protected")
    public String helloSecure() {
        return "Hello Autour Du Code protected !";
    }

    @GetMapping("/public")
    public String helloPublic() {
        return "Hello Autour Du Code public!";
    }

    @GetMapping("/user")
    public String helloUser() {
        return "Hello Autour Du Code user!";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello Autour Du Code ADMIN!";
    }
}
