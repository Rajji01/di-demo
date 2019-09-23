package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"hi","default"})
public class Delhi implements university {

    @Override
    public void maxmarks() {
        System.out.println("its du boys");
    }

}
