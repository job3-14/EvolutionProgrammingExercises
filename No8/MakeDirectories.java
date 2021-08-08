import java.io.File;

public class MakeDirectories{
  void run(String[] args){
    for(Integer i=0; i < args.length; i++){
    File dir = new File(args[i]);
    makedir(dir);
  }
  }

  void makedir(File dir){
    dir.mkdirs();
  }

  public static void main(String[] args){
    MakeDirectories application = new MakeDirectories();
    application.run(args);
  }
}
