// Автор: Angelina Smyk, группа ІО-з31
// Главное приложение

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainAngelinaSmyk {
    public static void main(String[] args) {
        AngelinaSmykDbConnection db = new AngelinaSmykDbConnection();
        try (Connection conn = db.openConnection()) {
            if (conn == null) {
                System.out.println("Не вдалося підключитися до бази даних.");
                return;
            }
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, group_name TEXT);");
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            while (running) {
                System.out.println("Меню:");
                System.out.println("1. Додати студента");
                System.out.println("2. Показати всіх студентів");
                System.out.println("3. Видалити студента по ID");
                System.out.println("4. Вихід");
                System.out.print("Обрати дію: ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.print("Введіть ім'я студента: ");
                        String name = scanner.nextLine();
                        System.out.print("Введіть группу студента: ");
                        String group = scanner.nextLine();
                        stmt.executeUpdate("INSERT INTO students (name, group_name) VALUES ('" + name + "', '" + group + "');");
                        System.out.println("Студент додан.");
                        break;
                    case "2":
                        ResultSet rs = stmt.executeQuery("SELECT * FROM students;");
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id") + ", Ім'я: " + rs.getString("name") + ", Группа: " + rs.getString("group_name"));
                        }
                        rs.close();
                        break;
                    case "3":
                        System.out.print("Введіть ID студента для видалення: ");
                        String idStr = scanner.nextLine();
                        int id = Integer.parseInt(idStr);
                        stmt.executeUpdate("DELETE FROM students WHERE id = " + id + ";");
                        System.out.println("Студент видален.");
                        break;
                    case "4":
                        running = false;
                        break;
                    default:
                        System.out.println("Невірний вибір, спробуйте ще раз.");
                }
            }
            scanner.close();
            stmt.close();
            System.out.println("Додаток завершенно.");
        } catch (SQLException e) {
            System.err.println("Помилка бази данних: " + e.getMessage());
        }
    }
}
