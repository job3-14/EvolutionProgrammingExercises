import java.io.File;

public class MakeDirectory{
  void run(String[] args){
    File dir = new File(args[0]);
    makedir(dir);
  }

  void makedir(File dir){
    dir.mkdir();
  }

  public static void main(String[] args){
    MakeDirectory application = new MakeDirectory();
    application.run(args);
  }
}
