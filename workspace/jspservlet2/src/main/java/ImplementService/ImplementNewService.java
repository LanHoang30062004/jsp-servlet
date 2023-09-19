package ImplementService;

import java.util.ArrayList;

import javax.inject.Inject;

import DAO.InterfaceNewDAO;
import Service.InterfaceNewService;
import model.NewsModel;

public class ImplementNewService implements InterfaceNewService {
    @Inject
	private InterfaceNewDAO implementNewDao ; 
	@Override
	public ArrayList<NewsModel> sellectByCategoryID(long categoryId) {
		return implementNewDao.sellectByCategoryID(categoryId) ; 
	}
	@Override
	public NewsModel save(NewsModel nm) {
		implementNewDao.save(nm) ; 
		return null ; 
	}
	@Override
	public void update(Long categoryid , String content , Long condition) {
		implementNewDao.update(categoryid,content,condition);
	}


}
