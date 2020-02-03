package native_jdbc_study;

import java.sql.Connection;
import java.sql.SQLException;

import native_jdbc_study.ds.Hikari_DataSource;

public class HikariCp_Main {

	public static void main(String[] args) {
		
		try (Connection con = Hikari_DataSource.getConnection();){
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		hikari01();
	}

	private static void hikari01() {
		try (Connection con = Hikari_DataSource.getConnection()){
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
