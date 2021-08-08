import java.awt.Color;

public class DrawOval{
  void run(){
    EZ.initialize(400, 400); // 画面の大きさを決める．
    // 円を描く．(中心座標x, y, 幅，高さ，色，塗りつぶし)
    EZCircle circle1 = EZ.addCircle(
        100, 100, 200, 200, Color.BLUE, true);
    EZCircle circle2 = EZ.addCircle(
        200, 200, 200, 200, Color.RED,  false);
  }
  // mainメソッドは省略．
  public static void main(String[] args){
    DrawOval application = new DrawOval();
    application.run();
  }
}
