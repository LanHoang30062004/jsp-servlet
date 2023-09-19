package ImplementDAO;

import java.util.ArrayList;

import DAO.InterfaceCategoryDAO;
import Mapper.CategoryMapper;
import model.CategoryModel;

public class ImplementCategoryDAO extends ImplementAbstractDAO<CategoryModel> implements InterfaceCategoryDAO {
	@Override
	public ArrayList<CategoryModel> sellectAll() {
		String sql = "SELECT * from category " ; 
        return query(sql, new CategoryMapper()) ; 
	}
}
