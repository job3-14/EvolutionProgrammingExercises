import java.awt.Color;

public class Reversi{
  void run(String[] args){
    EZ.initialize(420, 420);
    EZRectangle rectangle1 = EZ.addRectangle(210, 210, 420, 420, Color.GREEN, true); //四角を書く
    EZLine line1 = EZ.addLine(10, 10, 410, 10, Color.LIGHT_GRAY);
    EZLine line2 = EZ.addLine(410, 10, 410, 410, Color.LIGHT_GRAY);
    EZLine line3 = EZ.addLine(410, 410, 10, 410, Color.LIGHT_GRAY);
    EZLine line4 = EZ.addLine(10, 410, 10, 10, Color.LIGHT_GRAY);
    ruledLine(60);
    blackReversi(4,3);
    blackReversi(3,4);
    whiteReversi(3,3);
    whiteReversi(4,4);
  }

  void ruledLine(Integer line){
    if(line <= 360){
      EZLine linex = EZ.addLine(10, line, 410, line, Color.LIGHT_GRAY);
      EZLine liney = EZ.addLine(line, 10, line, 410, Color.LIGHT_GRAY);
      line += 50;
      ruledLine(line);
    }
  }

  //(X座標, Y座標)　マスの位置
  void blackReversi(Integer adressX, Integer adressY){
    adressX = adressX * 50 + 35;
    adressY = adressY * 50 + 35;
    EZCircle circle1 = EZ.addCircle(adressX, adressY, 40, 40, Color.BLACK, true); //円を書く
  }

  void whiteReversi(Integer adressX, Integer adressY){
    adressX = adressX * 50 + 35;
    adressY = adressY * 50 + 35;
    EZCircle circle1 = EZ.addCircle(adressX, adressY, 40, 40, Color.WHITE, true); //円を書く
  }



  public static void main(String[] args){
    Reversi application = new Reversi();
    application.run(args);
  }
}
