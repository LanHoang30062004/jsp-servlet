package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel> {

	@Override
	public CategoryModel mapRow(ResultSet rs) {
		try {
			long id = rs.getLong("id") ; 
			String name = rs.getString("name") ;
			String code = rs.getString("code") ; 
			CategoryModel ct = new CategoryModel(id,name, code) ; 
			return ct ; 
			
		} catch (SQLException e) {
			return null;
		}
	}

}
