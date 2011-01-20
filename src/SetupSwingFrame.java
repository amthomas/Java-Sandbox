import javax.swing.*;

public class SetupSwingFrame
{

  static void startSwingThread()
  {
      //Schedule a job for the event-dispatching thread:
      //creating and showing this application's GUI.
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGUI();
         }
      });
      
   }

   private static void createAndShowGUI()
   {
      JFrame frame = new JFrame("Hello World");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//      frame.add(new MyPanel());
      frame.pack();
      frame.setVisible(true);
   }
}

class MyPanel extends JPanel 
{

   public MyPanel()
   {
   }
}
