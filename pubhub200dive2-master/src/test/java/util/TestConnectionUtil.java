package util;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestConnectionUtil {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub

		System.out.println(ConnectionUtil.getJdbcTemplate());
	}

}
