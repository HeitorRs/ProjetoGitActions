package info.heitor.projetogithubactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/heitor")
    public String heitor() {
        return "Testando endpoint heitor";
    }
}
