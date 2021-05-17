import java.util.ArrayList;
public class Factorizer{
  void run(String[] args){
    Integer i,j,number,count=1;
    ArrayList<Integer> primesList = new ArrayList<>();
    ArrayList<Integer> answer = new ArrayList<>();
    for(i=0;i<args.length;i++){
      number = Integer.valueOf(args[i]);
      answer = primeFactorization(number);
      System.out.printf("%d: ",number);
      for(j=0; j<answer.size(); j++){
        System.out.printf("%d ",answer.get(j));
        if(j != answer.size()-1){
          System.out.printf("x ");
        }else{
          System.out.printf("\n");
        }
      }
    }
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
