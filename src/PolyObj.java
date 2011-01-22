public class PolyObj
{
   private int initDist = 0,
               incrFromInitDist = 0,
               numSegments = 0;
   private double angle = 0;  

   public PolyObj(int initDist, double angle, int incrFromInitDist, int numSegments)
   {
      this.initDist = initDist;
      this.angle = angle;
      this.incrFromInitDist = incrFromInitDist;
      this.numSegments = numSegments;
   }
}
