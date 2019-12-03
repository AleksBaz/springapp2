package springApp.cinema;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Random;

public class StartMovie {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Random random = new Random();

        Integer result = 1 + random.nextInt(5);

        Cinema cinema = context.getBean(result.toString(), Cinema.class);

        cinema.playFilm();

        context.close();
    }
}
