package in.ashokit.beans;

import org.springframework.stereotype.Repository;

@Repository("MySQLDao")
public class MySQLDBReportDao implements ReportDao {

	public void getData() {
		System.out.println("getting data from mysql DB...");

	}

}
