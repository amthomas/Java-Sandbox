import java.io.*;
import java.util.*;

public class PolyInput
{
   public static PolyObj getPolyInput (BufferedReader stdin) throws IOException
   {
      PolyObj poly = new PolyObj();
        
      System.out.print ("Enter the value of the initial distance in pixels: ");
      poly.setDistance(Integer.parseInt (stdin.readLine()));
      
      System.out.print ("Enter the value of the angle in degrees: ");
      poly.setAngle(Double.parseDouble (stdin.readLine()));

      System.out.print ("Enter the increment value for the distance: ");
      poly.setDistanceIncrement(Integer.parseInt (stdin.readLine()));

      System.out.print ("Enter the number of segments to draw: ");
      poly.setNumSegments(Integer.parseInt (stdin.readLine()));

      return poly;
   }
}
