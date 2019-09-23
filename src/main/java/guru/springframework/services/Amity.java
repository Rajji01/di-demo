package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class Amity implements university {
    @Override
    public void maxmarks() {
        System.out.println("its amity");
    }

}
