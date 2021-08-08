import java.awt.Color;
import java.lang.Math;

public class KochCurveAnimation{
  void run(String[] args) throws InterruptedException{
    EZ.initialize(400, 400);
    for(Integer i=1; i<=5; i++){
      this.drawKoch(0, 50, 400, 50, i, 0.0);
      Thread.sleep(1000);
      EZ.removeAllEZElements();
    }
  }

  void drawKoch(Integer x1, Integer y1, Integer x5, Integer y5,
  Integer dimension, Double angle) throws InterruptedException{

    if(dimension == 0){
      EZLine line1 = EZ.addLine(x1, y1, x5, y5, Color.RED);
    }
    else{
      // (x1, y1), (x5, y5) 間の長さの 1/3．これが l となる．
      Double length = Math.sqrt((x5-x1)*(x5-x1)+(y5-y1)*(y5-y1))/3.0;
      Double delta = Math.PI / 3.0;

      // (x2, y2) を求める．
      Double x2 = x1 + (length * Math.cos(angle));
      Double y2 = y1 + (length * Math.sin(angle));
      // (x1, y1)から(x2, y2)まで線を引く．
      EZLine line2 = EZ.addLine(x1, y1, x2.intValue(), y2.intValue(), Color.RED);


      // (x3, y3) を求める（θ は angle + delta）．
      Double x3 = x2 + (length * Math.cos(angle + delta));
      Double y3 = y2 + (length * Math.sin(angle + delta));
      // (x2, y2)から(x3, y3)まで線を引く．
      this.drawKoch(x2.intValue(), y2.intValue(),
      x3.intValue(), y3.intValue(),
      dimension - 1, angle + delta);

      // (x4, y4) を求める（θ は angle - delta）．
      Double x4 = x3 + (length * Math.cos(angle - delta));
      Double y4 = y3 + (length * Math.sin(angle - delta));
      // (x3, y3)から(x4, y4)まで線を引く．
      this.drawKoch(x3.intValue(), y3.intValue(),
      x4.intValue(), y4.intValue(),
      dimension - 1, angle - delta);

      // (x4, y4)から(x5, y5)まで線を引く．
      EZLine line5 = EZ.addLine(x4.intValue(), y4.intValue(),x5.intValue(), y5.intValue(), Color.RED);
    }
  }




  public static void main(String[] args) throws InterruptedException{
    KochCurveAnimation application = new KochCurveAnimation();
    application.run(args);
  }
}
