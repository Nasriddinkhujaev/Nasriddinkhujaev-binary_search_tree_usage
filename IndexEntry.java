/**
 * CIS2168 003 Data Structures
 * Name: Nasriddinkhujaev
 * Assign 6
 * Program name: IndexEntry.java
 * Program description: Represents a single entry in the movie title index.
 *   Each entry stores a unique movie title and its location (index) in the
 *   movie database list.
 */

/**
 * Represents an index entry that maps a movie title to its position in the
 * movie database list. Implements Comparable so entries are sorted by title
 * when stored in a TreeSet.
 */
public class IndexEntry implements Comparable<IndexEntry> {

  /** The unique movie title for this index entry. */
  private String title;

  /** The index (position) of the movie in the movie database list. */
  private int location;

  /**
   * Constructs an IndexEntry with the given title and location.
   *
   * @param title    the unique movie title
   * @param location the index of the movie in the movie database list
   */
  public IndexEntry(String title, int location) {
    this.title = title;
    this.location = location;
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
   * Returns the location (list index) of the movie in the database.
   *
   * @return the location
   */
  public int getLocation() {
    return location;
  }

  /**
   * Compares this IndexEntry to another by title, enabling alphabetical
   * ordering in a TreeSet.
   *
   * @param other the other IndexEntry to compare to
   * @return a negative, zero, or positive integer as this title is less than,
   *         equal to, or greater than the other title
   */
  @Override
  public int compareTo(IndexEntry other) {
    return this.title.compareTo(other.title);
  }

  /**
   * Returns a string representation of this index entry.
   *
   * @return formatted string with title and location
   */
  @Override
  public String toString() {
    return String.format("%-15s %d", title, location);
  }
}
