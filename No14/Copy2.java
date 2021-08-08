import java.io.*;
import java.util.*;

public class Copy2{
  void run(String[] args) throws IOException{
    File from, to, fileName;
    String path;
    for(Integer i=0; i < args.length-1; i++){
      path = args[args.length-1] + "/" + args[i];
      from = new File(args[i]);
      to = new File(path);
      fileName = new File(args[args.length-1]);
      copy(from,to,fileName);
    }

  }

  void copy(File from, File to, File fileName) throws IOException{
    String str;
    Integer length,i;
    ArrayList<String> list = new ArrayList<>();

    if(!fileName.exists()){
      if(!fileName.mkdir()){
        System.out.println("フォルダの作成に失敗しました");
        System.exit(0);
        }
    }

    BufferedReader text = new BufferedReader(new FileReader(from));
    PrintWriter out = new PrintWriter(new FileWriter(to));

    while((str = text.readLine()) != null){
      out.print(str);
      out.print("\n");
    }
    out.close();
    text.close();

  }

  public static void main(String[] args)throws IOException{
    Copy2 application = new Copy2();
    application.run(args);
  }
}
