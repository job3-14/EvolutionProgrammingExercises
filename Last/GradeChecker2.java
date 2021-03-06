//053471 酒井歩夢
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.ArrayList;

public class GradeChecker2{
  void run(String[] args)throws IOException{
    Integer i;
    HashMap<Integer, Double> examMap = new HashMap<>();
    ArrayList<Integer> assignmentsList = new ArrayList<>();
    ArrayList<Integer> miniexamList = new ArrayList<>();
    for(i=0; i<args.length; i+=3){
      File fileExam = new File(args[i]);
      File fileAssignments = new File(args[i+1]);
      File fileMiniexam = new File(args[i+2]);
      examMap = exam(fileExam);
      assignmentsList = assignments(fileAssignments);
      miniexamList = miniexam(fileMiniexam);
      total(examMap,assignmentsList,miniexamList);
    }
  }

  HashMap<Integer, Double> exam(File file)throws IOException{
    String readData;
    String[] splitdata;
    Integer lastNumber=0,i;
    HashMap<Integer, Double> point = new HashMap<>();
    FileReader fileReader = new FileReader(file);
    BufferedReader reader = new BufferedReader(fileReader);
    while ((readData = reader.readLine()) != null) {
      splitdata = readData.split(",");
      point.put(Integer.parseInt(splitdata[0]),Double.parseDouble(splitdata[1]));
      lastNumber = Integer.parseInt(splitdata[0]);
    }
    for(i=1; i<=lastNumber; i++){
      if(!point.containsKey(i)){
        point.put(i,-1.0);
      }
    }
    reader.close();
    return point;
  }

  ArrayList<Integer> assignments(File file)throws IOException{
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
    return pointList;
  }

  ArrayList<Integer> miniexam(File file)throws IOException{
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
    return rateList;
  }

  void total(HashMap<Integer, Double> examMap,ArrayList<Integer> assignmentsList,ArrayList<Integer> miniexam){
    Integer totalcount,score,i;
    Double doubleScore;
    String grade;
    totalcount = examMap.size();
    for(i=1;i<=totalcount;i++){
      if(examMap.get(i)==-1.0){
        grade = "K";
        doubleScore = 25.0/60.0*assignmentsList.get(i-1)+5.0*miniexam.get(i-1)/14.0;
        score = (int)Math.ceil(doubleScore);
        System.out.println(i+","+score+","+","+assignmentsList.get(i-1)+","+miniexam.get(i-1)+","+grade);
      }else{
        doubleScore = 70.0/100.0*examMap.get(i)+25.0/60.0*assignmentsList.get(i-1)+5.0*miniexam.get(i-1)/14.0;
        score = (int)Math.ceil(doubleScore);
        if(score < 60){
          grade = "不可";
        }else if(score < 70){
          grade = "可";
        }else if(score < 80){
          grade = "良";
        }else if(score < 90){
          grade = "優";
        }else{
          grade = "秀";
        }
        System.out.println(i+","+score+","+String.format("%.3f",examMap.get(i))+","+assignmentsList.get(i-1)+","+miniexam.get(i-1)+","+grade);
      }


    }
  }



  public static void main(String[] args)throws IOException{
    GradeChecker2 application = new GradeChecker2();
    application.run(args);
  }
}
