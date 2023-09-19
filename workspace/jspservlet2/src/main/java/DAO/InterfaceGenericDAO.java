package DAO;

import java.util.ArrayList;

import Mapper.RowMapper;

public interface InterfaceGenericDAO<T> {
     public ArrayList<T> query(String sql , RowMapper<T>rowMapper , Object...parameters) ; 
     public void update(String sql ,Object...parameters ) ; 
     public int save(String sql , Object...parameters) ; 
}
