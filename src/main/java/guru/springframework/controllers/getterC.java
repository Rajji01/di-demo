package guru.springframework.controllers;

import guru.springframework.services.university;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class getterC {
    @Autowired
    public getterC(@Qualifier("aktu") university uu) {
        this.uu = uu;
    }

    private university uu;
    public void printff(){
        uu.maxmarks();
    }

}

