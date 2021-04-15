public class Multiplication{
  public static void main(String[] args){
    Integer i, j, result;

    System.out.printf(" ");
    for(i=1; i<=9; i++){
      System.out.printf("%2d ",i);
    }
    System.out.printf("%n");

    for(i=1; i<=9; i++){
      System.out.printf("%d",i);
      for(j=1; j<=9; j++){
        result = i * j;
        System.out.printf("%2d ", result);
      }
      System.out.printf("%n");
    }
  }
}
