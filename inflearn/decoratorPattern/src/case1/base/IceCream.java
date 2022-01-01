package case1.base;

public abstract class IceCream {
    protected static String description = "";

    public String getDescription(){
        return description;
    }

    public abstract int price();
}
