import java.util.*;
import java.io.*;

// Kevin Lassiter!
class List
 {
public static void main(String[] args)
 {int wordCount = 0; // used to make word count a variable
  File file = new File("kevin.txt"); // looks int the text document kevin.txt
  Trees test = new Trees(); // trees test = new trees
  try 
  {   Scanner input = new Scanner(file);
   while(input.hasNext()) // while has next
   {  test.insert(input.next());
    wordCount++; // adds one to word count
   }   input.close();
  }  catch(FileNotFoundException e)
  { e.printStackTrace(); 
  }  
  System.out.println("Looking for \"is\""); //  prints out looking...
  System.out.println(test.search("is")); // does the test search for is
  System.out.println("Looking for \"awesome\""); // prints out looking...
  System.out.println(test.search("awesome")); // does the test search for awesome
  System.out.println("Looking for \"kevin\""); // prings out looking for kevin
  System.out.println(test.search("kevin")); // does the test for kevin
   test.print(); // prints out the test 
}}