package ImplementService;

import java.util.ArrayList;

import javax.inject.Inject;

import DAO.InterfaceCategoryDAO;
import Service.InterfaceCategoryService;
import model.CategoryModel;

public class ImplementCategoryService implements InterfaceCategoryService {
   @Inject
   private InterfaceCategoryDAO categoryImplement ; 
   public ArrayList<CategoryModel>sellectAll(){
	   return categoryImplement.sellectAll() ; 
   }
}
 