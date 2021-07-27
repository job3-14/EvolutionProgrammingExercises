import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author tool-taro.com
 */
public class GZIPTest {

    public static void main(String[] args) throws IOException {

        //圧縮対象のデータ(今回は文字列)
        String source = "これはテストです。\n以上。";
        //圧縮後のファイルの保存場所
        String outputFilePath = "output.txt.gz";
        //圧縮前にバイト配列に置き換える際のエンコーディング
        String encoding = "UTF-8";

        GZIPOutputStream gout = null;

        try {
            gout = new GZIPOutputStream(new FileOutputStream(outputFilePath));
            gout.write(source.getBytes(encoding));
        }
        finally {
            if (gout != null) {
                try {
                    gout.close();
                }
                catch (IOException e) {
                }
            }
        }
    }
}
