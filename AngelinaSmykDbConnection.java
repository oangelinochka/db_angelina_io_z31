import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AngelinaSmykDbConnection {

    private static final String DB_URL = "jdbc:sqlite:students.db";

    public Connection openConnection() {
        try {
            return DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            System.err.println("Ошибка при подключении к базе данных: " + e.getMessage());
            return null;
        }
    }
}
