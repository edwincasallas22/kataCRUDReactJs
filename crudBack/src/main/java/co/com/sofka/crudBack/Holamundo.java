package co.com.sofka.crudBack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holamundo {
    @RequestMapping("/")
    public String hola(){
        return  "Hola Edwin :D";
    }
}
