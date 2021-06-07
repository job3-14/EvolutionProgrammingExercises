import java.awt.Color;

public class Bound{
    void run() throws InterruptedException{
        Integer x = 100;
        Double y0 = y = 10.0;
        EZ.initialize(400, 400);
        EZCircle circle = EZ.addCircle(x, y.intValue(), 5, 5, Color.RED, true);

        Double v = v0 = 85.0;
        Double t = 0.0;
        Double g = 9.8;
        Boolean nageage = true;

        while(true){
            v = v0 - g * t;
            y = y0 + (v0 * t - (g / 2) * t * t);

            if(isSwitch(nageage, v, y)){ // 切り替え条件を確認する．
                t = 0.0;
                v0 = -1 * v;
                y0 = y;
                nageage = !nageage;
            }
            t += 0.1;

            // デバッグ用．
            // System.out.printf("(x, y) = (%3d, %+4d, %+4.2f), t = %5.2f, v = %+5.2f, g = %+5.2f, v0 = %+5.2f, nageage: %s%n",
            //                   x, y.intValue(), y0, t, v, g, v0, nageage);
            circle.translateTo(x, y); // 位置を更新する．
            EZ.refreshScreen();       // 画面を更新する．

            Thread.sleep(100);        // 0.1秒間スリープする．
        }
    }

    Boolean isSwitch(boolean nageage, Double v, Double y){
        if(nageage && v < 0){ // 投げ上げ時，最高点に達した．
            return true;
        }
        else if(!nageage && y < 10.0){ // 自由落下時，地面に達した．
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws InterruptedException{
        Bound bound = new Bound();
        bound.run();
    }
}
