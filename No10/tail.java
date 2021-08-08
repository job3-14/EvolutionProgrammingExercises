import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class tail{
  void run(String[] args)throws IOException{
    out(args[0],Integer.parseInt(args[1]));
  }

  void out(String args, Integer number)throws IOException{
    File file = new File(args);
    String str;
    Integer length,i;
    ArrayList<String> list = new ArrayList<>();
    BufferedReader text = new BufferedReader(new FileReader(file));
    while((str = text.readLine()) != null){
      list.add(str);
    }
    length = list.size();
    for(i=length-number;i<length;i++){
      System.out.printf("%s\n",list.get(i));
    }
    text.close();
  }

  public static void main(String[] args)throws IOException{
    tail application = new tail();
    application.run(args);
  }
}
