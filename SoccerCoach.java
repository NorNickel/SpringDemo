package best.aog.springdemo;

public class SoccerCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Hit 1000 times to ball!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
