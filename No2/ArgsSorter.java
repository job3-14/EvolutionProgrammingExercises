import java.util.Arrays;
public class ArgsSorter{
  void run(String[] args){
    // ここで，printArray を呼び出し，"before"の一行を出力する．

    // argsの内容をソートするため，Arrays.sortメソッドを呼び出す．
    Arrays.sort(args); // <= args がソート済みになる．
    // ここで，printArray を呼び出し，"after"の一行を出力する．
  }
  // printArrayメソッドをここに書く．
  void printArray(String[] args){
  Integer i;
  for(i=0;i<args.length; i++){
    //System.out.printf(".");
  }
}
  // mainメソッドは省略．
  public static void main(String[] args){
    run(args);
  }
}
