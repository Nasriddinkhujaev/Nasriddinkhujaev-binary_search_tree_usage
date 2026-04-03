/**
 * CIS2168 003 Data Structures
 * Name: Nasriddinkhujaev
 * Assign 6
 * Program name: MovieDB.java
 * Program description: Represents the movie database. It creates and maintains
 *   a movie collection stored in a List (ArrayList) and a title index stored in
 *   a TreeSet (a self-balancing binary search tree). Provides methods to
 *   populate the database with random movies, display the database, build the
 *   title index, and display the index.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Represents a movie database that stores movies in an ArrayList and maintains
 * a title index using a TreeSet (binary search tree).
 */
public class MovieDB {

  /** The max number of movies initially stored in the movie database. */
  private static final int INITIAL_CAPACITY = 20;

  /** The number of movies in the starter movie database. */
  private static final int STARTER_MOVIEDB_SIZE = 15;

  /** The movie collection stored in a List data structure. */
  private List<Movie> movieDB;

  /** The index for all movie titles in the movie database (TreeSet / BST). */
  private Set<IndexEntry> titleIndex;

  /**
   * Constructs a MovieDB with an empty movie collection and an empty title
   * index.
   */
  public MovieDB() {
    movieDB = new ArrayList<>(INITIAL_CAPACITY);
    titleIndex = new TreeSet<>();
  }

  /**
   * Creates the starter movie database. Generates STARTER_MOVIEDB_SIZE movies
   * with unique random titles and directors. A HashSet is used to guarantee
   * uniqueness of the randomly generated numeric IDs. Each title/director is of
   * the form "TitleN" / "DirectorN" where N is a unique random ID from 1 to
   * STARTER_MOVIEDB_SIZE.
   */
  public void createStarterMovieDB() {
    Random rand = new Random();
    // HashSet used to track which IDs have already been used, ensuring uniqueness
    Set<Integer> usedIds = new HashSet<>();

    while (usedIds.size() < STARTER_MOVIEDB_SIZE) {
      // Generate a random ID between 1 and STARTER_MOVIEDB_SIZE (inclusive)
      int id = rand.nextInt(STARTER_MOVIEDB_SIZE) + 1;

      // Only add the movie if the ID has not been used yet
      if (usedIds.add(id)) {
        String title = "Title" + id;
        String director = "Director" + id;
        int year = 2019;
        movieDB.add(new Movie(title, director, year));
      }
    }
  }

  /**
   * Displays all movies in the database in a tabular format with columns for
   * Title, Director, and Year.
   */
  public void showMovieDB() {
    System.out.println("Movie Database:");
    System.out.printf("%-15s %-15s %s%n", "Title", "Director", "Year");
    System.out.println("-------------------------------------------");

    // Print each movie using its toString representation
    for (Movie movie : movieDB) {
      System.out.println(movie);
    }
  }

  /**
   * Creates the title index for all movies in the movie database. Each index
   * entry maps a movie title to the index (location) of that movie in the
   * movieDB list. The index is stored in a TreeSet so entries are kept in
   * alphabetical order by title.
   */
  public void createIndex() {
    // Iterate over movieDB by index to capture each movie's position
    for (int i = 0; i < movieDB.size(); i++) {
      String title = movieDB.get(i).getTitle();
      titleIndex.add(new IndexEntry(title, i));
    }
  }

  /**
   * Displays all index entries in the title index in a tabular format with
   * columns for Title and Location. Entries are printed in alphabetical order
   * because they are stored in a TreeSet.
   */
  public void showIndex() {
    System.out.println("Title Index:");
    System.out.printf("%-15s %s%n", "Title", "Location");
    System.out.println("-------------------------");

    // Print each index entry; TreeSet guarantees alphabetical order by title
    for (IndexEntry entry : titleIndex) {
      System.out.println(entry);
    }
  }

  /**
   * Demonstrates how to generate a random integer with an upper bound using
   * the Random class in Java.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    // Demo: generate a random integer between 0 (inclusive) and 10 (exclusive)
    Random rand = new Random();
    int upperBound = 10;
    int randomInt = rand.nextInt(upperBound);
    System.out.println("Random int (0 to " + (upperBound - 1) + "): " + randomInt);
  }
}
