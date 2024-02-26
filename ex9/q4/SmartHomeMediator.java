public class SmartHomeMediator implements Mediator {
    private Alarm alarm;
    private Sprinkler sprinkler;
    private CoffeePot coffeePot;

    @Override
    public void registerAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void registerSprinkler(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void registerCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    @Override
    public void alarmEvent() {
        // Trigger actions when the alarm goes off
        if (sprinkler != null) {
            sprinkler.sprinkle();
        }
        if (coffeePot != null) {
            coffeePot.makeCoffee();
        }
    }

    @Override
    public void sprinkleEvent() {
        System.out.println("I am sprinkler,... doing my task");
        // Actions to take after sprinkler has been activated, if any
    }

    @Override
    public void coffeePotEvent() {
        System.out.println("I am coffeePot,... doing my task");
        // Actions to take after coffee pot has done making coffee, if any
    }
}
