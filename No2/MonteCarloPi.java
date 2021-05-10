public class MonteCarloPi{
  void run(String[] args){
    Integer inputNumber;
    if(args.length == 1){
      inputNumber = Integer.valueOf(args[0]);
    }else{
      inputNumber = 1000;
    }
  }

  public static void main(String[] args){
    MonteCarloPi application = new MonteCarloPi();
    application.run(args);
  }
}
