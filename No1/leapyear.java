public class LeapYear{
    public static void main(String[] args){
        Integer year = 2016;
        Boolean leapYear = false;
        // ここに判定処理を書いていく．

        if(leapYear){ // leapYearがtrueの場合．
            System.out.printf("%d年はうるう年です．%n", year);
        }
        else{
            System.out.printf("%d年はうるう年ではありません．%n", year);
        }
    }
}
