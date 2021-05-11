public class TrapezoidalRulePi{
  void run(String[] args){
    Double inputNumber;
    if(args.length == 1){
      inputNumber = Double.valueOf(args[0]);
    }else{
      inputNumber = 0.0001;
    }
    pi(inputNumber);
  }

  void pi(Double input){
    Double i, total=0.0, hight, lastX=0.0, lastHight=1.0, area, result;
    for(i=input; i<=1; i+=input){
      hight = Math.sqrt(1 - i * i);
      area = (i - lastX) * (lastHight + hight) / 2;
      total += area;
      lastX = i;
      lastHight = hight;
    }
    result = total * 4;
    System.out.printf("pi = %f\n",result);
  }

  public static void main(String[] args){
    TrapezoidalRulePi application = new TrapezoidalRulePi();
    application.run(args);
  }
}
