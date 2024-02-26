public class Alarm {
    private Mediator mediator;

    public Alarm(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.registerAlarm(this);
    }

    public void triggerAlarm() {
        System.out.println("Alarm triggered!");
        mediator.alarmEvent();
    }
}
