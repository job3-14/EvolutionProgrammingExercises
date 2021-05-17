import java.util.ArrayList;
public class Factorizer{
  void run(String[] args){
    Integer number,count=1;
    ArrayList<Integer> primesList = new ArrayList<>();
    if(args.length == 1){
      number = Integer.valueOf(args[0]);
    }else{
      number = 200;
    }
    primeFactorization(number);
    }

    ArrayList<Integer> primeFactorization(Integer number){
      Integer i, primeTmp, numberTmp=number ,count=1;
      Boolean status=true;
      ArrayList<Integer> answerList = new ArrayList<>();
      Primes primes = new Primes();
      ArrayList<Integer> primeList = primes.calculation(number);
      while(status){
        for(i=1;i<=numberTmp;i++){
          primeTmp = primeList.get(i);
          if(numberTmp % primeTmp == 0){
            numberTmp = numberTmp / primeTmp;
            answerList.add(primeTmp);
            count *= primeTmp;
            break;
          }
        }
        if(count>=number){
          status = false;
        }

      }
      return answerList;
    }


  public static void main(String[] args){
    Factorizer application = new Factorizer();
    application.run(args);
  }
}
