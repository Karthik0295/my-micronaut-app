package my.micronaut.app;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hello")
public class HelloController {
    @Get("/") // Handles GET requests to /hello
    public String sayHello() {
        return "Hello, KArthik!";
    }
}


// package my.micronaut.app;

// import io.micronaut.http.MediaType;
// import io.micronaut.http.annotation.Controller;
// import io.micronaut.http.annotation.Get;


// @Controller("/hello")
// public class HelloController {

//     // this empty constructor is not
//     // needed, but isn't a problem...
//     HelloController() {
//     }

//     @Get(value = "/", produces = MediaType.TEXT_PLAIN)
//     String getTest() {
//         return "some string";
//     }
// }