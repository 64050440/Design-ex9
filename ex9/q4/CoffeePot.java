public class CoffeePot {
    private Mediator mediator;

    public CoffeePot(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.registerCoffeePot(this);
    }

    public void makeCoffee() {
        System.out.println("CoffeePot triggered!");
        mediator.alarmEvent();
    }
}
