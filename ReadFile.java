//問題9
//ファイル report.txt の内容を画面に出力するプログラム ReadFile.java を作成してください
//
package app09.com.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {
	public static void main(String[] args) {
        String filePath = "D:\\report.txt"; // ファイル名

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            fileInputStream.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
	}
}

