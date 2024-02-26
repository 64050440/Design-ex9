public class Sprinkler {
    private Mediator mediator;

    public Sprinkler(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.registerSprinkler(this);
    }

    public void sprinkle() {
        System.out.println("Sprinkler triggered!");
        mediator.alarmEvent();
    }

}
