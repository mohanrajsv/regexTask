package task;
class OverLoadTask
{
    void add(int a, int b)
    {
        System.out.println(a+b);
    }

    void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    void add(String b)
    {
        System.out.println(b);
    }
}

public class overLoaddding {
    public static void main(String[] args)
    {
        OverLoadTask ov = new OverLoadTask();
        ov.add(2,4);
        ov.add(2,6,3);
        ov.add("welcome to zoho");
    }
}
