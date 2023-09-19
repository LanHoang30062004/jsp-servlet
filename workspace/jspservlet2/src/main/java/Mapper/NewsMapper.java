package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.NewsModel;

public class NewsMapper implements RowMapper<NewsModel> {

	@Override
	public NewsModel mapRow(ResultSet rs) {
		try {
			long id = rs.getLong("id") ; 
			  String title = rs.getString("title") ; 
			  long categoryid = rs.getLong("categoryid") ; 
			  String thumbnail = rs.getString("thumbnail") ; 
			  String sortdisciption = rs.getString("shortdescription") ; 
			  String content = rs.getString("content") ; 
			  NewsModel nm = new NewsModel(id, categoryid, title, thumbnail, sortdisciption,content); 
	          return nm ; 
		} catch (SQLException e) {
			return null ; 
		}
	}

}
