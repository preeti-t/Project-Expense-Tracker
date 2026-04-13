//package dao;
//
//import model.Student;
//import java.sql.*;
//import java.util.*;
//
//public class StudentDAO {
//
//    private static final String URL = "jdbc:postgresql://localhost:5432/practice_db";
//    private static final String USER = "postgres";
//    private static final String PASSWORD = "Postgres123";
//
//    public List<Student> getAllStudents() {
//        List<Student> students = new ArrayList<>();
//        String sql = "SELECT student_id, full_name, email, age FROM students";
//
//        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//
//            while (rs.next()) {
//                students.add(new Student(
//                        rs.getInt("student_id"),
//                        rs.getString("full_name"),
//                        rs.getString("email"),
//                        rs.getInt("age")
//                ));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return students;
//    }
//}