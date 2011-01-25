public class PolyObj
{
   private int distance;
   private int distanceIncrement;
   private int numSegments;
   private int x;
   private int y;
   private double angle;  

   public PolyObj()
   {
      this.distance = 0;
      this.angle = 0.0;
      this.distanceIncrement = 0;
      this.numSegments = 0;
   }
   public PolyObj(int distance, double angle, int distanceIncrement, int numSegments)
   {
      this.distance = distance;
      this.angle = angle;
      this.distanceIncrement = distanceIncrement;
      this.numSegments = numSegments;
   }
   
   /**
    * Get distance.
    *
    * @return distance as int.
    */
   public int getDistance()
   {
       return distance;
   }
   
   /**
    * Set distance.
    *
    * @param distance the value to set.
    */
   public void setDistance(int distance)
   {
       this.distance = distance;
   }
   
   /**
    * Get distanceIncrement.
    *
    * @return distanceIncrement as int.
    */
   public int getDistanceIncrement()
   {
       return distanceIncrement;
   }
   
   /**
    * Set distanceIncrement.
    *
    * @param distanceIncrement the value to set.
    */
   public void setDistanceIncrement(int distanceIncrement)
   {
       this.distanceIncrement = distanceIncrement;
   }
   
   /**
    * Get numSegments.
    *
    * @return numSegments as int.
    */
   public int getNumSegments()
   {
       return numSegments;
   }
   
   /**
    * Set numSegments.
    *
    * @param numSegments the value to set.
    */
   public void setNumSegments(int numSegments)
   {
       this.numSegments = numSegments;
   }
   
   /**
    * Get angle.
    *
    * @return angle as double.
    */
   public double getAngle()
   {
       return angle;
   }
   
   /**
    * Set angle.
    *
    * @param angle the value to set.
    */
   public void setAngle(double angle)
   {
       this.angle = angle;
   }
   
   /**
    * Get x.
    *
    * @return x as int.
    */
   public int getX()
   {
       return x;
   }
   
   /**
    * Set x.
    *
    * @param x the value to set.
    */
   public void setX(int x)
   {
       this.x = x;
   }
   
   /**
    * Get y.
    *
    * @return y as int.
    */
   public int getY()
   {
       return y;
   }
   
   /**
    * Set y.
    *
    * @param y the value to set.
    */
   public void setY(int y)
   {
       this.y = y;
   }

   public void calculateCenter (int width, int height)
   {
      this.x = (int) Math.round ((width - 1) / 2.0);
      this.y = (int) Math.round ((height - 1) / 2.0);
   }

   public int getNextX (double angle)
   {
      return (int) Math.round((Math.cos ((angle * Math.PI) / 180)) * this.distance)
                  + x;
   }

   public int getNextY (double angle)
   {
      return (int) Math.round((Math.sin ((angle * Math.PI) / 180)) * this.distance)
                  + y;
   }

   public void incrementDistance ()
   {
      this.distance += distanceIncrement;
   }
}
