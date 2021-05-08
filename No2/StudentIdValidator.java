public class StudentIdValidator{
  void run(String[] args){
    System.out.println(args[0]);  ///test
    validate(args[0]);
  }

  void validate(String id){
    Integer length1, intId;
    length1 = id.length();
    if(length1 != 6){
      System.exit(0);
    }
    System.out.println(length1); ///test
    intId = Integer.parseInt(id);



  }

  public static void main(String[] args){
    StudentIdValidator application = new StudentIdValidator();
    application.run(args);
  }
}
