<<<<<<< Updated upstream
public class StudentIdValidator{
  void run(String[] args){

  }

  // mainメソッドは省略．
  public static void main(String[] args){
    StudentIdValidator application = new StudentIdValidator();
    application.run(args);
  }
}
=======
public class StudentIdValidator{
  void run(String[] args){
    // ここで，printArray を呼び出し，"before"の一行を出力する．
    printArray(args);
    // argsの内容をソートするため，Arrays.sortメソッドを呼び出す．
    Arrays.sort(args); // <= args がソート済みになる．
    // ここで，printArray を呼び出し，"after"の一行を出力する．
    printArray(args);
  }

}
>>>>>>> Stashed changes
