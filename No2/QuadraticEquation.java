public class QuadraticEquation{
  void run(String[] args){
    Double inputA = Double.valueOf(args[0]);
    Double inputB = Double.valueOf(args[1]);
    Double inputC = Double.valueOf(args[2]);
    discriminant(inputA, inputB, inputC);
  }

  void discriminant(Double inputA, Double inputB, Double inputC){
    System.out.println(inputA);
  }

  public static void main(String[] args){
    QuadraticEquation application = new QuadraticEquation();
    application.run(args);
  }
}
