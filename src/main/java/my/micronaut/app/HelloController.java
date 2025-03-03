package my.micronaut.app;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;


@Controller
public class HelloController {

    @Get("/") // Handles GET requests to /hello
            public String sayHello() {
                return "Hello Micronaout!";
            }
}