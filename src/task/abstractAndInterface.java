package task;
abstract class BulkSms
{
    int a = 10;
    void getRules()
    {
        System.out.println("Get government rules");
    }
    abstract void sendSms();
}

class Airtel extends BulkSms
{
   void sendSms()
    {
        System.out.println("SMS SENT BY Airtel");
    }
}

class Vodafone extends BulkSms
{
    void sendSms()
    {
        System.out.println("SMS SENT BY Vodafone");
    }
}

public class abstractAndInterface
{
    public static void main(String[] args)
    {
        BulkSms b = new Airtel();
        b.getRules();
        b.sendSms();

        BulkSms v = new Vodafone();
        v.getRules();
        v.sendSms();
    }
}
