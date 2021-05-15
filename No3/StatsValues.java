
import java.util.Random;
import java.util.ArrayList;
public class StatsValues{
  void run(String[] args){
    Integer i, randomValue, total=0, max=0, min=999, tmpList;
    Double ave;
    ArrayList<Integer> randomList = new ArrayList<>();
    Random random = new Random();
    for(i=0;i<100;i++){
      randomValue = random.nextInt(1000);
      randomList.add(randomValue);
    }

    for(i=0;i<100;i++){
      tmpList = randomList.get(i);
      total += tmpList;
      if(max < tmpList){
        max = tmpList;
      }
      if(min > tmpList){
        min = tmpList;
      }
    }

    ave = (double)total / 100;
    System.out.printf("合計: %d, 最大値: %d, 最小値: %d, 平均値: %f\n",total,max,min,ave);

    for(i=1;i<=100;i++){
      tmpList = randomList.get(i-1);
      System.out.printf("%3d ",tmpList);
      if(i%10 == 0){
        System.out.printf("\n");
      }
    }
  }

  public static void main(String[] args){
    StatsValues application = new StatsValues();
    application.run(args);
  }
}
