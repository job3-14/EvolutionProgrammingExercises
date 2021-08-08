import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.GZIPOutputStream;

public class GZip{
  void run(String[] args)throws IOException{
    out(args[0],args[1]);
  }

  void out(String inAdress, String outAdress)throws IOException{
    File file = new File(inAdress);
    String str, textZip="";
    ArrayList<String> list = new ArrayList<>();
    BufferedReader text = new BufferedReader(new FileReader(file));
    String encoding = "UTF-8";
    GZIPOutputStream gout = null;

    while((str = text.readLine()) != null){
      textZip += str;
      textZip += "\n";
    }
    gout = new GZIPOutputStream(new FileOutputStream(outAdress));
    gout.write(textZip.getBytes(encoding));
    gout.close();
    text.close();
  }

  public static void main(String[] args)throws IOException{
    GZip application = new GZip();
    application.run(args);
  }
}
