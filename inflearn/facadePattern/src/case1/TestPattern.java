package case1;

public class TestPattern {
    public static void main(String[] args) {
        SimpleProductFacade sf = new SimpleProductFacade();
        sf.setName("printer");
        System.out.println("The product is a " +sf.getName());
    }
}
