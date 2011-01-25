import java.awt.*;
import java.awt.event.*;

public class PolyCanvas extends Canvas 
{

   private static final long serialVersionUID = 123L;
   PolyObj poly;
  
   public PolyCanvas(PolyObj poly)
   {
      this.poly = poly;
   }

   public void paint (Graphics g)
   {
      Dimension d = getSize ();

      double   angle = poly.getAngle();
      int      distance = poly.getInitDist(),
               startX = (int) Math.round ((d.width - 1) / 2.0),
               startY = (int) Math.round ((d.height - 1) / 2.0);

      for (int i = 0; i < poly.getNumSegments(); i++)
      {
         int endX = (int) Math.round((Math.cos ((angle * Math.PI) / 180)) * distance) 
                  + startX;
         int endY = (int) Math.round((Math.sin ((angle * Math.PI) / 180)) * distance) 
                  + startY;

         g.drawLine (startX, startY, endX, endY);
    
         startX = endX;
         startY = endY;
         distance = distance + poly.getIncrFromInitDist();
         angle = poly.getAngle() + angle;

         if (angle > 360.0)
            angle -= 360.0;

      }//end of for

   }//end of paint

}//end 
