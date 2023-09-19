package DAO;

import java.util.ArrayList;

import model.NewsModel;

public interface InterfaceNewDAO {
   public ArrayList<NewsModel> sellectByCategoryID(long categoryId) ; 
   public int save (NewsModel nm) ; 
   public void update(Long categoryid,String content , Long condition) ; 
}
