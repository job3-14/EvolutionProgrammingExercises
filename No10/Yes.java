public class Yes{
  void run(String[] args){
    out(args[0]);
  }

  void out(String args){
    while(true){
      System.out.printf("%s\n",args);
    }
  }

  public static void main(String[] args){
    Yes application = new Yes();
    application.run(args);
  }
}
