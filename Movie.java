/**
 * CIS2168 003 Data Structures
 * Name: Nasriddinkhujaev
 * Assign 6
 * Program name: Movie.java
 * Program description: Represents a movie in the movie database.
 *   Each movie has a title, director, and release year.
 */

/**
 * Represents a single movie entry with a title, director, and release year.
 */
public class Movie {

  /** The title of the movie. */
  private String title;

  /** The director of the movie. */
  private String director;

  /** The release year of the movie. */
  private int year;

  /**
   * Constructs a Movie with the given title, director, and year.
   *
   * @param title    the movie title
   * @param director the movie director
   * @param year     the release year
   */
  public Movie(String title, String director, int year) {
    this.title = title;
    this.director = director;
    this.year = year;
  }

  /**
   * Returns the movie title.
   *
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Returns the movie director.
   *
   * @return the director
   */
  public String getDirector() {
    return director;
  }

  /**
   * Returns the release year.
   *
   * @return the year
   */
  public int getYear() {
    return year;
  }

  /**
   * Returns a string representation of the movie.
   *
   * @return formatted string with title, director, and year
   */
  @Override
  public String toString() {
    return String.format("%-15s %-15s %d", title, director, year);
  }
}
