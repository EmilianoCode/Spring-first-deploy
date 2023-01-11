package com.deploy.Springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /*@Value("${app.message}") // Toma datos de application.properties
    String message1;

    @Value("${app.varexample}") // Toma datos de application.properties
    String message2;*/

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola a todossssss!";
    }

    @GetMapping("/bootstrap")
    public String bootstrap(){
        return "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <title>Bootstrap demo</title>\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\" crossorigin=\"anonymous\">\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <h1>HOLA MUNDO DESDE SPRING BOOT</h1>\n" +
                    "<a class='btn btn-primary' href='https://www.google.com'>LINK A GOOGLE</a>"+
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa\" crossorigin=\"anonymous\"></script>\n" +
                "  </body>\n" +
                "</html>";
    }
}