import java.util.Random;
public class MonteCarloPi{
  void run(String[] args){
    Integer inputNumber;
    if(args.length == 1){
      inputNumber = Integer.valueOf(args[0]);
    }else{
      inputNumber = 1000;
    }
    calculation(inputNumber);
  }

  void calculation(Integer number){
    Double randomX, randomY, distans, result;
    Integer i, count=0;
    //乱数生成
    Random rnd = new Random();

    for(i=0;i<number;i++){
      randomX = rnd.nextDouble();
      randomY = rnd.nextDouble();
      distans = Math.sqrt(randomX * randomX + randomY * randomY);
      if(distans <= 1){
        count++;
      }
    }
    result = (double)count / number * 4.0;
    System.out.printf("pi = %f\n",result);



  }

  public static void main(String[] args){
    MonteCarloPi application = new MonteCarloPi();
    application.run(args);
  }
}
