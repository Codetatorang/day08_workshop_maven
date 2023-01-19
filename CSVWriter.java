package sg.edu.nus.iss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPERATOR = "\n";

    private static final String FILE_HEADER = "staffNo,fullName,department,role,emailAddress,salary";

    String dirPath = ".//data";
    String fileName = "data.txt";

    public List<Employee> employees = null;

    public List<Employee> generateEmployees() {
        employees = new ArrayList<Employee>();

        // create some employees
        Employee emp1 = new Employee(12345, "Dionne", "SS", "Advisor", "test1@gmail.com", 20000);
        Employee emp2 = new Employee(12345, "Gionne", "SS", "Advisor", "test2@gmail.com", 10000);
        Employee emp3 = new Employee(12345, "Fionne", "SS", "Advisor", "test3@gmail.com", 15000);

        //add the employees to the list of employees
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName)throws IOException{
        FileWriter fw = new FileWriter(fileName);

        //write FILE_HEADER to csv
        fw.append(FILE_HEADER.toString());
        fw.append(NEWLINE_SEPERATOR);

        //read records ro wby row and write it to the file using fw.append()
        for (Employee e: employees) {
            fw.append(e.getStaffNo().toString());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getRole());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getEmailAddress());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getSalary().toString());
            fw.append(NEWLINE_SEPERATOR);
        }

        //flush and close the file writer
        fw.flush();
        fw.close();

    }

}
