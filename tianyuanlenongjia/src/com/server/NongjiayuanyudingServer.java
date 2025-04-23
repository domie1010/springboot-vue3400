package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Nongjiayuanyuding;

public interface NongjiayuanyudingServer {

  public int add(Nongjiayuanyuding po);

  public int update(Nongjiayuanyuding po);
  
  public int updatelb(Nongjiayuanyuding po);
  
  public int delete(int id);

  public List<Nongjiayuanyuding> getAll(Map<String,Object> map);
  public List<Nongjiayuanyuding> getsynongjiayuanyuding1(Map<String,Object> map);
  public List<Nongjiayuanyuding> getsynongjiayuanyuding2(Map<String,Object> map);
  public List<Nongjiayuanyuding> getsynongjiayuanyuding3(Map<String,Object> map);
  public Nongjiayuanyuding quchongNongjiayuanyuding(Map<String, Object> acount);

  public Nongjiayuanyuding getById( int id);

  public List<Nongjiayuanyuding> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Nongjiayuanyuding> select(Map<String, Object> map);
}
//	所有List
