public class App {
    public static void main(String[] args) {
        Mediator mediator = new SmartHomeMediator();
        Alarm alarm = new Alarm(mediator);
        Sprinkler sprinkler = new Sprinkler(mediator);
        CoffeePot coffeePot = new CoffeePot(mediator);

        alarm.triggerAlarm();

    }
}
