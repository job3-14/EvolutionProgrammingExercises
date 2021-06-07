import java.awt.Color;

public class DrawShapes2{
  void run(){
    EZ.initialize(400, 400); // 画面の大きさを決める．
    EZRectangle rectangle1 = EZ.addRectangle(200, 200, 200, 200, Color.BLUE, true); //四角を書く
    EZCircle circle1 = EZ.addCircle(200, 200, 200, 200, Color.WHITE, true); //円を書く
    EZLine line1 = EZ.addLine(200, 50, 50, 200, Color.RED);
    EZLine line2 = EZ.addLine(50, 200, 200, 350, Color.GREEN);
    EZLine line3 = EZ.addLine(200, 350, 350, 200, Color.LIGHT_GRAY);
    EZLine line4 = EZ.addLine(350, 200, 200, 50, Color.ORANGE);
  }
  // mainメソッドは省略．
  public static void main(String[] args){
    DrawShapes2 application = new DrawShapes2();
    application.run();
  }
}
