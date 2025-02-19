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
        this.x = 22; //differentiating the member variable with parameter(local) variable //once static variable is changed it will effevt for all objects
        y = 44; 

        // Printing variables with different scopes
        System.out.println("Scope.x: " + Scope.x); 
        System.out.println("t.x: " + t.x); 
        System.out.println("t.y: " + t.y); //private variable can be accessed by public method
        System.out.println("y: " + y); //local y value
    }

    // Main Method
    public static void main(String args[]) {
        Scope t = new Scope();
        t.testFunc(5); //calling non static function
    }
}
