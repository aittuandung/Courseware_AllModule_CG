package Copy_file_text;

import java.io.*;
import java.util.*;

public class CopyFileText {

    public List<String> readFile(String filePath) {
        List<String> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }


    public void writeFile(String filepath,List<String> numbers){
        try{
            FileWriter writer = new FileWriter(filepath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int l = 0; l < numbers.size() ; l++) {
                bufferedWriter.write(numbers.get( l)+ "\n");
            }
            bufferedWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        copyFileText.writeFile("/mnt/sda2/JetBrain-CodeGym/CodeGym_AllModule_Courseware/Module2_CG/Week4/IO_Text_File/src/Copy_file_text/Paste.txt",copyFileText.readFile("/mnt/sda2/JetBrain-CodeGym/CodeGym_AllModule_Courseware/Module2_CG/Week4/IO_Text_File/src/Copy_file_text/Copy.txt"));

    }
}