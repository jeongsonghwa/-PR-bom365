package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.common.JDBCUtil;

public class SupportREMRequestDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String sql_insert = "insert into support_regular values ((select nvl(max(regular_number),0)+1 from support_regular),?,to_char(sysdate, 'yyyy.mm.dd hh24:mi'),?,?,?)";
	String sql_selectAll = "select * from support_regular order by regular_number desc";
	
	//�����Ŀ��ϱ�
	public boolean insert(SupportREMRequestVO vo) {
		conn = JDBCUtil.connect();
		boolean isAdmin = false;
		if(vo.getSupporter_id().equals("admin")) {
			isAdmin = true;
		}
		try {
			pstmt = conn.prepareStatement(sql_insert);
			pstmt.setInt(1, vo.getRegular_number());
			pstmt.setString(2, vo.getSupporter_id());
			pstmt.setInt(3, vo.getRegular_amount());
			pstmt.setString(4, vo.getRegular_bank());
			pstmt.setString(5, vo.getRegular_account());
			pstmt.setInt(6, vo.getRegular_date());
			
			if(isAdmin) {
				pstmt.setString(4, "����"); //??????????????????????????
			}else {
				pstmt.setString(4, "�Ϲ�");
			}
			pstmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("supportREMRequest�� insert()���� �����߻�");
			e.printStackTrace();
			return false;
		}finally {
			JDBCUtil.disconnect(pstmt, conn);
		}
	
		return true;
	}
	
	//��ü �����Ŀ� ��ȸ
	public ArrayList<SupportREMRequestVO> selectAll(){
		conn=JDBCUtil.connect();
		ArrayList<SupportREMRequestVO> datas = new ArrayList<SupportREMRequestVO>();
		
		try {
			pstmt = conn.preparedStatement(sql_selectAll);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				SupportREMRequestVO vo = new SupportREMRequestVO();
				vo.setRegular_number(rs.getInt("regular_number"));
				vo.setSupporter_id(rs.getString("supporter_id"));
				vo.setRegular_amount(rs.getInt("regular_amount"));
				vo.setRegular_bank(rs.getString("regular_bank"));
				vo.setRegular_account(rs.getString("regular_account"));
				vo.setRegular_date(rs.getInt("regular_date"));
			}
		}catch(SQLException e) {
			System.out.println("SupportREMRequestDAO�� selectAll()���� �����߻�");
			e.printStackTrace();
		}finally {
			JDBCUtil.disconnect(pstmt, conn);
		}
		return datas;
	}
	
}
