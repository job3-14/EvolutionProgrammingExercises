public class ArgsReverser{
  void run(String[] args){
    for(Integer i=0; i < args.length; i++){
      out(args[i]);
    }
  }

  void out(String args){
    Integer length = args.length();
    System.out.printf("%s ,",args);
    for(Integer i=length; i>0; i--){
         System.out.printf("%s",args.charAt(i-1));
    }
    System.out.printf("\n");
  }

  public static void main(String[] args){
    ArgsReverser application = new ArgsReverser();
    application.run(args);
  }
}
