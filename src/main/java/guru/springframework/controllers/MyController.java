package guru.springframework.controllers;

import guru.springframework.services.university;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    public MyController(university uni) {
        this.uni = uni;
    }

    private university uni;
    public void disp(){
        uni.maxmarks();
    }

}
