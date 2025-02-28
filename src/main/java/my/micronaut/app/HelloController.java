package my.micronaut.app;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;


// Testo controller with get request 
@Controller("/hello")
public class HelloController {
    @Get("/") // Handles GET requests to /hello
    public String sayHello() {
        return "Hello, KArthik!";
    }
}
