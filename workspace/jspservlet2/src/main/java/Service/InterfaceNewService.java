package Service;

import java.util.ArrayList;

import model.NewsModel;

public interface InterfaceNewService {
	   public ArrayList<NewsModel> sellectByCategoryID(long categoryId) ; 
       public NewsModel save(NewsModel nm) ; 
       public void update(Long categoryid , String content , Long condition) ; 
}
