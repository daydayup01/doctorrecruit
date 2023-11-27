package demo.doctorrecruit.daoImpl;

import java.sql.*;

public class FactoryDB {
    private static final String URL="localhost:3306/doctorrecruit?autoReconnect=true&useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8";
    private static final String USE = "root";
    private static final String PASSWORD = "123456";


    public static Connection GetConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USE, PASSWORD);
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭数据
     * @param conn
     * @param pre
     * @param res
     */
    public static void Close(Connection conn, PreparedStatement pre, ResultSet res) {
        try {
            if (conn != null) {
                conn.close();
            }
            if(pre!=null){
                pre.close();
            }
            if(res!=null){
                res.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
