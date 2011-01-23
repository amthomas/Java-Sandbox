public class PolyObj
{
   private int initDist;
   private int incrFromInitDist;
   private int numSegments;
   private double angle;  

   public PolyObj()
   {
      this.initDist = 0;
      this.angle = 0.0;
      this.incrFromInitDist = 0;
      this.numSegments = 0;
   }
   public PolyObj(int initDist, double angle, int incrFromInitDist, int numSegments)
   {
      this.initDist = initDist;
      this.angle = angle;
      this.incrFromInitDist = incrFromInitDist;
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
    * Get initDist.
    *
    * @return initDist as int.
    */
   public int getInitDist()
   {
       return initDist;
   }
   
   /**
    * Set initDist.
    *
    * @param initDist the value to set.
    */
   public void setInitDist(int initDist)
   {
       this.initDist = initDist;
   }
   
   /**
    * Get incrFromInitDist.
    *
    * @return incrFromInitDist as int.
    */
   public int getIncrFromInitDist()
   {
       return incrFromInitDist;
   }
   
   /**
    * Set incrFromInitDist.
    *
    * @param incrFromInitDist the value to set.
    */
   public void setIncrFromInitDist(int incrFromInitDist)
   {
       this.incrFromInitDist = incrFromInitDist;
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
}
