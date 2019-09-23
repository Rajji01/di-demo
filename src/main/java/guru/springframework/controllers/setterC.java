package guru.springframework.controllers;


import guru.springframework.services.university;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class setterC {
    @Autowired
    @Qualifier("gla")
    public void setUu1(university uu1) {
        this.uu1 = uu1;
    }

    private university uu1;
    public void disp(){
        uu1.maxmarks();
    }
}


