package demoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DVDrentalAccess {

	public static void main(String[] args)
	{

		try 
		{
			String jdbcUrl = "jdbc:postgresql://localhost:5432/dvdrental";
	        String username = "postgres";
	        String password = "123456";
	        
	        // Register the PostgreSQL driver

            Class.forName("org.postgresql.Driver");

            // Connect to the database

            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Perform desired database operations
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM actor");

            while (resultSet.next())
            {
                String columnValue = resultSet.getString("first_name")+","+resultSet.getString("last_name");
                System.out.println("Actor: " + columnValue);//MUESTRA ACTORES POR NOMBRE Y APELLIDO
            }

            // Close the connection
            connection.close();
            System.out.println("Conexion exitosa!!");
	        
		} catch (Exception e) {
		    System.out.println("Conexion FALLIDA");
		    e.printStackTrace();
		}
		
		
	}

}
