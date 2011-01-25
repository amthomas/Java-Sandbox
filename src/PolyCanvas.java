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
      poly.calculateCenter(d.width, d.height);

      double   angle = poly.getAngle();

      for (int i = 0; i < poly.getNumSegments(); i++)
      {
         int endX = poly.getNextX(angle);
         int endY = poly.getNextY(angle);

         g.drawLine (poly.getX(), poly.getY(), endX, endY);
    
         poly.setX(endX);
         poly.setY(endY);
         poly.incrementDistance();
         angle = poly.getAngle() + angle;

         if (angle > 360.0)
            angle -= 360.0;

      }//end of for

   }//end of paint

}//end 
