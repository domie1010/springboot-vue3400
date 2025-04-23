package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Shanghufuwuyuding;

public interface ShanghufuwuyudingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shanghufuwuyuding record);

    int insertSelective(Shanghufuwuyuding record);

    Shanghufuwuyuding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shanghufuwuyuding record);
	
    int updateByPrimaryKey(Shanghufuwuyuding record);
	public Shanghufuwuyuding quchongShanghufuwuyuding(Map<String, Object> yonghuming);
	public List<Shanghufuwuyuding> getAll(Map<String, Object> map);
	public List<Shanghufuwuyuding> getsyshanghufuwuyuding1(Map<String, Object> map);
	public List<Shanghufuwuyuding> getsyshanghufuwuyuding3(Map<String, Object> map);
	public List<Shanghufuwuyuding> getsyshanghufuwuyuding2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Shanghufuwuyuding> getByPage(Map<String, Object> map);
	public List<Shanghufuwuyuding> select(Map<String, Object> map);
//	所有List
}

