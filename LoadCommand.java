/** calls the load method from Command 
   Written by Talin Arya **/
public class LoadCommand implements Command {
  private Document doc;

  public LoadCommand(Document doc) {
    this.doc = doc;
  }

 // @Override
  public void execute() {
    doc.load();
  }
}
