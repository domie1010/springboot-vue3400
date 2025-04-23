package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Shanghufuwu;

public interface ShanghufuwuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shanghufuwu record);

    int insertSelective(Shanghufuwu record);

    Shanghufuwu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shanghufuwu record);
	
    int updateByPrimaryKey(Shanghufuwu record);
	public Shanghufuwu quchongShanghufuwu(Map<String, Object> shanghubianhao);
	public List<Shanghufuwu> getAll(Map<String, Object> map);
	public List<Shanghufuwu> getsyshanghufuwu1(Map<String, Object> map);
	public List<Shanghufuwu> getsyshanghufuwu3(Map<String, Object> map);
	public List<Shanghufuwu> getsyshanghufuwu2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Shanghufuwu> getByPage(Map<String, Object> map);
	public List<Shanghufuwu> select(Map<String, Object> map);
//	所有List
}

