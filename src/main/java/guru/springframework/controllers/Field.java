package guru.springframework.controllers;

import guru.springframework.services.university;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Field {
   @Autowired
    private university gla;
    public void disp(){
        gla.maxmarks();
    }
}
