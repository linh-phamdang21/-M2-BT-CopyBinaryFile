import java.io.*;

public class CopyBinaryFile {
    public static final String DEFAULT_CONTENT = "Hello World!";
    public static void createSourceFile(){
        File file = new File("SourceFile.txt");
        FileWriter fileWriter = null;
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write(DEFAULT_CONTENT);
            fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void copyContent(String sourceFile){

    }

    public static void copyToNewFile(String targetFile){

    }

    public static void main(String[] args) {
        createSourceFile();
    }
}
