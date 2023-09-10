package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class DataBase {

    private static Statement sqlStatment;
    private static final String dataBaseName = "db1";
    private static Connection connectionState;
    private static String urlDataBase;
    private static String usernameDataBaseAccount;
    private static String passwordDataBaseAccount;
    private static ResultSet ResultOfSqlQuerey;
    private static int counter = 0;

    private static void dataConnectionInfo() {
        urlDataBase = "jdbc:mysql://localhost:3306/"
                + dataBaseName + "?useUnicode=true&characterEncoding=UTF-8";
        usernameDataBaseAccount = "root";
        passwordDataBaseAccount = "";
    }

    public static void openConnection() {
        try {
            dataConnectionInfo();
            connectionState = DriverManager.getConnection(urlDataBase, usernameDataBaseAccount, passwordDataBaseAccount);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "خطأ في عمل اتصال مفتوح ");
        }
    }

    public static void closeConnection() {
        try {
            connectionState.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "خطأ في غلق الاتصال ");
        }
    }

    private static ResultSet executeSqlQuereyResulte(String sqlQuerey) {
        try {
            openConnection();
            sqlStatment = connectionState.createStatement();

            return ResultOfSqlQuerey = sqlStatment.executeQuery(sqlQuerey);

        } catch (SQLException sqlEx) {
            JOptionPane.showMessageDialog(new JFrame(), "خطأ في تنفيذ الاستعلام " + sqlEx);

            return ResultOfSqlQuerey;

        }

    }

    public static ResultSet getSqlResults(String sqlQuereyClients) {
        return executeSqlQuereyResulte(sqlQuereyClients);

    }

    private static int executeQuereyNoneResults(String sqlQuerey) {
        try {
            sqlStatment = connectionState.createStatement();
            counter = sqlStatment.executeUpdate(sqlQuerey);

            return counter;
        } catch (SQLException sqlEx) {
            
            JOptionPane.showMessageDialog(new JFrame(), "خطأ في تنفيذ الاستعلام "+ sqlEx);

            return counter;
        }
    }

    public static int getSqlRowConter(String sqlQuereyClients) {
        return executeQuereyNoneResults(sqlQuereyClients);

    }

    public static int executeSqlQuerey(String sqlQuereyClients) {
        DataBase.openConnection();
        int counter = DataBase.getSqlRowConter(sqlQuereyClients);
        DataBase.closeConnection();
        return counter;
    }

    public static boolean checkIsDataInserterd(int rowConuter) {
        if (rowConuter > 0) {
            return true;
        } else {
            return false;
        }
    }

}
