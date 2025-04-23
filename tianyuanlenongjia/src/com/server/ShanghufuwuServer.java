package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Shanghufuwu;

public interface ShanghufuwuServer {

  public int add(Shanghufuwu po);

  public int update(Shanghufuwu po);
  
  
  
  public int delete(int id);

  public List<Shanghufuwu> getAll(Map<String,Object> map);
  public List<Shanghufuwu> getsyshanghufuwu1(Map<String,Object> map);
  public List<Shanghufuwu> getsyshanghufuwu2(Map<String,Object> map);
  public List<Shanghufuwu> getsyshanghufuwu3(Map<String,Object> map);
  public Shanghufuwu quchongShanghufuwu(Map<String, Object> acount);

  public Shanghufuwu getById( int id);

  public List<Shanghufuwu> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Shanghufuwu> select(Map<String, Object> map);
}
//	所有List
