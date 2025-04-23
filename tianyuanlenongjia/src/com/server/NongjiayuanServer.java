package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Nongjiayuan;

public interface NongjiayuanServer {

  public int add(Nongjiayuan po);

  public int update(Nongjiayuan po);
  
  
  
  public int delete(int id);

  public List<Nongjiayuan> getAll(Map<String,Object> map);
  public List<Nongjiayuan> getsynongjiayuan1(Map<String,Object> map);
  public List<Nongjiayuan> getsynongjiayuan2(Map<String,Object> map);
  public List<Nongjiayuan> getsynongjiayuan3(Map<String,Object> map);
  public Nongjiayuan quchongNongjiayuan(Map<String, Object> acount);

  public Nongjiayuan getById( int id);

  public List<Nongjiayuan> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Nongjiayuan> select(Map<String, Object> map);
}
//	所有List
