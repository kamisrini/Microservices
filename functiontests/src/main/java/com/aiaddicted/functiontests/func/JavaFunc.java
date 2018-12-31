package com.aiaddicted.functiontests.func;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java")
public class JavaFunc {

    @GetMapping("/passfunc")
    public String message() {
        return methodA(functionB);
    }

    public String methodA(IFunc funcB) {
        return funcB.printMessage();
    }

    IFunc functionB = () ->  "Hi, I am functionB from Java, I am passed to functionA as a parameter.";

}
