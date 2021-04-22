public class SeirekiToWarekiConverter{
  public static void main(String[] args){
    Integer result;
    System.out.println(args[0]);
    Integer year = Integer.valueOf(args[0]);
    if(year < 1868){
      result = -1;
    }else if(year < 1912){
      result = year - 1867;
    }else if(year < 1926){
      result = year - 1911;
    }else if(year < 1989){
      result = year - 1925;
    }else if(year < 2019){
      result = year - 2018;
    }
  }
}
