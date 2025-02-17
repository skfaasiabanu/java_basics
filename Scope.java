public class Scope
{
    // Class Scope variable
    static int x = 11;
  
    // Instance Variable
    private int y = 33;

    // Parameter Scope (x)
    public void testFunc(int x) {
        // Method Scope (t)
        Scope t = new Scope(); 
        this.x = 22; 
        y = 44; 

        // Printing variables with different scopes
        System.out.println("Scope.x: " + Scope.x); 
        System.out.println("t.x: " + t.x); 
        System.out.println("t.y: " + t.y); 
        System.out.println("y: " + y); 
    }

    // Main Method
    public static void main(String args[]) {
        Scope t = new Scope();
        t.testFunc(5); 
    }
}
