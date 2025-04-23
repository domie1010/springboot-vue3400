package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Shanghufuwuyuding;

public interface ShanghufuwuyudingServer {

  public int add(Shanghufuwuyuding po);

  public int update(Shanghufuwuyuding po);
  
  
  
  public int delete(int id);

  public List<Shanghufuwuyuding> getAll(Map<String,Object> map);
  public List<Shanghufuwuyuding> getsyshanghufuwuyuding1(Map<String,Object> map);
  public List<Shanghufuwuyuding> getsyshanghufuwuyuding2(Map<String,Object> map);
  public List<Shanghufuwuyuding> getsyshanghufuwuyuding3(Map<String,Object> map);
  public Shanghufuwuyuding quchongShanghufuwuyuding(Map<String, Object> acount);

  public Shanghufuwuyuding getById( int id);

  public List<Shanghufuwuyuding> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Shanghufuwuyuding> select(Map<String, Object> map);
}
//	所有List
