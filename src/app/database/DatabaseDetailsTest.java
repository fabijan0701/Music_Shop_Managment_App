package app.database;

import org.junit.jupiter.api.Test;
import java.sql.*;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseDetailsTest {

    @Test
    public void getConnection_test() throws SQLException, ClassNotFoundException {
        assertNotNull(DatabaseDetails.getConnection());
    }

    @Test
    public void getConnection_statementTest() throws SQLException, ClassNotFoundException {
        Connection con = DatabaseDetails.getConnection();
        Statement stm = con.createStatement();
        ResultSet resultSet = stm.executeQuery( "select count(id) from category");
        assertNotNull(resultSet);
    }

    @Test
    public void getConnection_dataTest() throws SQLException, ClassNotFoundException {

        //Expected
        int expectedCategoryCount = 5;

        //Actual
        Connection conn = DatabaseDetails.getConnection();
        Statement stm = conn.createStatement();
        ResultSet resultSet = stm.executeQuery("select count(id) from category");

        resultSet.next();
        int actualCategoryCount = resultSet.getInt(1);

        //Test execution
        assertEquals(expectedCategoryCount, actualCategoryCount);
    }
}