package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Pingtaifuwuyuding;

public interface PingtaifuwuyudingServer {

  public int add(Pingtaifuwuyuding po);

  public int update(Pingtaifuwuyuding po);
  
  
  
  public int delete(int id);

  public List<Pingtaifuwuyuding> getAll(Map<String,Object> map);
  public List<Pingtaifuwuyuding> getsypingtaifuwuyuding1(Map<String,Object> map);
  public List<Pingtaifuwuyuding> getsypingtaifuwuyuding2(Map<String,Object> map);
  public List<Pingtaifuwuyuding> getsypingtaifuwuyuding3(Map<String,Object> map);
  public Pingtaifuwuyuding quchongPingtaifuwuyuding(Map<String, Object> acount);

  public Pingtaifuwuyuding getById( int id);

  public List<Pingtaifuwuyuding> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Pingtaifuwuyuding> select(Map<String, Object> map);
}
//	所有List
