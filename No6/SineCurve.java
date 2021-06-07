import java.awt.Color;

public class SineCurve{
  void run(){
    EZ.initialize(400, 400); // 画面の大きさを決める．
    EZLine line1 = EZ.addLine(200, 0, 200, 400, Color.BLACK);
    EZLine line2 = EZ.addLine(0, 200, 400, 200, Color.BLACK);
  }
  // mainメソッドは省略．
  public static void main(String[] args){
    SineCurve application = new SineCurve();
    application.run();
  }
}
