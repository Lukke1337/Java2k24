package jdbcdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbcdemo.domain.Car;
import jdbcdemo.domain.Person;

public class CarRepository {
	Connection connection;

    private String createTableSql = "CREATE TABLE car("
            + "id INT GENERATED BY DEFAULT AS IDENTITY,"
            + "brand VARCHAR(20),"
//            + "model VARCHAR(50),"
            + "registration VARCHAR(10),"
//            + "year INT,"
//            + "engine VARCHAR(20),"
//            + "color VARCHAR(15),"
//            + "noOfDoors INT"
            + ")";

    private Statement createTable;

    public void createTable() {
        try {
//
            ResultSet rs = connection
                    .getMetaData()
                    .getTables(null, null, null, null);
            boolean tableExists = false;
            while(rs.next()){
                if(rs.getString("TABLE_NAME").equalsIgnoreCase("car")){
                    tableExists=true;
                    break;
                }
            }
            if(!tableExists)
                createTable.executeUpdate(createTableSql); //
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}