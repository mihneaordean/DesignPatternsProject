import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Person> persons = new ArrayList<Person>();

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public void sendOffer(String string, Person seller) {
        for (Person person : persons) {
            if(person!=seller){
            Product product = ProductFactory.getProduct(string);
            assert product != null;
            person.receiveOffer(product);}
        }
    }
}
