import java.io.*;
public class Userinput
{
    public static void main(String args[])
    {
        try{
     InputStreamReader obj= new InputStreamReader(System.in);
     BufferedReader obj1=new BufferedReader(obj);
     System.out.println("give a number");
     String input=obj1.readLine();
     int num=Integer.parseInt(input);
     System.out.println(num);
        }
        catch(IOException e)
        {
            System.out.println("an exception has arised");
        }
    }
}