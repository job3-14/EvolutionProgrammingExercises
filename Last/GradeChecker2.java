import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.ArrayList;

public class GradeChecker2{
  void run(String[] args)throws IOException{
    Integer i;
    for(i=0; i<args.length; i+=3){
      if(args.length != 0){
        File fileExam = new File(args[i]);
        File fileAssignments = new File(args[i+1]);
        File fileMiniexam = new File(args[i+2]);
        //exam(fileExam);
        //assignments(fileAssignments);
        miniexam(fileMiniexam);
      }
    }
  }

  void exam(File file)throws IOException{
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
      //System.out.println(i+","+String.format("%.3f", point.get(i))+","+grade.get(i));///////////////
    }
    reader.close();
  }

  void assignments(File file)throws IOException{
    String readData;
    String[] splitdata;
    Integer pointTmp,i,currentId;
    FileReader fileReader = new FileReader(file);
    BufferedReader reader = new BufferedReader(fileReader);
    ArrayList<Integer> pointList = new ArrayList<>();
    while ((readData = reader.readLine()) != null) {
      splitdata = readData.split(",");
      pointTmp = 0;
      for(i=1;i<splitdata.length;i++){
        if(!splitdata[i].isEmpty()){
          pointTmp += Integer.parseInt(splitdata[i]);
        }
      }
      pointList.add(pointTmp);
    }
    reader.close();
  }

  void miniexam(File file)throws IOException{
    String readData;
    String[] splitdata;
    Integer rateTmp,i,countId=1,currentId;
    FileReader fileReader = new FileReader(file);
    BufferedReader reader = new BufferedReader(fileReader);
    ArrayList<Integer> rateList = new ArrayList<>();
    while ((readData = reader.readLine()) != null) {
      splitdata = readData.split(",");
      currentId = Integer.parseInt(splitdata[0]);
      if(currentId!=countId){
        for(i=0;i<currentId-countId;i++){
          rateList.add(0);
        }
        countId = currentId;
      }
      rateTmp = 0;
      for(i=1;i<splitdata.length;i++){
        if(!splitdata[i].isEmpty()){
          rateTmp ++;
        }
      }
      countId++;
      rateList.add(rateTmp);
    }
    reader.close();
  }



  public static void main(String[] args)throws IOException{
    GradeChecker2 application = new GradeChecker2();
    application.run(args);
  }
}
