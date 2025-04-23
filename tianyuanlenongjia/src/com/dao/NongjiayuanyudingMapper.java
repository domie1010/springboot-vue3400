package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Nongjiayuanyuding;

public interface NongjiayuanyudingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nongjiayuanyuding record);

    int insertSelective(Nongjiayuanyuding record);

    Nongjiayuanyuding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nongjiayuanyuding record);
	int updateByPrimaryKeySelectivelb(Nongjiayuanyuding record);
    int updateByPrimaryKey(Nongjiayuanyuding record);
	public Nongjiayuanyuding quchongNongjiayuanyuding(Map<String, Object> yudingren);
	public List<Nongjiayuanyuding> getAll(Map<String, Object> map);
	public List<Nongjiayuanyuding> getsynongjiayuanyuding1(Map<String, Object> map);
	public List<Nongjiayuanyuding> getsynongjiayuanyuding3(Map<String, Object> map);
	public List<Nongjiayuanyuding> getsynongjiayuanyuding2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Nongjiayuanyuding> getByPage(Map<String, Object> map);
	public List<Nongjiayuanyuding> select(Map<String, Object> map);
//	所有List
}

