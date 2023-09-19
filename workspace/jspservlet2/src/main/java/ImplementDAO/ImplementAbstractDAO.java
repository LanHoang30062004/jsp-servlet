package ImplementDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.JDBCUtil;
import DAO.InterfaceGenericDAO;
import Mapper.RowMapper;

public class ImplementAbstractDAO<T> implements InterfaceGenericDAO<T> {

	@Override
	public ArrayList<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
		Connection c = JDBCUtil.getConnection();
		ArrayList<T> list = new ArrayList<>();
		try {
			PreparedStatement ps = c.prepareStatement(sql);
			setParameters(ps, parameters);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(rowMapper.mapRow(rs));
			}
			JDBCUtil.disConnection(c);
			return list;
		} catch (SQLException e) {
			return null;
		}

	}

	private void setParameters(PreparedStatement ps, Object[] parameters) {
		try {
			for (int i = 0; i < parameters.length; i++) {
				Object parameter = parameters[i];
				int index = i + 1;
				if (parameter instanceof Long) {
					ps.setLong(index, (Long) parameter);
				}
				else if (parameter instanceof String) {
					ps.setString(index,(String)parameter);
				}
				else if (parameter instanceof Long) {
					ps.setLong(index, (Long)parameter); 
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void update(String sql, Object... parameters) {
		Connection c = JDBCUtil.getConnection();
		try {
			c.setAutoCommit(false);
			PreparedStatement ps = c.prepareStatement(sql);
			setParameters(ps, parameters);
			int check  = ps.executeUpdate();
			System.out.println(check +" row da thay doi ");
			c.commit();
			JDBCUtil.disConnection(c);

		} catch (Exception e) {
			try {
				c.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	@Override
	public int save (String sql, Object... parameters) {
		Connection c = JDBCUtil.getConnection();
		int result = 0 ; 
		try {
			c.setAutoCommit(false);
			PreparedStatement ps = c.prepareStatement(sql);
			setParameters(ps, parameters);
			result = ps.executeUpdate();
			c.commit();
			JDBCUtil.disConnection(c);

		} catch (Exception e) {
			try {
				c.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return result ; 
	}

}
