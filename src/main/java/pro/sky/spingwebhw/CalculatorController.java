package pro.sky.spingwebhw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping(path =  "/calculator")
    public String hello(){
        return calculatorService.calculator();
    }
    @GetMapping(path =  "/calculator/plus")
    public String pus (@RequestParam("num1") int number1,@RequestParam("num2") int number2) {
        return calculatorService.plus(number1,number2 );
    }
    @GetMapping(path =  "/calculator/minus")
    public String minus(@RequestParam("num1") int number1,@RequestParam("num2") int number2) {
        return calculatorService.minus(number1,number2 );
    }
    @GetMapping(path =  "/calculator/multiply")
    public String multiply(@RequestParam("num1") int number1,@RequestParam("num2") int number2) {
        return calculatorService.multiply(number1,number2 );
    }
    @GetMapping(path =  "/calculator/divide")
    public String divide(@RequestParam("num1") int number1,@RequestParam("num2") int number2) {
        return calculatorService.divide(number1,number2 );
    }
}
