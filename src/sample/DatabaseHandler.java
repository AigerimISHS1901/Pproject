package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DatabaseHandler extends Configs{
    Connection dbConnection;
    public Connection getDbConnection() throws ClassNotFoundException, SQLException{
        String connectionString="jdbc:mysql://localhost:3306/Library?useUnicode=true&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection=DriverManager.getConnection(connectionString,dbUser,dbPass);
        return dbConnection;

    }
    public void signUpUser(User user ){
        String insert="INSERT INTO "+ Const.USERS_TABLE+"("
                +Const.USERS_FIRSTNAME+","+Const.USERS_SURNAME+","
                +Const.USERS_LOGIN+","+Const.USERS_PASSWORD+","+Const.USERS_EMAIL+")"
                +"VALUES(?,?,?,?,?)";

        try {
            PreparedStatement prSt= getDbConnection().prepareStatement(insert);
            prSt.setString(1, user.getFirstname());
            prSt.setString(2, user.getSurname());
            prSt.setString(3, user.getLoginname());
            prSt.setString(4, user.getPassword());
            prSt.setString(5, user.getEmail());
            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public ResultSet getUser(User user){
        ResultSet resSet=null;

        String select="SELECT * FROM "+Const.USERS_TABLE+" WHERE "+
                Const.USERS_LOGIN+"=? AND "+Const.USERS_PASSWORD+"=?";

        try {
            PreparedStatement prSt= getDbConnection().prepareStatement(select);
            prSt.setString(1, user.getLoginname());
            prSt.setString(2, user.getPassword());

            resSet=prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }


}
