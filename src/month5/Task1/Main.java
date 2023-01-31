package month5.Task1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final String URL = "jdbc:postgresql://localhost:5432/it.academy";
        final String USER_NAME = "postgres";
        final String PASSWORD = "hr";

        Connection connection;

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

            List<Person> people = new ArrayList<>();

            try {
                Statement statement = connection.createStatement();
                String SQL = "SELECT * FROM PERSON";
                ResultSet resultSet = statement.executeQuery(SQL);

                while (resultSet.next()) {
                    Person person = new Person();

                    person.setId(resultSet.getInt("id"));
                    person.setName(resultSet.getString("name"));
                    person.setAge(resultSet.getInt("age"));

                    people.add(person);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            for (Person list : people) {
                System.out.println(list);
            }

    }
}

