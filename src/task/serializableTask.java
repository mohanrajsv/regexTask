package task;
import java.io.*;
import static java.lang.System.*;   //static import

class Music implements Serializable
{
    void play()
    {
        System.out.println("Play music by third party...");
    }
}

class Gaana extends Music
{
    public static int a = 10;
    public Gaana(){
        System.out.println("------------------From Gaana-----------------");
    }
}

class Saavn extends Music
{
    Saavn()
    {
        System.out.println("---------------From Saavn-------------------");
    }
    void play()
    {
        System.out.println("Playing music by Saavn");
    }
}

public class serializableTask  {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NullPointerException
    {
        String filename = "file.txt";
        Gaana deS;      //for deserilization purpose
        Gaana s = new Gaana();
        s.play();

        Saavn p = new Saavn();
        p.play();

        out.println("\n==============================================");
        // Serialization
        FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(s);
        out.close();
        file.close();
        System.out.println("Object has been serialized");
        System.out.println("a  = "+ s.a);

        // Deserialization
        FileInputStream file2 = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(file2);
        deS = (Gaana)in.readObject();
        in.close();
        file.close();
        System.out.println("===================\nObject has been deserialized ");
        System.out.println("a = " + deS.a);

    }
}

/// example is Session are serialized for storing user data
