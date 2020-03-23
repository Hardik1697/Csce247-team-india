/**
 * @author Hardik Anand
 * @email hanand@email.sc.edu
 * @date 3.23.2020
 */

/**
 * Create Document class.
 */
public class Document {
  /**
   * Create a private String variable name.
   */
  private String name;

  /**
   * Create the constructor which prints out Document named (name of the document) is created.
   * set the param to the variable name, so it can be used by other methods.
   * @param name
   */
  public Document(String name) {
    System.out.println("Document named " + name + " is created");
    this.name = name;
  }

  /**
   * Create the load method which prints out document (name of the document) is loaded into view.
   */
  public void load() {
    System.out.println("document " + name + " is loaded into view");
  }

  /**
   * Create the spell method which prints out document (name of the document) is being checked for spelling errors.
   */
  public void spell() {
    System.out.println("document " + name + " is being checked for spelling errors");
  }

  /**
   * Create the load method which prints out document (name of the document) is being saved.
   */
  public void save() {
    System.out.println("document " + name + " is being saved");
  }

  /**
   * Create the load method which prints out document (name of the document) is printing.
   */
  public void print() {
    System.out.println("document " + name + " is printing");
  }
}
