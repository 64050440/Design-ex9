public interface Mediator {
    void registerAlarm(Alarm alarm);

    void registerSprinkler(Sprinkler sprinkler);

    void registerCoffeePot(CoffeePot coffeePot);

    void alarmEvent();

    void sprinkleEvent();

    void coffeePotEvent();
}
