public class Person {
    private String name;
    private Mediator mediator;

    public Person(Mediator mediator, String name){
        this.name=name;
        this.mediator=mediator;
        this.mediator.addPerson(this);
    }
    public void receiveOffer(Product product){
        System.out.println(this.name+", you have received a buying offer for "+product.getProductName()+" at the price of "+product.getPrice()+"$");
    }
    public void sendOffer(String product){
        this.mediator.sendOffer(product,this);
    }
}
