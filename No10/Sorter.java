import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Sorter{
  void run(String[] args)throws IOException{
    sort(args[0]);
  }

  void sort(String args)throws IOException{
    File file = new File(args);
    String str;
    Integer length,i;
    ArrayList<String> list = new ArrayList<>();
    BufferedReader text = new BufferedReader(new FileReader(file));
    while((str = text.readLine()) != null){
      list.add(str);
    }
    Collections.sort(list);
    length = list.size();
    for(i=0;i<length-1;i++){
      System.out.printf("%s\n",list.get(i));
    }
    text.close();
  }

  public static void main(String[] args)throws IOException{
    Sorter application = new Sorter();
    application.run(args);
  }
}
