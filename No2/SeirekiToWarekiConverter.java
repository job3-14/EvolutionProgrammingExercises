public class SeirekiToWarekiConverter{
  public static void main(String[] args){
    Integer result;
    //System.out.println(args[0]);
    Integer year = Integer.valueOf(args[0]);
    System.out.printf("西暦%d: ",year);
    if(year < 1868){
      result = -1;
    }else if(year < 1912){
      result = year - 1867;
      System.out.printf("明治%d年%n",result);
    }else if(year < 1926){
      result = year - 1911;
      System.out.printf("大正%d年%n",result);
    }else if(year < 1989){
      result = year - 1925;
      System.out.printf("昭和%d年%n",result);
    }else if(year < 2019){
      result = year - 1988;
      System.out.printf("平成%d年%n",result);
    }else{
      result = year - 2018;
      System.out.printf("令和%d年%n",result);
    }
  }
}
