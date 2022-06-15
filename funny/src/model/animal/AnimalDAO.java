package model.animal;

import model.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.sql.SQLException;
 
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
 
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
 
import model.animal.AnimalVO;
import model.mybatis.SqlMapConfig;
 
public class AnimalDAO {
    
    Context context;
    DataSource dataSource;
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    SqlSessionFactory factory = SqlMapConfig.getFactory();
    SqlSession sqlsession;
    
    public AnimalDAO(){
      
        sqlsession = factory.openSession(true);
    }

	public void insertAll(List<AnimalVO> datas) {
		
		    HashMap<String, String> datas = new HashMap<>();
			datas.put("animal_name", animal_name);
			datas.put("animal_species",animal_species);
			datas.put("animal_type", animal_type);
			datas.put("animal_gender", animal_gender);
			datas.put("animal_age", animal_age);
			datas.put("animal_weight",animal_weight);
			datas.put("animal_image",animal_image);
			
			AnimalVO animals = sqlsession.selectOne("animal.select", datas);
			return animals;
		}
	

}
	
		/*conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(sql_insertAll);
			for (AnimalVO data : datas) {

				pstmt.setString(1, data.getAnimal_name());
				pstmt.setString(2, data.getAnimal_species());
				pstmt.setString(3, data.getAnimal_type());
				pstmt.setString(4, data.getAnimal_gender());
				pstmt.setString(5, data.getAnimal_age());
				pstmt.setDouble(6, data.getAnimal_weight());
				pstmt.setString(7, data.getAnimal_image());

				pstmt.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("init 데이터 insert 중 문제발생");
		} finally {
			JDBCUtil.disconnect(pstmt, conn);
		}
	}*/

