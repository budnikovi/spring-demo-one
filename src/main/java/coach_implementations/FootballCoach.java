package coach_implementations;

import interfaces.Coach;
import interfaces.FortuneService;

public class FootballCoach implements Coach {
    private FortuneService fortuneService;

    //define a constructor for dependency injection
        public FootballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public FootballCoach() {
    }
    @Override
    public String getDailyWorkout() {
        return "score 100 goals";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
