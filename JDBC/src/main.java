import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cx = DriverManager.getConnection("jdbc:mysql", "Pays", "DuMonde");
            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery("Select * FROM code");

            while (rs.next()) {
                System.out.println("--------");
                String num = rs.getString("code");
                System.out.println(num);
            }

        } catch (Exception ex) {
            Logger.getLogger(main.class.getName()).log(Level.SERVER, null, ex);
            System.out.println("ex" + ex);
        }
    }
}
