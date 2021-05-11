public class StudentIdValidator{
  void run(String[] args){
    Integer i;
    for(i=0; i<args.length; i++){
      validate(args[i]);
    }
  }

  void validate(String id){
    Integer length1, intId;
    length1 = id.length();
    if(length1 != 6){
      System.out.printf(id + ": not student\n");
      System.exit(0);
    }
    validateId(id);

  }

  void validateId(String id){
    Integer i;
    String tmpId;
    Integer total = 0;
    for(i=1;i<=6;i++){
      tmpId = id.substring(i-1, i);
      total += Integer.parseInt(tmpId);
    }
    if(total%10 == 0){
      System.out.println(id + ": valid\n");
    }else{
      System.out.println(id +": invalid\n");
    }
  }

  public static void main(String[] args){
    StudentIdValidator application = new StudentIdValidator();
    application.run(args);
  }
}
