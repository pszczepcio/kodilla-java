//package com.kodilla.jdbc;
//
//import org.junit.Test;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import static org.junit.Assert.assertEquals;
//
//public class StoredProcTestSuite {
//    @Test
//    public  void testUpdateVipLevels() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
//        Statement statement = dbManager.getConnection().createStatement();
//        statement.executeUpdate(sqlUpdate);
//
//        //When
//        String sqlProcedureCall = "CALL UpdateVipLevels()";
//        statement.execute(sqlProcedureCall);
//
//        //Then
//        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
//        ResultSet rs = statement.executeQuery(sqlCheckTable);
//        int howMany = -1;
//        if(rs.next()) {
//            howMany = rs.getInt("HOW_MANY");
//        }
//        assertEquals(0, howMany);
//    }
//
//    @Test
//    public void testUpdateBestsellers() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//        String sqlUpdateBestseller = "UPDATE BOOKS SET BESTSELLER=false";
//        Statement statement = dbManager.getConnection().createStatement();
//        statement.executeUpdate(sqlUpdateBestseller);
//
//        //When
//        String sqlProcedureCall = "CALL UpdateBestsellers()";
//        statement.execute(sqlProcedureCall);
//
//        //Then
//        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=TRUE";
//        ResultSet rs = statement.executeQuery(sqlCheckTable);
//        int howMAny = -1;
//        if (rs.next()) {
//            howMAny = rs.getInt("HOW_MANY");
//        }
//        assertEquals(1,howMAny);
//    }
//}
