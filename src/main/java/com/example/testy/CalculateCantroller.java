package com.example.testy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculateCantroller {
    private final CalculateSevice calculateSevice;

    public CalculateCantroller(CalculateSevice calculateSevice) {
        this.calculateSevice = calculateSevice;
    }

    @GetMapping
    public String welcome() {
        return calculateSevice.welcome();
    }
@GetMapping("/plus")
    public int plus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculateSevice.plus(number1, number2);
    }
@GetMapping("/minus")
    public int minus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculateSevice.minus(number1, number2);
    }

@GetMapping("/multiplay")
    public int multiplay(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculateSevice.multiplay(number1, number2);
    }
@GetMapping("/devide")
    public int devide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) throws InCorrectArgumentsExeptions {
        return calculateSevice.devide(number1, number2);
    }
}
