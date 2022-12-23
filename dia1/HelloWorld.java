


public class HelloWorld {

  static {
     System.out.println("Soy un metodo static me ejecuto antes del main");
  }
 
  public static void main(String params[]){

   var name = params[0];
   var lastName = params[1];
   var age = params[2];
   var country = params[3];

   System.out.println("Welcome " + name + " " + lastName + " to Java 11");
   System.out.println("Age: " + age);
   System.out.println("Country: " + country);
 
  }
  

}
