//File: MovieDB.java
//You are to complete this class.
package assign6_template;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MovieDB {

    //----------Assign 6 Begin ----------------//
    //movie database, to be implemented as an array list (better)
    private List<Movie> movieDB;
    //initial capacity of the movie database (max number of movies can be stored initially) 
    private static final int INITIAL_CAPACITY = 20;
    //the number of movies in the starter movie database
    private static final int STARTER_MOVIEDB_SIZE = 15;

    //decare a data field named titleIndex for the movie title index
    //must use both Set interface and TreeSet class in Java API
    //add your code here
    
    //constructor of MovieDB
    public MovieDB() {
        //Add your code
        
        //create the object for the empty movieDB     
        //Create the object for the empty index tree.
        
    }

    //create a starter movie DB:
    //  use random numbers to generate STARTER_MOVIEDB_SIZE number of movies with random data.
    //          (e.g.         Title15      Director15   2019)
    //  use HashSet to test if a random number is unique.
    //  append each random movie to the movieDB list.
    public void createStartMovieDB() {
        //add your own code
        
        //initialize the counter to 0.
        //create an empty HashSet of Integers;
        //Repeat 
        //   genereate a random number in the range: [0, STARTER_MOVIEDB_SIZE-1]
        //                                        or [1, STARTER_MOVIEDB_SIZE]
        //   use a HashSet to check if the randome number is unique
        //   if this random number is unique
        //       use this random number to create a random movie with the random data:
        //            like  Title15      Director15   2019
        //       append the random movie to the movieDB list.
        //       increase counter
        //Until STARTER_MOVIEDB_SIZE number of movies have been generated.

        //Hint: see sample usage of Random number generation in the main method below

        //Must use a HashSet to check if the random number is unique       
  
    }

    //display the movies in the database in a nice tabular format
    // like the one in the sample output
    public void showMovieDB() {
        //add your own code
        
        //Hint:
        //  use a loop to iterate over all movies in the movieDB
        //  Use String.format(...) to print in the desired format
        //  See set_map_use.IndexGenerator covered in Lec#19 for formatting.

    }

    //create the index tree for all titles (unique) in the current movieDB
    public void createIndex() {
        //add your own code
        
        //Hint:
        //  It’s very similar to createIndex() in the class IndexGenerator in the package set_map_use_demo posted for Lec#19.
        //  The difference is in handling the index entry in different stored format.    
        
        //for each movie in the moiveDB list
        //   create an index entry for this movie using IndexEntry class
        //      (example index entry in displayed format: Title15  0)
        //   add this IndexEntry object to the data field: titleIndex
    }

    //display the title index in in a tabular format
    // like the one in the sample output
    public void showIndex() {
        //add your own code

        //Hint:        
        //  It’s similar to showIndex() in the class IndexGenerator in the package set_map_use_demo posted for Lec#19.
        //  The difference is in handling the index entry in different stored format and different printed format.
        
        //for each index entry in the data field : titleIndex
        //   display it using String.format(....)
    }    
    
    //----------Assign 6 End ----------------// 
    
    
    //code below might be helpful to you.
    public static void main(String[] args) {
        //create a random number generator
        Random randomNumberGenerator = new Random();
        //get a random integer between 0 (inclusive) and 200 (exclusive)
        // 0, 1, 2, ... ,199
        int randomNumber = randomNumberGenerator.nextInt(200);
        System.out.println(randomNumber);  
        //get a random integer between 1 (inclusive) and 200 (inclusive)
        // 1, 2, 3, ...., 200
        randomNumber = randomNumberGenerator.nextInt(200) + 1;
        System.out.println(randomNumber);
    }

}
