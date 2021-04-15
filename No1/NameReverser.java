public class NameReverser{
  public static void main(String[] args){
    Integer length, i, position;
    String name = "AYUMU SAKAI";
    Character str;
    System.out.printf("%s%n",name);
    length = name.length();
    for(i=length-1; i>=0; i--){
      str = name.charAt(i);
      System.out.printf("%s",str);
    }
    System.out.printf("%n");



  }
}
