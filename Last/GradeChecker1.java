//053471 酒井歩夢
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class GradeChecker1{
  void run(String[] args)throws IOException{
    if(args.length != 0){
      File file = new File(args[0]);
      check(file);
    }
  }

  void check(File file)throws IOException{
    String readData;
    String[] splitdata;
    Integer lastNumber=0,i;
    HashMap<Integer, Double> point = new HashMap<>();
    HashMap<Integer, String> grade = new HashMap<>();
    FileReader fileReader = new FileReader(file);
    BufferedReader reader = new BufferedReader(fileReader);
    while ((readData = reader.readLine()) != null) {
      splitdata = readData.split(",");
      point.put(Integer.parseInt(splitdata[0]),Double.parseDouble(splitdata[1]));
    }
    lastNumber = point.size();
    for(i=1; i<=lastNumber; i++){
      if(!point.containsKey(i)){
        point.put(i,0.000);
        grade.put(i,"K");
      }else if(point.get(i) < 60){
        grade.put(i,"不可");
      }else if(point.get(i) < 70){
        grade.put(i,"可");
      }else if(point.get(i) < 80){
        grade.put(i,"良");
      }else if(point.get(i) < 90){
        grade.put(i,"優");
      }else{
        grade.put(i,"秀");
      }
      System.out.println(i+","+String.format("%.3f", point.get(i))+","+grade.get(i));
    }
    reader.close();
  }


  public static void main(String[] args)throws IOException{
    GradeChecker1 application = new GradeChecker1();
    application.run(args);
  }
}
