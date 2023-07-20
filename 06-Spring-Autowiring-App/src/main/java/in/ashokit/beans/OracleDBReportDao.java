package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("OracleDao")
@Primary
public class OracleDBReportDao implements ReportDao {

	public void getData() {
		System.out.println("getting data from oracle db...");

	}

}
