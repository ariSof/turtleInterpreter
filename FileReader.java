/**
 * Class reads the file and returns it in a list of commands
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader implements IFileReader {

    private File myElementList;
    private ArrayList<String> commands;

    public void setFileName(String fileName){
        myElementList = new File(fileName);
        commands = new ArrayList<>();
    }
    
    //Read each line and create tree of commands
    public ArrayList<String> readFile() {
        try (Scanner myReader = new Scanner(myElementList)) {
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            commands.add(data);
        }
        } catch (FileNotFoundException e) {
        
            System.out.println("File not found.");
            e.printStackTrace();
        }
       // String noData = "no data.";
        //commands.add(noData);
        return commands;
    }    
    
}
