package az.edu.turing.module1.lesson23;

import java.io.*;


public class StudentApp {
    private static String RESOURCE_PATH = "C:\\Users\\ROMedia\\Desktop\\Turing\\turing-lessons\\src\\az\\edu\\turing\\module1\\lesson23\\resources";
    public static void main(String[] args) {
        final File file = new File(RESOURCE_PATH + "hello.txt");

        Student st = new Student(1, 23, 56, "Rasim");

        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);){
            bw.write(st.toString());
        }catch (IOException e){
                e.printStackTrace();
            }

        try {
            FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);
             String line = "";
             while ((line = br.readLine()) != null){
                 System.out.println(line);
             }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
