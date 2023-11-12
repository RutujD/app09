//問題１１
/*ファイル report.txt に記述された内容を読み込んで「本日の作業内容：」の下に自身の作業内容を付
加し、「作業時間：」にプログラムを作成するのに要した時間を記述してファイル report3.txt に書き込み
するプログラム ReadWriteFile.java を作成してください。*/
package app11.com.test;

import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args) {
        String readFile = "D:\\report.txt";
        String writeFile = "D:\\report3.txt";
        String additionalWork = "作業内容：新しいプログラムを開発しました。";
        String timeTaken = "2時間"; // 作業に要した時間

        try {
            FileReader fileReader = new FileReader(readFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(writeFile, true); // true for append mode
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // 読み込んだ内容を report3.txt に書き込み
                bufferedWriter.write(line + "\n");

                // "本日の作業内容：" の下に自身の作業内容を追加
                if (line.contains("本日の作業内容：")) {
                    bufferedWriter.write(additionalWork + "\n");
                }

                // "作業時間：" の下にプログラムを作成するのに要した時間を追加
                if (line.contains("作業時間：")) {
                    bufferedWriter.write("作業時間：" + timeTaken + "\n");
                }
            }

            fileReader.close();
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("ファイルに書き込みました。");

        } catch (IOException e) {
            System.err.println("エラー: " + e.getMessage());
        }
    }
}
