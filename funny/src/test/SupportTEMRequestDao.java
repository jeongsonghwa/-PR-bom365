package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.common.JDBCUtil;

public class SupportTEMRequestDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String sql_insert = "insert into support_temporary values ((select nvl(max(temporary_number),0)+1 from support_temporary),?,to_char(sysdate, 'yyyy.mm.dd hh24:mi'),?,?,?)";
	String sql_selectAll = "select * from support_temporary order by temporary_number desc";
	
	public boolean insert(supportTEMRequestVO vo) {
		conn = JDBCUtil.connect();
		boolean isAdmin = false;
		if(vo.getSupporter_id().equals("admin")) {
			isAdmin = true;
		}
		try {
			pstmt = conn.prepareStatement(sql_insert);
			pstmt.setInt(1, vo.getTemporary_number());
			pstmt.setString(2, vo.getSupporter_id());
			pstmt.setInt(3, vo.getTemporary_amount());
			pstmt.setInt(4, vo.getTemporary_date());
			
			if(isAdmin) {
				pstmt.setString(4, "����"); 
			}else {
				pstmt.setString(4, "�Ϲ�");
			}
			pstmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("supportTEMRequest�� insert()���� �����߻�");
			e.printStackTrace();
			return false;
		}finally {
			JDBCUtil.disconnect(pstmt, conn);
		}
	
		return true;
	}
	
	//��ü �����Ŀ� ��ȸ
	public ArrayList<SupportTEMRequestVO> selectAll(){
		conn=JDBCUtil.connect();
		ArrayList<supportTEMRequestVO> datas = new ArrayList<SupportTEMRequestVO>();
		
		try {
			pstmt = conn.preparedStatement(sql_selectAll);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				SupportTEMRequestVO vo = new SupportTEMRequestVO();
				vo.setTemporary_number(rs.getInt("Temporary_number"));
				vo.setSupporter_id(rs.getString("supporter_id"));
				vo.setTemporary_amount(rs.getInt("Temporary_amount"));
				vo.setTemporary_date(rs.getInt("Temporary_date"));
			}
		}catch(SQLException e) {
			System.out.println("SupportTEMRequestDAO�� selectAll()���� �����߻�");
			e.printStackTrace();
		}finally {
			JDBCUtil.disconnect(pstmt, conn);
		}
		return datas;
	}
	
}
