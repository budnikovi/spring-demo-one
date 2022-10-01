package coach_implementations;

import interfaces.Coach;
import interfaces.FortuneService;

public class BaseballCoach implements Coach {
    // define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public BaseballCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practise";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune

        return fortuneService.getFortune();
    }
}
