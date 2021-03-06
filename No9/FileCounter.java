import java.io.File;

public class FileCounter{
  void run(String[] args){
    serch(new File(args[0]));
  }

  void serch(File file){
    Integer fileCount=0, directoryCount=0;
    File[] files = file.listFiles();
    for(File f: files){
      if(f.isDirectory()){
        directoryCount ++;
      }else{
        fileCount ++;
      }
    System.out.printf("%s%n",f.getName());
    }
    System.out.printf("file: %d, dir: %d%n",fileCount, directoryCount);
  }


  public static void main(String[] args){
    FileCounter application = new FileCounter();
    application.run(args);
  }
}
