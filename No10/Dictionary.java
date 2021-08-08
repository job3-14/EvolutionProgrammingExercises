import java.util.HashMap;

public class Dictionary{
  void run(String[] args){
    for(Integer i=0; i < args.length; i++){
      serch(args[i]);
    }
  }

  void serch(String word){
     HashMap<String, String> dic = new HashMap<>();
     dic.put("sun","太陽");
     dic.put("cloud","雲");
     dic.put("rain","雨");
     dic.put("computer","コンピューター");
     dic.put("bottle","容器");
     dic.put("food","食べ物");
     dic.put("pen","ペン");
     String result = dic.get(word);
     if(result != null){
      System.out.printf("%s: %s\n",word,result);
    }else{
      System.out.printf("見つかりませんでした\n");
    }
  }

  public static void main(String[] args){
    Dictionary application = new Dictionary();
    application.run(args);
  }
}
