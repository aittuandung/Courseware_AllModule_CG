package dao;

import connect.Connect_MySQL;
import model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public List<Student> getAll() {
        String sql = "select * from student";
        List<Student> students = new ArrayList<>();
        try (Connection connection = Connect_MySQL.getConnect()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("RN");
                String name = resultSet.getString("Name");
                int age = resultSet.getInt("Age");
                String status = resultSet.getString("status");
                students.add(new Student(id, name, age, status));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return students;
    }

    public boolean save(Student student) {
        String sql = "insert into student value (?,?,?,?)";
        try (Connection connection = Connect_MySQL.getConnect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setString(4, student.getStatus());

            return preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }

    }
}
