/**
 * CIS2168 003 Data Structures
 * Name: Nasriddinkhujaev
 * Assign 6
 * Program name: MovieDBConsole.java
 * Program description: Console application that demonstrates the MovieDB class.
 *   It creates a starter movie database, prints all movies, builds the title
 *   index, and prints all index entries.
 */

/**
 * Provides the entry point for the movie database console application.
 * Demonstrates creating a movie database, displaying it, building the title
 * index, and displaying the index.
 */
public class MovieDBConsole {

  /**
   * Creates a starter movie database, displays all movies, builds the title
   * index, and displays all index entries.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    // Create a new movie database object
    MovieDB db = new MovieDB();

    // Populate the database with random unique movies
    db.createStarterMovieDB();

    // Display all movies in the database
    db.showMovieDB();

    // Build the title index from the current database
    db.createIndex();

    // Display all title index entries in alphabetical order
    db.showIndex();
  }
}
