import javax.swing.JOptionPane;
import java.net.URL;
import javax.swing.ImageIcon;
//R1.7
//39+3
//42

//R1.8
//Hello
//World

//R1.9
//the compile-time error is having 2 arguments in the println

//E1.8
public class Lab01
{
  public static void main(String[] args)
  {
    System.out.println("  |||||  ");
    System.out.println(" +'''''+ ");
    System.out.println("(| o o |)");
    System.out.println(" |  ^  | ");
    System.out.println(" | '~' | ");
    System.out.println(" +-----+ ");
    
  } 
}
//E1.15

public class DialogViewer
{
  public static void main(String[] args)
  {
    JOptionPane.showMessageDialog(null, "Hello, Claire!");
  }
}


//E1.16

public class DialogViewer
{
  public static void main(String[] args)
  {
    String name = JOptionPane.showInputDialog("What is your name?");
    System.out.println(name);
  }
}


//E1.17

public class DialogViewer
{
  public static void main(String[] args)
  {
    String name = JOptionPane.showInputDialog("What is your name?");
    System.out.println(name);
    String task = JOptionPane.showInputDialog("My hame is Hal! What would you like me to do?");
    System.out.println("I'm sorry", name, ". I'm afraid I can't do", task);
    
    
  }
}

//E1.18
public class Lab01
{
  public static void main(String[] args) throws Exception
  {
    URL imageLocation = new URL(
                                "https://www.nationalgeographic.com/content/dam/animals/thumbs/rights-exempt/mammals/g/giraffe_thumb.JPG");
    JOptionPane.showMessageDialog(null, "Ayyyy", "Bro",
                                  JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
  }
}

//R2.5
//the value of mystery is 0


//R2.6
//it redefines mystery on line 3 with the int mystery
