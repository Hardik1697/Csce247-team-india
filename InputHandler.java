/**
 * @author Hardik Anand
 * @email hanand@email.sc.edu
 * @date 3.23.2020
 */

/**
 * import Hashmap class to use the hashmap finctionality.
 */

import java.util.HashMap;

/**
 * Create class InputHandler which stores the various commands in a hashmap: commands.
 */
public class InputHandler {
  HashMap<String, Command> commands = new HashMap<String, Command>();

  /**
   * Create the constructor which populates commands.
   * @param doc
   */
  public InputHandler(Document doc) {
    commands.put("load", new LoadCommand(doc));
    commands.put("save", new SaveCommand(doc));
    commands.put("spell", new SpellCommand(doc));
    commands.put("print", new PrintCommand(doc));
  }

  /**
   * Create the inputEntered method which executes the command based on user input.
   * It gives a list of commands if the user enters an invalid command.
   * @param data
   */
  public void inputEntered(String data) {
    if (commands.get(data) == null) {
      System.out.println("Enter a valid command from the following list:\n1. load\n2. save\n3. spell\n4. print\n5. quit");
      return;
    } else {
        commands.get(data).execute();
    }
  }
}