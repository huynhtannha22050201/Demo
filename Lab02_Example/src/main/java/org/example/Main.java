package  org.example;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/example";
        String username = "root";
        String password = "Huynhtannha96@gmail.com";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công");
            conn.close();
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Lỗi kết nối: " + e.getMessage(), e);
        }

        try {
            Connection conn = (Connection) DriverManager.getConnection(url, username, password);

            String sql = "Create table student(name nvarchar(30) primary key, age int)";
            Statement stm = (Statement) conn.createStatement();
            stm.executeUpdate(sql);

            stm.close();
            conn.close();

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Lỗi kết nối: " + e.getMessage(), e);
        }


        try {
            Connection conn = (Connection) DriverManager.getConnection(url, username, password);
            String sql = "insert into student values (?, ?)";
            PreparedStatement ptm = (PreparedStatement) conn.prepareStatement(sql);
            ptm.setString(1, "Le Minh");
            ptm.setInt(2, 23);
            int rows = ptm.executeUpdate();
            ptm.setString(1, "Nguyen Minh");
            ptm.setInt(2, 20);
            ptm.executeUpdate();
            rows++;
            ptm.setString(1, "Huynh Tan");
            ptm.setInt(2, 19);
            ptm.executeUpdate();
            rows++;

            if(rows == 3) {
                System.out.println("Them thanh cong");
            }
        } catch(SQLException e) {
            logger.log(Level.SEVERE, "Lỗi kết nối: " + e.getMessage(), e);
        }
    }
}
