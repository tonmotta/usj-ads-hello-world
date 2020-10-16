package br.edu.usj.ads.lpii.helloworld;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWorld {

@GetMapping(value="HelloWorld")
public ModelAndView getHelloWorld() {
    ModelAndView modelAndView = new ModelAndView("hello-world");
    
    return modelAndView;

}


}