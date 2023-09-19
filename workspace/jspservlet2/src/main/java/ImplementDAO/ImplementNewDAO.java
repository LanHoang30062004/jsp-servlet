package ImplementDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Connect.JDBCUtil;
import DAO.InterfaceNewDAO;
import Mapper.NewsMapper;
import model.NewsModel;

public class ImplementNewDAO extends ImplementAbstractDAO<NewsModel> implements InterfaceNewDAO {

	@Override
	public ArrayList<NewsModel> sellectByCategoryID(long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewsMapper(), categoryId);
	}

	@Override
	public int save(NewsModel nm) {
		String sql = "INSERT INTO NEWS (content , categoryid) VALUES (?,?)" ; 
		return save(sql,nm.getContent(),nm.getCategoryId()) ; 
}

	@Override
	public void update(Long categoryid , String content , Long condition) {
		String sql = "UPDATE news SET content = ? , categoryid = ? WHERE id = ?" ; 
		update(sql,categoryid,content , condition);
	}
		
	}
