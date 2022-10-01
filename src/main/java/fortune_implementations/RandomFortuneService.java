package fortune_implementations;

import interfaces.FortuneService;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private final String[] array = new String[]{
            "Congratulations! You have a good day today!",
            "Unfortunately, this day is not so good for you!",
            "Today is your typical day!"
    };
    private String randomFortune(){
        Random random = new Random();
        int num = random.nextInt(3);
        return array[num];
    }

    @Override
    public String getFortune() {
        return randomFortune();
    }
}
