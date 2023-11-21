package FileHandling;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FileRename{
    public static void main(String[] args) throws IOException {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter New File Name");
        String newFileName=sc.next();
        renameFile("C:/Users/knsva/Downloads/JavaFiles/oldFile.txt",newFileName);

    }

    // Rename Method
    public static void renameFile(String filePath, String newFileName) throws IOException {
        File file = new File (filePath);
        file.createNewFile ();
        String []path=filePath.split ("/");

        int len= path.length;
        String newPath="";
        for(int i=0;i<len-1;i++){
            newPath+=path[i]+"/";
        }
        newPath = newPath+newFileName+".txt";

        File newFile = new File (newPath);
        file.renameTo (newFile);
    }
}