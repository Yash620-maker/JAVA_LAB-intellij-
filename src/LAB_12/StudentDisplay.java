package LAB_12;

import java.sql.*;

class StudentDisplay {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/cse7";
        String user = "root";
        String password = "password";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("Student Records:");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " " + name + " " + age);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}