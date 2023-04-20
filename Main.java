public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Person p1 = new Person(mediator,"Mihnea");
        Person p2 = new Person(mediator,"Carla");
        Person p3 = new Person(mediator, "Ovi");

        p1.sendOffer("Jordan");
        System.out.println("\n");
        p2.sendOffer("Dunk");
        System.out.println("\n");
        p1.sendOffer("Dunk");
        System.out.println("\n");
        p3.sendOffer("New Balance");
        System.out.println("\n");
        Person p4 = new Person(mediator,"Raul");
        p1.sendOffer("Jordan");
        System.out.println("\n");
        p4.sendOffer("Dunk");

    }
}
