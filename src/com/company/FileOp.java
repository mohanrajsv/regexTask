package com.company;
import java.io.*;
import java.util.Scanner;
import com.company.subpack.*;
public class FileOp {
    public void demoo()
    {

    }
    protected void listOutFile()
    {
        String path = System.getProperty("user.dir");
        File folder = new File(path);
        String[] files = folder.list();
        System.out.println("\t Files in " + path);
        for (String file : files)
        {
            System.out.print(file + " , ");
        }
    }

    public  void createFile()
    {
        System.out.println("------------------CREATE FILE--------------");
        Scanner sc = new Scanner(System.in);
        listOutFile();

        System.out.print("\n\nEnter file name without ext : ");
        String fname = sc.nextLine().trim();
        fname = fname.concat(".txt");

        File myFile  = new File(fname);
        try{
            if(!myFile.exists()){
                myFile.createNewFile();
                System.out.println(myFile + " File created successfully..!");
            }
            else
            {
                System.err.println(myFile +" File already exist..!");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public  void writeFile()
    {
        System.out.println("------------------WRITE FILE--------------");
        Scanner sc = new Scanner(System.in);
        listOutFile();

        System.out.print("\n\nEnter file name without ext : ");
        String fname = sc.nextLine().trim();
        fname = fname.concat(".txt");
        BufferedWriter bw = null;
        String text = null;
        FileWriter fw = null;

        try
        {
            fw = new FileWriter(fname,false); //here we are writting to file
            bw = new BufferedWriter(fw);
            System.out.println("Enter text : ");
            text = sc.nextLine();
            bw.write(text);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public  void appendFile()
    {
        System.out.println("------------------APPEND FILE--------------");
        Scanner sc = new Scanner(System.in);

        listOutFile();

        System.out.print("\n\nEnter file name without ext : ");
        String fname = sc.nextLine().trim();
        fname = fname.concat(".txt");
        BufferedWriter bw = null;
        String text = null;
        FileWriter fw = null;

        try
        {
            fw = new FileWriter(fname,true); //here we are writting to file
            bw = new BufferedWriter(fw);
            System.out.println("Enter text to append: ");
            text = sc.nextLine();
            bw.write(text);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public  void deleteFile()
    {
        System.out.println("------------------DELETE FILE--------------");
        Scanner sc = new Scanner(System.in);

        listOutFile();

        System.out.print("\nEnter file name without ext : ");
        String fname = sc.nextLine().trim();
        fname = fname.concat(".txt");
        File myFile  = new File(fname);
        try{
            if(myFile.exists()){
                myFile.delete();
                System.out.println(myFile + "File deleted successfully..");
            }
            else
            {
                System.err.println("File not exist..!");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public  void readFile()
    {
        System.out.println("------------------READ FILE--------------");
        Scanner sc = new Scanner(System.in);

        listOutFile();

        System.out.print("\nEnter file name without ext : ");
        String fname = sc.nextLine().trim();
        fname = fname.concat(".txt");
        File myFile  = new File(fname);
        BufferedReader br = null;
        try
        {
            if(myFile.exists())
            {
                FileReader fr = new FileReader(fname);
                br = new BufferedReader(fr);
                String line = null;
                while( (line = br.readLine()) != null )
                {
                    System.out.println(line);
                }
            }
            else
            {
                System.err.println("File not found..");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    protected void a()
    {

    }
    public static void main(String[] args) {


        FileOp fbj = new FileOp(); //obj to access members of FileOp class from main
        Scanner sc = new Scanner(System.in); //to get input from system

        System.out.println("\t\t FILE OPERATIONS");
        while(true)
        {
            System.out.println("\t 1. CREATE  2. READ  3. WRITE  4. APPEND  5. DELETE  6.EXIT");
            System.out.println("Enter choice  (1 / 2 / 3 / 4 / 5 / 6 ) : ");
            try{
                String ch = sc.next();
                switch (ch.charAt(0))
                {
                    case '1':
                        fbj.createFile();
                        break;
                    case '2':
                        fbj.readFile();
                        break;
                    case '3':
                        fbj.writeFile();
                        break;
                    case '4':
                        fbj.appendFile();
                        break;
                    case '5':
                        fbj.deleteFile();
                        break;
                    case '6':
                        System.exit(0);
                    default:
                        System.out.println("INVALID CHOICE IS PRESSED...");
                        break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


/*  SINGLETON CLASS EXAMPLE
class Tester {
    private static Tester instance;
    private Tester(){}

    public static Tester getInstance(){
        if(instance == null){
            instance = new Tester();
        }
        return instance;
    }

    public static void main(String[] args) {
        Tester tester = Tester.getInstance();
        Tester tester1 = Tester.getInstance();
        System.out.println(tester.equals(tester1));
    }
}
 */