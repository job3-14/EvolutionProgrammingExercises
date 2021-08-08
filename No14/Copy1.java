import java.io.*;
import java.util.*;

public class Copy1{
    void run(String[] args) throws IOException{
        if(args.length<2){
          System.out.printf("cp: コマンドライン引数には，少なくとも，コピー元，コピー先を指定する必要があります．\n");
          System.exit(0);
        }
        File from = new File(args[0]);
        File to = new File(args[1]);
        copy(from,to);

    }

    void copy(File from, File to) throws IOException{
        String str;
        Integer length,i;
        ArrayList<String> list = new ArrayList<>();

        BufferedReader text = new BufferedReader(new FileReader(from));
        PrintWriter out = new PrintWriter(new FileWriter(to));

        while((str = text.readLine()) != null){
          out.print(str);
          out.print("\n");
        }
        out.close();
        text.close();

    }

    public static void main(String[] args)throws IOException{
      Copy1 application = new Copy1();
      application.run(args);
    }
}
