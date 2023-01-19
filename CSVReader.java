package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CSVReader {
    public static final String COMMA_DELIMITER = ",";

    public void ReadCSV(String fileName) throws IOException{
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        List<String> tempList = new LinkedList<String>();
        //read from CSV file
        while((line = br.readLine()) != null){
            tempList.add(line);
        }

        for (String s: tempList) {
            System.out.println(s);
        }

        br.close();
    }

    public void ReadCSV2(String fileName)throws IOException{
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
         
        while((line = br.readLine()) != null){
            String[] tempArray = line.split(COMMA_DELIMITER);
            //need to continue from here (need to discard first line)
        }
    }
    /*open fileread
     * loop file til eof
     * scanner / bufferedreader
     * put data into string[] into employee object
     * add employee object into list of employees
     * close filereader
     * return employee list of object
     * print list of employees
     * 
     */
}
