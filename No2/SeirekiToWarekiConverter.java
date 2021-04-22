import java.util.Date;
public class SeirekiToWarekiConverter{
  public static void main(String[] args){
    Integer result, year;
    //System.out.println(args[0]);
    if(args.length == 1){
      year = Integer.valueOf(args[0]);
    }else{
      Date date = new Date();
      year = date.getYear();
      year += 1900;
  }
    System.out.printf("西暦%d: ",year);
    if(year < 1868){
      System.out.printf("明治より前であるため判定できません%n");
    }else if(year < 1912){
      result = year - 1867;
      if(year == 1868){
        System.out.printf("明治元年%n");
      }else{
        System.out.printf("明治%d年%n",result);
      }
    }else if(year < 1926){
      result = year - 1911;
      if(year == 1912){
        System.out.printf("明治45年（大正元年）%n");
      }else{
        System.out.printf("大正%d年%n",result);
      }
    }else if(year < 1989){
      result = year - 1925;
      if(year == 1926){
        System.out.printf("大正15年（昭和元年）%n");
      }else{
        System.out.printf("昭和%d年%n",result);
      }
    }else if(year < 2019){
      result = year - 1988;
      if(year == 1989){
        System.out.printf("昭和64年（平成元年）%n");
      }else{
        System.out.printf("平成%d年%n",result);
      }
    }else{
      result = year - 2018;
      if(year == 2019){
        System.out.printf("平成31年（令和元年）%n");
      }else{
        System.out.printf("令和%d年%n",result);
      }
    }
  }
}
