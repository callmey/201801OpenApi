package par;

import org.json.simple.parser.JSONParser;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.sql.*;

public class HelloApi {

	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost/world";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("데이터베이스 연결중...");
			con = DriverManager.getConnection(url, "root", "alstjs3795");
			System.out.println("데이터베이스 연결 성공");

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다.");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
		}
		return con;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Connection con = makeConnection();
			Statement stmt = con.createStatement();

			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader("C:\\re.json"));

			JSONObject jsonObject = (JSONObject) obj;
			JSONArray data = (JSONArray) jsonObject.get("data");

			System.out.println("\ndataList");

			/*for (int i = 0; i < data.size(); i++) {
				System.out.println("\ndata" + i);

				JSONObject data1 = (JSONObject) data.get(i);
				System.out.println(data1.get("RECIPE_ID").toString());
				System.out.println(data1.get("RECIPE_NM_KO").toString());
				System.out.println(data1.get("CALORIE").toString());
				
			}*/
			JSONObject data1 = (JSONObject) data.get(0);
			String snum=data1.get("RECIPE_ID").toString();
			int num = Integer.parseInt(snum);
			
			String nm= data1.get("RECIPE_NM_KO").toString();
			String cal = data1.get("CALORIE").toString();
			
			String sql ="INSERT INTO main3 values("+num+",'"+nm+"','"+cal+"')";
			
			if(stmt.executeUpdate(sql)==1)
				System.out.println("레코드 추가 성공");
			else
				System.out.println("레코드 추가 실패");
			
			con.close();
			stmt.close();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
