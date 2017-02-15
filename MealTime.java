import java.io.Console;

 public class MealTime {
   public static void main(String[] args) {

     askWhatYouAteFor("Breakfast");
     askWhatYouAteFor("Lunch");
     askWhatYouAteFor("Dinner");
   }

   public static void askWhatYouAteFor(String meal) {
     Console myConsole = System.console();
     String yourMeal = myConsole.readLine();
     System.out.println("You had " + yourMeal + "for" + meal + ".");
   }
}
