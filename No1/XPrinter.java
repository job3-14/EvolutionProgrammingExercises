public class XPrinter{
  public static void main(String[] args){
    Integer i, j, k;

    for(i=1; i<=5; i++){
      for(j=1; j<=10; j++){
        if(i == j || i == 11-j){
          System.out.printf("X");
        }else{
          System.out.printf(".");
      }
      }
      System.out.printf("%n");
    }

    for(i=5; i>=1; i--){
      for(j=1; j<=10; j++){
        if(i == j || i == 11-j){
          System.out.printf("X");
        }else{
          System.out.printf(".");
      }
      }
      System.out.printf("%n");
    }

  }
}
