package ru.gpb.microservice1.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GotMethodController {
    private static final Logger logger = LoggerFactory.getLogger(GotMethodController.class);

    @RequestMapping("/")
    public String index() {
        logger.info("got indexRequest in Microservice1");
        return "Greetings from Microservice1";
    }

    //http://localhost:8080/1
    @RequestMapping(method = RequestMethod.GET, value = "/{methodNumber}")
    public String callMethod(@PathVariable("methodNumber") String name) {
        switch (name) {
            case "1":
                method1();
                return "Greetings from Microservice1::method1";
            case "2":
                method2();
                return "Greetings from Microservice1::method2";
            case "3":
                method3();
                return "Greetings from Microservice1::method3";
            default:
                logger.info("Not got any method :(");
                break;
        }
        return "Not got any method in Microservice1 :(";
    }

    private void method1() {
        logger.info("got method1 in Microservice1");
    }

    private void method2() {
        logger.info("got method2 in Microservice1");
    }

    private void method3() {
        logger.info("got method3 in Microservice1");
    }
}
