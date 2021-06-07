import java.awt.Color;
import java.util.ArrayList;

public class SineCurve{
  void run(){
    Integer i, v;
    EZ.initialize(400, 400); // 画面の大きさを決める．
    EZLine line1 = EZ.addLine(200, 0, 200, 400, Color.BLACK);
    EZLine line2 = EZ.addLine(0, 200, 400, 200, Color.BLACK);
    ArrayList<EZLine> lineSin = new ArrayList<>();
    for(i=1; i<400; i++){
      v = getSin(i, 2*Math.PI/400, 50/2*Math.PI);
      lineSin.add(EZ.addLine(i,v+200,i,v+1+200, Color.RED));
    }
  }

  Integer getSin(Integer i, Double delta, Double s){
    Double v = Math.sin(i * delta) * s;
    Integer intV = v.intValue();
    return intV;
  }

  public static void main(String[] args){
    SineCurve application = new SineCurve();
    application.run();
  }
}
