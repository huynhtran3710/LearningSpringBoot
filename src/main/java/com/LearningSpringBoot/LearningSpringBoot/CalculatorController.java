package com.LearningSpringBoot.LearningSpringBoot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    private double result = 0;

    @GetMapping("/calculate")
    public double calculate(@RequestParam("num01") double num1, @RequestParam double num2, @RequestParam char operator) {

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("num1 + num2 = " + num1 + " + " + num2);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("num1 + num2 = " + num1 + " + " + num2);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("num1 + num2 = " + num1 + " + " + num2);
                break;
            case '/' :
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
               else{
                   result = num1 / num2;
                    System.out.println("num1 + num2 = " + num1 + " + " + num2);
                }
        };
        return result;
    }
}