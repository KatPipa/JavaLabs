package edu.ntudp.fit.lb5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MyJDBC {
    private static final String USER = "root";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Kate1612&best");
            int birthMonth = 8;
            String query = "select * from studentslist WHERE MONTH(Birthday) = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, birthMonth);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("StudentID");
                String surname = resultSet.getString("Surname");
                String name = resultSet.getString("Name");
                String patronymic = resultSet.getString("Patronymic");
                String birthday = resultSet.getString("Birthday");
                String recordBook = resultSet.getString("Record-book");
                System.out.print(id + " ");
                System.out.print(surname + " ");
                System.out.print(name + " ");
                System.out.print(patronymic + " ");
                System.out.print("Birthday: " + birthday + " ");
                System.out.println("Record-book: " + recordBook + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
    }


