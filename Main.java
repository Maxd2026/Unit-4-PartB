import java.util.ArrayList;



public class Main {

   public static void main(String []args) {







      // 4.8 ARRAYLIST
      /* ArrayList is a RE-SIZABLE collection
      You can ADD or REMOVE items from lists!
      ArrayList is MUTABLE (can change during run) 
      */

      // ArrayList<Type> name = new ArrayList<Type>();

      ArrayList<String> toDo = new ArrayList<String>();
      // For numbers, must use WRAPPER classes (not primitives)
      ArrayList<Integer> intList = new ArrayList<Integer>();
      ArrayList<Double> doubList = new ArrayList<Double>();

      // ARRAYLIST METHODS (assume "list" is an ArrayList)

      // list.size() returns an int
      // the number of items in the list
      int numTasks = toDo.size();
      System.out.println("Number of items on To Do list:" + numTasks);

      // list.add ( obj ) append the obj to end of list
      // returns a boolean, but that's not important
      toDo.add( "Go to gym" );
      toDo.add( "Finish homework" );
      toDo.add( "Read book" );
      // check size after adding stuff

      System.out.println("Number of items after adding: " + toDo.size() );
      System.out.println( toDo ); // ArrayList has a nice toString method!!!

      // list.add( index, obj ) inserts the obj
      // AT a specific INDEX! (position)
      toDo.add( 1, "Buy groceries" );
      System.out.println( toDo );
      // REMEMBER that indexes start at 0
      // so 1 means we add it to the SECOND spot


      // list.get( int index ) returns the item
      // at that specified index
      String firstItem = toDo.get(0);
      // return type matches what the ArrayList holds


      // list.set( int index, obj newItem )
      // replaces item at that index with a new one!
      String replacedItem = toDo.set(0, "Finish HW");
      System.out.println(toDo);
      System.out.println("We replaced: " + replacedItem);

      // list.remove( int index ) deletes the item at that index
      // shifting everything else back one number
      // also returns the removed item! (called E on the quick reference)
      String removedItem = toDo.remove(2);
      System.out.println(toDo);
      System.out.println("We removed the item: " + removedItem);


      // 4.9 ARRAYLIST TRAVERSAl
      ArrayList<Integer> scores = new ArrayList<Integer>();
      scores.add(60);
      scores.add(75);
      scores.add(90);
      System.out.println(scores);

      // ENHANCES FOR-EACH LOOP
      // to "visit" every item in order
      // does not keep track of current index/position
      for ( Integer currentScore : scores ) {
         System.out.println("Test Score: " + currentScore);
      }
      // typical example: count up all items
      double sum = 0;
      for ( Integer score : scores ) {
         sum = sum + score; // OR sum += score;
      }
      double avg = sum / scores.size();
      System.out.println("Test Average: " + avg);


      // STANDARD FOR LOOP: when you need to keep
      // track of the current INDEX (position)
      // like if you want to use a method (set, get, etc..)
      for (int i = 0; i < scores.size(); i++ ) {
         // get item at current index
         int currentItem = scores.get(i);
         int curvedScore = currentItem + 100;
         scores.set(i, curvedScore); // replace item
      }
      System.out.println(scores);


      // WHILE LOOP (iterate until condition is false)
      ArrayList<String> groceries = new ArrayList<String>();
      groceries.add("steak");
      groceries.add("rice");
      groceries.add("steak");
      groceries.add("beans");
      // guess what this loop is trying to do?
      boolean found = false;
      int index = 0;
      while ( index < groceries.size() ) {
         if ("steak".equals( groceries.get(index) ) ) {
            // if current item in list is "steak"
            groceries.remove(index);
            found = true;

         }
         else {
            index++; // continue through list
         }

      }
      System.out.println(groceries);



      







      
   } // END MAIN METHOD
} // END CLASS