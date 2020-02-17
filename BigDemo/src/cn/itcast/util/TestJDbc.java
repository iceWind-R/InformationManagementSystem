package cn.itcast.util;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Dongao
 * @create 2020-02-16 19:26
 */
public class TestJDbc {
    @Test
    public void Text(){
        try {
            Connection conn = JDBCUtils.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
