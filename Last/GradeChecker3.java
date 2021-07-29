import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.ArrayList;

public class GradeChecker3{
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
    ArrayList<Integer> totalList = new ArrayList<>();
    ArrayList<Integer> passList = new ArrayList<>();
    HashMap<String, Integer> gradeMap = new HashMap<>();
    gradeMap.put("秀",0);
    gradeMap.put("優",0);
    gradeMap.put("良",0);
    gradeMap.put("可",0);
    gradeMap.put("不可",0);
    gradeMap.put("K",0);
    totalcount = examMap.size();
    for(i=1;i<=totalcount;i++){
      doubleScore = 70.0/100.0*examMap.get(i)+25.0/60.0*assignmentsList.get(i-1)+5.0*miniexam.get(i-1)/14.0;
      score = (int)Math.ceil(doubleScore);
      if(examMap.get(i)==-1.0){
        grade = "K";
        gradeMap.put(grade,gradeMap.get(grade)+1);
        doubleScore = 25.0/60.0*assignmentsList.get(i-1)+5.0*miniexam.get(i-1)/14.0;
        score = (int)Math.ceil(doubleScore);
        System.out.println(i+","+score+","+","+assignmentsList.get(i-1)+","+miniexam.get(i-1)+","+grade);
        totalList.add(score);
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
        gradeMap.put(grade,gradeMap.get(grade)+1);
        System.out.println(i+","+score+","+String.format("%.3f",examMap.get(i))+","+assignmentsList.get(i-1)+","+miniexam.get(i-1)+","+grade);
        if(score >= 60){
          passList.add(score);
        }
        totalList.add(score);
      }
    }
    statistics(totalList,passList);
    totalGrade(gradeMap);
  }

  void statistics(ArrayList<Integer> totalList, ArrayList<Integer> passList){
    Integer i,tmp;
    HashMap<String, Double> statisticsMap = new HashMap<>();
    HashMap<String, Integer> gradeMap = new HashMap<>();
    tmp = 0;
    for(i=0;i<totalList.size();i++){
      tmp += totalList.get(i);
    }
    statisticsMap.put("totalAvg",(double)tmp/totalList.size());
    tmp = 0;
    for(i=0;i<totalList.size();i++){
      if(tmp<=totalList.get(i)){
        tmp = totalList.get(i);
      }
    }
    statisticsMap.put("totalMax",(double)tmp);
    tmp = 100;
    for(i=0;i<totalList.size();i++){
      if(tmp>=totalList.get(i)){
        tmp = totalList.get(i);
      }
    }
    statisticsMap.put("totalMin",(double)tmp);


    tmp = 0;
    for(i=0;i<passList.size();i++){
      tmp += passList.get(i);
    }
    statisticsMap.put("passAvg",(double)tmp/passList.size());
    tmp = 0;
    for(i=0;i<passList.size();i++){
      if(tmp<=passList.get(i)){
        tmp = passList.get(i);
      }
    }
    statisticsMap.put("passMax",(double)tmp);
    tmp = 100;
    for(i=0;i<passList.size();i++){
      if(tmp>=passList.get(i)){
        tmp = passList.get(i);
      }
    }
    statisticsMap.put("passMin",(double)tmp);
    System.out.println("Avg: "+String.format("%.3f",statisticsMap.get("totalAvg"))+" ("+String.format("%.3f",statisticsMap.get("passAvg"))+")");
    System.out.println("Max: "+String.format("%.3f",statisticsMap.get("totalMax"))+" ("+String.format("%.3f",statisticsMap.get("passMax"))+")");
    System.out.println("Min: "+String.format("%.3f",statisticsMap.get("totalMin"))+" ("+String.format("%.3f",statisticsMap.get("passMin"))+")");
  }

  void totalGrade(HashMap<String, Integer> gradeMap){
    System.out.println("秀:   "+gradeMap.get("秀"));
    System.out.println("優:   "+gradeMap.get("優"));
    System.out.println("良:   "+gradeMap.get("良"));
    System.out.println("可:   "+gradeMap.get("可"));
    System.out.println("不可: "+gradeMap.get("不可"));
    System.out.println("K:    "+gradeMap.get("K"));

  }



  public static void main(String[] args)throws IOException{
    GradeChecker3 application = new GradeChecker3();
    application.run(args);
  }
}
