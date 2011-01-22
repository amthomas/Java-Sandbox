import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Poly extends Frame
  {
  private static final long serialVersionUID = 1234L;

  //-----------------------------------------------------------------
  //  Initializes the input variables globally.
  //-----------------------------------------------------------------

  
  //-----------------------------------------------------------------
  //  Start of main body of the program.  Includes inputing the data
  //  and making the call to the Poly class.
  //-----------------------------------------------------------------

  public static void main (String [] args) throws IOException
    {
    boolean cont = true;

    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader stdin = new BufferedReader (isr);
        
    while (cont)
      {

      System.out.print ("Enter the value of the initial distance in pixels: ");
      dist = Integer.parseInt (stdin.readLine());
      
      System.out.print ("Enter the value of the angle in degrees: ");
      ang = Double.parseDouble (stdin.readLine());

      System.out.print ("Enter the increment value for the distance: ");
      incr = Integer.parseInt (stdin.readLine());

      System.out.print ("Enter the number of segments to draw: ");
      N = Integer.parseInt (stdin.readLine());

      new Poly();

      System.out.println ();
      System.out.println ("To terminate the program close the Polyspiral" +
                          " window. Otherwise press 1 to draw");
      System.out.print ("another polyspiral: ");

      if (Integer.parseInt (stdin.readLine()) == 0)
        cont = false;
      }//end of while

    stdin.close();
    }//end of main

  //-----------------------------------------------------------------
  //  Class that creates the window to display the Polyspiral and
  //  calls the class that creates the Polyspiral.
  //-----------------------------------------------------------------

 Poly ()
    {

    super ("Polyspiral");
    addWindowListener (new WindowAdapter ()
       {public void windowClosing (WindowEvent e) {System.exit(0);}});
    setSize (725, 725);
    add (new CvSquare ());
    setVisible(true);
    }// end of main

    

  }//end of poly 
