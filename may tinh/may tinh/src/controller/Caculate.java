package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Caculate {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping(value = "/calculate",method = RequestMethod.GET)
    public String calculate(@RequestParam double number1, @RequestParam double number2,@RequestParam String operator, Model model){
        double result = 0;
        switch (operator){
            case "addition(+)":
              result = number1 + number2;
                break;
            case "subtraction(-)":
                result =number1 - number2;
                break;
            case "multiplication(x)":
                result = number1*number2;
                break;
            case "division(/)":
                result = number1 / number2;
                default:
        }
        model.addAttribute("result",result);
return "home";

    }

}
