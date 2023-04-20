public class ProductFactory {
    public static Product getProduct (String product){
        if("Dunk".equals(product)){
            return new Dunk();
        }
        if("Jordan".equals(product)){
            return new Jordan();
        }
        if("New Balance".equals(product)){
            return new NewBalance();
        }
        return null;
    }
}
