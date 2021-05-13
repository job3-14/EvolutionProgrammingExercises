public class Echo{
  void run(String[] args){
    Double inputNumber;
    boolean optionN = false;
    boolean optionH = false;
    Integer i, optionLocate=-1;
    for(i=0; i<args.length; i++){
      if(args[i].equals("-h")){
        optionH = true;
        optionLocate = i;
      }
      else if(args[i].equals("-n")){
        optionN = true;
        optionLocate = i;
      }
    }

    if(optionH){
      System.out.printf("java Echo [OPTIONS] <string...>\n");
      System.out.printf("OPTIONS\n");
      System.out.printf("    -h: このメッセージを表示して終了する．\n");
      System.out.printf("    -n: 改行せずに出力する．\n");
    }

    for(i=0; i<args.length; i++){
      if(i != optionLocate){
        System.out.printf("%s ",args[i]);
      }
    }

    if(!optionN){
      System.out.printf("\n");
    }
  }


  public static void main(String[] args){
    Echo application = new Echo();
    application.run(args);
  }
}
