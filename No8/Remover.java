import java.io.File;

public class Remover{
  void run(String[] args){
    for(Integer i=0; i < args.length; i++){
      File dir = new File(args[i]);
      makedir(dir);
    }
  }


  public static void main(String[] args){
    Remover application = new Remover();
    application.run(args);
  }
}
