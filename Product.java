class Product
{
    String name;
    int price;
}

class Electronics extends Product
{
    int warranty;

    void display()
    {
        System.out.println("Electronics");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty + " years");
    }
}

class Clothing extends Product
{
    String size;
    String fabric;

    void display()
    {
        System.out.println("Clothing");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Fabric: " + fabric);
    }

    public static void main(String[] args)
    {
        Electronics e = new Electronics();

        e.name = "Laptop";
        e.price = 50000;
        e.warranty = 2;

        e.display();

        System.out.println();

        Clothing c = new Clothing();

        c.name = "Shirt";
        c.price = 1000;
        c.size = "L";
        c.fabric = "Cotton";

        c.display();
    }
}