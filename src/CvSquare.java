import java.awt.*;
import java.awt.event.*;

  public class CvSquare extends Canvas 
    {

    private static final long serialVersionUID = 123L;
  
    //---------------------------------------------------------------
    //  Code that prints the spiral to the screen according to the
    //  input variables.
    //---------------------------------------------------------------

    public void paint (Graphics g)
      {
      Dimension d = getSize ();

      double initX = (d.width - 1) / 2.0,
             initY = (d.height - 1) / 2.0,
             finX = 0.0,
             finY = 0.0,
             newang = ang;
      int dist1 = dist;

      for (int i = 0; i < N; i++)
        {
        finX = ((Math.cos ((newang * Math.PI) / 180)) * dist1) + initX;
        finY = ((Math.sin ((newang * Math.PI) / 180)) * dist1) + initY;
    
        dist1 = dist1 + incr;
        newang = ang + newang;

        if (newang > 360.0)
          newang = newang - 360.0;

        g.drawLine ((int) Math.round (initX), (int) Math.round (initY),
                    (int) Math.round (finX), (int) Math.round (finY));

        initX = finX;
        initY = finY;

        }//end of for

      }//end of paint

    }//end of CvSquare
