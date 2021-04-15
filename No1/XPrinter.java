public class XPrinter{
  public static void main(String[] args){
    Integer i, j, k;

    for(i=1; i<=5; i++){
      for(j=1; j<=5; j++){
        if(i == j){
          System.out.printf("X");
        }else{
          System.out.printf(".");
      }
      }
      for(k=5; k>0; k--){
        if(i == k){
          System.out.printf("X");
        }else{
          System.out.printf(".");
      }
      }
      System.out.printf("%n");
    }

    for(i=1; i<=5; i++){
      for(j=5; j>0; j--){
        if(i == j){
          System.out.printf("X");
        }else{
          System.out.printf(".");
      }
      }
      for(k=1; k<=5; k++){
        if(i == k){
          System.out.printf("X");
        }else{
          System.out.printf(".");
      }
      }
      System.out.printf("%n");
    }

  }
}
