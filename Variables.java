public class Variables
{

    int a=10;//instance variable
    static int b=20;//static variables
    public static void func()//non static cannot be referenced in a static 
    {
        //local variables
        int c=20;
        int d=30;
        System.out.println(c+d);
    } 
    public void func1()//non static cannot be referenced in a static 
    {
        //local variables
        int c=20;
        int d=30;
        System.out.println(c+d);
    } 
    
    public static void main(String args[])
    {
        Variables obj=new Variables();
      System.out.println(obj.a);//non-static variable cannot be referenced in a statuc context
      System.out.println(Variables.b);//static variables can be called by or not class name
      System.out.println(b);
      func();
      obj.func1();
    }
}