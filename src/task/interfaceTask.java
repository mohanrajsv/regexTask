package task;

interface Swiggy
{
    int commission = 5;
    void orderFood();
    void listFood();

    static void greet(){
        System.out.println("----------Welcome to Swiggy--------------");
    }
    default void result()
    {
        System.out.println("\n Thank you for using me..!");
    }
}

class Dominos implements Swiggy
{

    public void orderFood()
    {
        System.out.println("Food order has been accepted by Dominos");
    }
   public  void listFood(){
       System.out.println("List of food from dominos");

    }
}

class AIsham implements Swiggy
{
    public void orderFood()
    {
        System.out.println("Food order has been accepted by AISham");
    }
    public  void listFood(){
        System.out.println("List of food from AISham");
    }
}

public class interfaceTask {
    public static void main(String[] args)
    {
        Swiggy.greet();
        Swiggy sw = new Dominos();
        sw.listFood();
        sw.orderFood();
        System.out.println("Swiggy commision is : "+ Swiggy.commission ); //commission is static var

        System.out.println();
        Swiggy sw2 = new AIsham();
        sw2.listFood();
        sw2.orderFood();
        System.out.println("Swiggy commision is : "+ Swiggy.commission );

        sw.result();

    }
}
