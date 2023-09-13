package spring.load.data.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelControler {


    @GetMapping("/")
    public String publicPage() {
        return "Wellcome to the HotelsAPI ........... ";
    }
}
