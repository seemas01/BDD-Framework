package Endpoints;

import StepDefinitions.World;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

public class Endpoint {

//private World world;

/* public void compareAUHResults(World world, ResponseEntity response)
{
   JSONObject responseJson = (this
            .convertoJSONObject(response.toString().substring(response.toString().indexOf('{'))));
    System.out.println("ResponseJSON::"+ responseJson);
    int count= (int) responseJson.get("auhCount");
    JSONArray res = (JSONArray) responseJson.get("auhList");
    System.out.println(res.length());

    System.out.println(count);

    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String dbURL = "jdbc:jtds:sqlserver://SQL-iFM301.ad.moodys.net:1433/fin_etcind;domain=ad.moodys.net;useNTLMv2=true;user=your user;password=password";
    Connection conn = DriverManager.getConnection(dbURL);
    Statement stmt = conn.createStatement();
    String orgDetails ="";
    String query = "select org_id from fin_etcind.dbo.aop_aw_info where  ana_mdy_emp_id = '29003272';";
    ResultSet rs = stmt.executeQuery(query);
    while(rs.next()){
        System.out.println(rs.getInt(1));
        orgDetails = orgDetails+rs.getInt(1)+",";
    }
    orgDetails=orgDetails.substring(0, orgDetails.length()-1);

    Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.registerDriver(new OracleDriver());
			DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
			Date dateobj = new Date();
			String Cur_date = df.format(dateobj);
			System.out.println(df.format(dateobj));
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@ftc-lboraedw501.ad.moodys.net:1521:edwin01",
					"ORA_DV_MDCOR01", "Pa$$word1");
			 Statement stmt1 = con.createStatement();
			 if(con!=null){
				 System.out.println("connection set");
			 }
			query = "select organization_id as ID from EDW.ORGANIZATION where End_DTM  between CURRENT_DATE AND '31-DEC-9999'  and (organization_id) in ("
					+ orgDetails + ")";
			System.out.println(query);
			orgDetails = "";
			rs = stmt1.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				orgDetails = orgDetails + rs.getInt(1) + ",";
			}
			orgDetails = orgDetails.substring(0, orgDetails.length() - 1);

    int Dbcount=0;
    query =" select count(*) from fin_etcind.dbo.aop_aw_info where org_id in(SELECT DISTINCT au.au_org_id FROM fin_etcind.dbo.issr_analytical_unit au WHERE ((au.exception_flag_cd ='X'AND au.system_flag_cd='Y')or(au.exception_flag_cd   !='X'AND au.exception_flag_cd='Y')))  and org_id in("+orgDetails+")";
    rs = stmt.executeQuery(query);
    while(rs.next()){
        System.out.println(rs.getInt(1));
        Dbcount = rs.getInt(1);
    }
    if (count == Dbcount)
    {
        System.out.println("Pass");
    }
    else
        System.out.println("Fail");

}*/

public void getResponse(World world, String uri)
{
    world.response =  world.restTemplate.exchange(uri, HttpMethod.GET, new HttpEntity<String>(world.header1), String.class);
    System.out.println(world.response.getBody());
}

    public void verifyResponse(World world, String status) {
        System.out.println(world.response.getStatusCode().toString());
        assertEquals(world.response.getStatusCode().toString(), status);
    }
}
