package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Nongjiayuan;

public interface NongjiayuanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nongjiayuan record);

    int insertSelective(Nongjiayuan record);

    Nongjiayuan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nongjiayuan record);
	
    int updateByPrimaryKey(Nongjiayuan record);
	public Nongjiayuan quchongNongjiayuan(Map<String, Object> shangjiabianhao);
	public List<Nongjiayuan> getAll(Map<String, Object> map);
	public List<Nongjiayuan> getsynongjiayuan1(Map<String, Object> map);
	public List<Nongjiayuan> getsynongjiayuan3(Map<String, Object> map);
	public List<Nongjiayuan> getsynongjiayuan2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Nongjiayuan> getByPage(Map<String, Object> map);
	public List<Nongjiayuan> select(Map<String, Object> map);
//	所有List
}

