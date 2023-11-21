package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class UpdateFileContent {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fileName = sc.nextLine();


        System.out.println("Enter Text:");

        String Text = sc.nextLine();


        appendToTextFile(fileName, Text);

        sc.close();

    }
    public static void appendToTextFile(String fileName, String Text) throws Exception{

        File f = new File("C:\\Users\\knsva\\Downloads\\JavaFiles\\"+fileName);
        FileWriter fw = new FileWriter(f,true);

        BufferedWriter bw = new BufferedWriter(fw);

        if((Text)!=null) {
            bw.write("\n"+Text);
        }
        else {
            System.out.println("Enter text");
        }

        bw.flush();
        bw.close();
    }
}
