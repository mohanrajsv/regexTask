package inheritanceTask;
import java.io.Serializable;

class temp
{

}

////////////////single inheritance
class A {
   void say()
   {
       System.out.println("message from class A");
   }
}

class B extends A
{
    void msg()
    {
        System.out.println("message from class B");
    }
}
///////////////////////////////////////////


///MultiLevel Inheritnce
class C extends B
{
    void wel()
    {
        System.out.println("message from c");
    }
}

//hierarchy level inheritance
class D extends A
{
    void greet()
    {
        System.out.println("message from D");
    }
}


public class inheritanceTask {
    public static void main(String[] args) {
              C c = new C();
              c.say();

    }
}
