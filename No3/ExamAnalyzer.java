import java.util.Random;
import java.util.ArrayList;
public class ExamAnalyzer{
  ExamScore createRandomScore(String name){
    Random random = new Random();
    Integer math = random.nextInt(101);
    Integer physics = random.nextInt(101);
    Integer english = random.nextInt(101);
    return this.createExamScore(math, physics, english, name);
  }

  ExamScore createExamScore(Integer math, Integer physics, Integer english, String name){
    ExamScore examScore = new ExamScore();
    examScore.math = math;
    examScore.physics = physics;
    examScore.english = english;
    examScore.name = name;
    return examScore;
  }

  void run(){
    Integer i, max, min;
    ExamScore tmpScore;
    Double ave;
    ArrayList<ExamScore> examScorelist = new ArrayList<ExamScore>();
    for(i=0;i<10;i++){
      examScorelist.add(createRandomScore(i.toString()));
    }
    System.out.printf("       math   phys   eng    ave\n");
    System.out.printf("ave  ");



    //ave計算
    ave = 0.0;
    for(i=0;i<10;i++){
      tmpScore = examScorelist.get(i);
      ave += (double)tmpScore.math;
    }
    ave /= 10.0;
    System.out.printf("%6.3f ",ave);

    ave = 0.0;
    for(i=0;i<10;i++){
      tmpScore = examScorelist.get(i);
      ave += (double)tmpScore.physics;
    }
    ave /= 10.0;
    System.out.printf("%6.3f ",ave);

    ave = 0.0;
    for(i=0;i<10;i++){
      tmpScore = examScorelist.get(i);
      ave += (double)tmpScore.english;
    }
    ave /= 10.0;
    System.out.printf("%6.3f\n",ave);

    //max 計算
    System.out.printf("max     ");
    max = 0;
    for(i=0;i<10;i++){
      tmpScore = examScorelist.get(i);
      if(tmpScore.math > max){
        max = tmpScore.math;
      }
    }
    System.out.printf("%3d    ",max);

    max = 0;
    for(i=0;i<10;i++){
      tmpScore = examScorelist.get(i);
      if(tmpScore.math > max){
        max = tmpScore.physics;
      }
    }
    System.out.printf("%3d   ",max);

    max = 0;
    for(i=0;i<10;i++){
      tmpScore = examScorelist.get(i);
      if(tmpScore.math > max){
        max = tmpScore.english;
      }
    }
    System.out.printf("%3d\n",max);


    //min 計算
    System.out.printf("min     ");
    min = 999;
    for(i=0;i<10;i++){
      tmpScore = examScorelist.get(i);
      if(tmpScore.math < min){
        min = tmpScore.math;
      }
    }
    System.out.printf("%3d    ",min);

    min = 999;
    for(i=0;i<10;i++){
      tmpScore = examScorelist.get(i);
      if(tmpScore.math < min){
        min = tmpScore.physics;
      }
    }
    System.out.printf("%3d   ",min);

    min = 999;
    for(i=0;i<10;i++){
      tmpScore = examScorelist.get(i);
      if(tmpScore.math < min){
        min = tmpScore.english;
      }
    }
    System.out.printf("%3d\n",min);












    for(i=0;i<10;i++){
      tmpScore = examScorelist.get(i);
      System.out.printf("  %s     ",tmpScore.name);
      System.out.printf("%3d    ",tmpScore.math);
      System.out.printf("%3d   ",tmpScore.physics);
      System.out.printf("%3d    ",tmpScore.english);
      ave = ((double)tmpScore.math + (double)tmpScore.physics + (double)tmpScore.english) / 3;
      System.out.printf("%6.3f", ave);
      System.out.printf("\n");

    }
  }

  public static void main(String[] args){
    ExamAnalyzer application = new ExamAnalyzer();
    application.run();
  }

}
