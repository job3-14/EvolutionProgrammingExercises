public class QuadraticEquation{
  void run(String[] args){
    Double inputA = Double.valueOf(args[0]);
    Double inputB = Double.valueOf(args[1]);
    Double inputC = Double.valueOf(args[2]);
    discriminant(inputA, inputB, inputC);
  }

  void discriminant(Double inputA, Double inputB, Double inputC){
    Double discrimination;
    discrimination = inputB * inputB -1 *(4 * inputA * inputC);
    //System.out.println(discrimination); //rootResult
    if(discrimination > 0){
      realNumberSolution(inputA, inputB, inputC);
    }
  }

  //実数部計算
  void realNumberSolution(Double inputA, Double inputB, Double inputC){
    Double result1, result2, rootResult, root;
    root = inputB * inputB -1 * (4 * inputA * inputC);
    rootResult = Math.sqrt(root);
    result1 = (-1 * inputB + rootResult) / 2 * inputA;
    result2 = (-1 * inputB - rootResult) / 2 * inputA;
    System.out.printf("answer = %f %f\n",result1, result2);
  }

  public static void main(String[] args){
    QuadraticEquation application = new QuadraticEquation();
    application.run(args);
  }
}
