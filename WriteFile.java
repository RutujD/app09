//問題10
//ファイル report2.txt に次の内容を書き込むプログラム WriteFile.java を作成してください
//

package app10.com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
        String filePath = "D:\\report2.txt";
        String content = "\t報告書\n\n本日の作業内容: \n\tファイル書き込みプログラムの作成、\n\n作業時間:\n\t 1時間\n以上、報告終わり。";

        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(content);

            bufferedWriter.close();
            System.out.println("ファイルに書き込みました。");
        } catch (IOException e) {
            System.err.println("ファイルに書き込めませんでした: " + e.getMessage());
        }
    }
}
