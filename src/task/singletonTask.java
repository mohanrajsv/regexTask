package task;
//////////////////////////singleton class

class sn
{
    private static sn obj = null;
    int a = 10;
    private sn() { } //private constructor
    public static sn getInstance()
    {
        if(obj == null)
            obj = new sn();
        return obj;
    }
    void dis()
    {
        System.out.println("a value is : " + a);
    }
}
public class singletonTask
{
    public static void main(String[] args)
    {
        singletonTask a = new singletonTask();
        sn ad = sn.getInstance();
        sn ad2 = sn.getInstance();
        ad.a += 10;
        ad.dis();
        ad2.dis();
        //System.out.println(a.toString() + " " + ad2.toString());
    }
}

/*
Hardware access
Database connection
Config files

Desktop application need to access print
so printer singletion class is implemented
so all the application uses that obj to access the printer
without instantiation of more than one obj
 */