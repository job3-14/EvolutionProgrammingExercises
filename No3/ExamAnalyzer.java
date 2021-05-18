import java.util.Random;
public class ExamAnalyzer{
  ExamScore createRandomScore(String name){
    Random random = new Random();
    Integer math = random.nextInt(101);
    Integer physics = random.nextInt(101);
    Integer english = random.nextInt(101);
    return this.createExamScore(math, physics, english, name);
  }
}
