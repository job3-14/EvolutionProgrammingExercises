import java.io.File;
import java.util.Objects;
import java.util.ArrayList;

public class FileFinder{
  ArrayList<File> result = new ArrayList<>();
  void run(String[] args){
    serch(new File(args[1]),args[0]);
    if(result.size() != 0){
        System.out.printf("%s%n",result.get(result.size() - 1));
    }else{
      System.out.printf("%s : Not found.%n",args[0]);
    }
  }

  void serch(File file, String serchName){
    if(file.isDirectory()){
      File[] files = file.listFiles();
      for(File f: files){
        if(Objects.equals(serchName, f.getName())){
          result.add(f);
        }
        this.serch(f, serchName);
      }
    }
  }


  public static void main(String[] args){
    FileFinder application = new FileFinder();
    application.run(args);
  }
}
