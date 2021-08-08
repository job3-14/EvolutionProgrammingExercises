public class ComparingString{
  void run(String[] args){
    for(Integer i=0; i < args.length; i++){
      serch(args[i]);
    }
  }

  void serch(String args){
    if(args.equals("KSU_AP")){
      System.out.printf("渡された文字列は \"KSU_AP\" です.\n");
    }else{
      System.out.printf("渡された文字列は \"KSU_AP\"ではなく\"%s\"です．\n",args);
    }
  }

  public static void main(String[] args){
    ComparingString application = new ComparingString();
    application.run(args);
  }
}
