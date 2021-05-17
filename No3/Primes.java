import java.util.ArrayList;
public class Primes{
  void run(String[] args){
    Integer number;
    if(args.length == 1){
      number = Integer.valueOf(args[0]);
    }else{
      number = 200;
  }
  calculation(number);
    }

  void calculation(Integer number){
    Integer i,j,k,tmp,lastPrime, count=1;
    ArrayList<Boolean> list = new ArrayList<>();
    ArrayList<Integer> primesList = new ArrayList<>();
    primesList.add(1);
    for(i=0;i<=number;i++){
      list.add(true);
    }
    for(i=2;i<=number;i++){
      lastPrime = primesList.get(primesList.size()-1);
      for(j=lastPrime+1;j<number;j++){
        if(list.get(j)==true){
          primesList.add(j);
          for(k=j;k<=number;k++){ //素数の倍数除外
            if(k%j == 0){
              list.set(k, false);
            }
          }
          break;
        }
      }
    }

    for(i=1;i<primesList.size();i++){
      System.out.printf("%4d ",primesList.get(i));
      count++;
      if(count%11 == 0){
        System.out.printf("\n");
        count = 1;
      }
    }
    System.out.printf("\n");

  }




  public static void main(String[] args){
    Primes application = new Primes();
    application.run(args);
  }
}
