package JavaJdbc;

import java.sql.*;

//JDBC POSTGRESQL
//CURD - CREATE UPDATE RETRIEVE DELETE
//GET PUT POST DELETE



public class postgresQLConn {
    public static void main(String[] args) {
        Connection connection = CreateConnection();

        if (connection != null){
            getMethod(connection);
          //  insertData(connection);
          //  deleteData(connection);
           // updateData(connection);
            closeConnection(connection);
        }
    }
    
    public static Connection CreateConnection(){
       Connection connection = null;

        String URL = "jdbc:postgresql://localhost:5432/postgres";
        String username ="postgres";
        String password = "1290"; // write your password here

        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(URL,username,password);
            System.out.println("Connected to database Successful");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Failed to connect to database");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return connection;
    }
    public static void getMethod(Connection connection){
        try{
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM classInfo";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int id = resultSet.getInt("ID");
                String fName = resultSet.getString("Name");
                String Email = resultSet.getString("Email");
                String Phone = resultSet.getString("Phone");
                String Type = resultSet.getString("Type");

                System.out.println(id + " " + fName + " " + Email + " " + Phone + " " + Type);
            }
            resultSet.close();
            statement.close();
        }catch (SQLException e){
            System.out.println("Failed to execute Query");
            e.printStackTrace();
        }
    }

    public static void insertData(Connection connection){
        try{
            String query = "INSERT INTO classInfo (id,Name,Email,Phone,Type) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1,10);
            preparedStatement.setString(2,"Harsh");
            preparedStatement.setString(3,"harsh@collaboraitinc.com");
            preparedStatement.setString(4,"571-460-0670");
            preparedStatement.setString(5,"Developer");

            preparedStatement.executeUpdate();
            preparedStatement.close();

            System.out.println("Data insert success");

        }catch (SQLException e){
            System.out.println("Failed to insert Data");
            e.printStackTrace();
        }
    }

    public static void deleteData(Connection connection){

        try {
            String query = "DELETE FROM classInfo WHERE id BETWEEN ? AND ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1,6);
            preparedStatement.setInt(2,8);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Data delete complete");
        }catch (SQLException e){
            System.out.println("Problem Deleting Data");
            e.printStackTrace();
        }

    }

    public static void updateData(Connection connection){

        try {
            String query = "UPDATE classInfo SET Name = ?, Email = ? Where id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1,"John Doe");
            preparedStatement.setString(2,"JOHN.DOE@gmail.com");
            preparedStatement.setInt(3,1);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Data Updated Success");
        }catch (SQLException e){
            System.out.println("Failed to Update DATA");
            e.printStackTrace();
        }
    }
    public static void closeConnection(Connection connection){
        try{
            if (connection != null){
                connection.close();
                System.out.println("connection closed success");
            }
        }catch (SQLException e){
            System.out.println("Error in closing the connection");
            e.printStackTrace();
        }
    }
}
