package util;

import com.opencsv.CSVWriter;
import model.Student;
import java.io.FileWriter;
import java.util.List;

public class CSVUtil {
    public static void writeStudentsToCSV(String fileName, List<Student> students) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(fileName))) {
            String[] header = {"Student ID", "Full Name", "Email", "Age"};
            writer.writeNext(header);

            for (Student s : students) {
                writer.writeNext(new String[]{
                        String.valueOf(s.getStudentId()),
                        s.getFullName(),
                        s.getEmail(),
                        String.valueOf(s.getAge())
                });
            }
            System.out.println(fileName + " generated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}