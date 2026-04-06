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

    //declare a data field named titleIndex for the movie title index
    //must use both Set interface and TreeSet class in Java API
    private Set<IndexEntry> titleIndex;

    //constructor of MovieDB
    public MovieDB() {
        //create the object for the empty movieDB
        movieDB = new ArrayList<>(INITIAL_CAPACITY);
        //Create the object for the empty index tree.
        titleIndex = new TreeSet<>();
    }

    //create a starter movie DB:
    //  use random numbers to generate STARTER_MOVIEDB_SIZE number of movies with random data.
    //          (e.g.         Title15      Director15   2019)
    //  use HashSet to test if a random number is unique.
    //  append each random movie to the movieDB list.
    public void createStartMovieDB() {
        //initialize the counter to 0.
        int count = 0;
        //create an empty HashSet of Integers
        Set<Integer> usedNumbers = new HashSet<>();
        Random randomNumberGenerator = new Random();
        //Repeat
        while (count < STARTER_MOVIEDB_SIZE) {
            //generate a random number in the range [1, STARTER_MOVIEDB_SIZE]
            int randomNumber = randomNumberGenerator.nextInt(STARTER_MOVIEDB_SIZE) + 1;
            //use a HashSet to check if the random number is unique
            if (usedNumbers.add(randomNumber)) {
                //use this random number to create a random movie with the random data
                Movie movie = new Movie(
                        "Title" + randomNumber,
                        "Director" + randomNumber,
                        2000 + randomNumber);
                //append the random movie to the movieDB list
                movieDB.add(movie);
                //increase counter
                count++;
            }
        }
    }

    //display the movies in the database in a nice tabular format
    // like the one in the sample output
    public void showMovieDB() {
        System.out.println("=== Movie Database ===");
        System.out.println(String.format("%-5s %-15s %-15s %-6s", "Index", "Title", "Director", "Year"));
        System.out.println("----------------------------------------------");
        for (int i = 0; i < movieDB.size(); i++) {
            Movie m = movieDB.get(i);
            System.out.println(String.format("%-5d %-15s %-15s %-6d",
                    i, m.getTitle(), m.getDirector(), m.getYear()));
        }
        System.out.println();
    }

    //create the index tree for all titles (unique) in the current movieDB
    public void createIndex() {
        //for each movie in the movieDB list
        for (int i = 0; i < movieDB.size(); i++) {
            Movie m = movieDB.get(i);
            //create an index entry for this movie using IndexEntry class
            IndexEntry entry = new IndexEntry(m.getTitle(), i);
            //add this IndexEntry object to the data field: titleIndex
            titleIndex.add(entry);
        }
    }

    //display the title index in a tabular format
    // like the one in the sample output
    public void showIndex() {
        System.out.println("=== Title Index ===");
        System.out.println(String.format("%-15s %-8s", "Title", "Location"));
        System.out.println("------------------------");
        //for each index entry in the data field: titleIndex
        for (IndexEntry entry : titleIndex) {
            System.out.println(String.format("%-15s %-8d",
                    entry.getTitle(), entry.getLocation()));
        }
        System.out.println();
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
