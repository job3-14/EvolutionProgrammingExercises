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
    }else if(discrimination == 0){
      multipleSolution(inputA, inputB, inputC);
    }else{
      imaginarySolution(inputA, inputB, inputC);
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

  //重解
  void multipleSolution(Double inputA, Double inputB, Double inputC){
    Double result1, rootResult, root;
    root = inputB * inputB -1 * (4 * inputA * inputC);
    rootResult = Math.sqrt(root);
    result1 = (-1 * inputB + rootResult) / 2 * inputA;
    System.out.printf("answer = %f\n",result1);
  }

  //虚数解
  void imaginarySolution(Double inputA, Double inputB, Double inputC){
    Double real, imaginary, minusImaginary , root, result1, result2;
    real = -1 * inputB / 2 * inputA;
    root = Math.sqrt(-1 * ( inputB * inputB -1 *(4 * inputA * inputC)));
    imaginary = root / 2 * inputA;
    minusImaginary = -1 * (root / 2 * inputA);
    System.out.printf("result = %f + %f i , %f - %f i \n",real,imaginary,real,imaginary);
  }


  public static void main(String[] args){
    QuadraticEquation application = new QuadraticEquation();
    application.run(args);
  }
}
