package Doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv {
    public static List<Countries> readFile() {
        List<Countries> countriesList = new ArrayList<>();
        try {
            File file = new File("/mnt/sda2/JetBrain-CodeGym/CodeGym_AllModule_Courseware/Module2_CG/Week4/IO_Text_File/src/Doc_file_csv/countries.csv");

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str = bufferedReader.readLine();
            while (str != null) {
                String[] arr = str.split(",");
                int id = Integer.parseInt(arr[0]);
                Countries countries = new Countries(id, arr[1], arr[2]);
                countriesList.add(countries);
                str = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countriesList;
    }

    public static void main(String[] args) {
        List<Countries> countries =readFile();
        for (Countries cou : countries) {
            System.out.println(cou);
        }
    }
}
