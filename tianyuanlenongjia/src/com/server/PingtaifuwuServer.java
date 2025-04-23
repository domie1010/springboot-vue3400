package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Pingtaifuwu;

public interface PingtaifuwuServer {

  public int add(Pingtaifuwu po);

  public int update(Pingtaifuwu po);
  
  
  
  public int delete(int id);

  public List<Pingtaifuwu> getAll(Map<String,Object> map);
  public List<Pingtaifuwu> getsypingtaifuwu1(Map<String,Object> map);
  public List<Pingtaifuwu> getsypingtaifuwu2(Map<String,Object> map);
  public List<Pingtaifuwu> getsypingtaifuwu3(Map<String,Object> map);
  public Pingtaifuwu quchongPingtaifuwu(Map<String, Object> acount);

  public Pingtaifuwu getById( int id);

  public List<Pingtaifuwu> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Pingtaifuwu> select(Map<String, Object> map);
}
//	所有List
