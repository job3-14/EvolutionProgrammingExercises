import java.io.*;
import java.util.*;


public class freq{
  void run(String[] args)throws IOException{
    for(Integer i=0; i < args.length; i++){
      sort(args[i]);
    }
  }

  void sort(String args)throws IOException{
    File file = new File(args);
    String str;
    Integer length,i,j,mapTmp;
    ArrayList<String> list = new ArrayList<>();
    HashMap<String, Integer> map = new HashMap<>();
    String[] splitList;

    BufferedReader text = new BufferedReader(new FileReader(file));
    while((str = text.readLine()) != null){
      list.add(str);
    }
    Collections.sort(list);
    length = list.size();

    for(i=0;i<length-1;i++){
      splitList = list.get(i).split(" ");
      for(j=0;j<splitList.length;j++){
        if(map.containsKey(splitList[j])){
          mapTmp = map.get(splitList[j]);
          mapTmp++;
          map.put(splitList[j],mapTmp);
        }else{
          map.put(splitList[j],1);
        }
      }
    }

    for(String key : map.keySet()){
      System.out.printf("%s : %d\n",key,map.get(key));
    }
    text.close();
  }

  public static void main(String[] args)throws IOException{
    freq application = new freq();
    application.run(args);
  }
}
