package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Pingtaifuwuyuding;

public interface PingtaifuwuyudingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pingtaifuwuyuding record);

    int insertSelective(Pingtaifuwuyuding record);

    Pingtaifuwuyuding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pingtaifuwuyuding record);
	
    int updateByPrimaryKey(Pingtaifuwuyuding record);
	public Pingtaifuwuyuding quchongPingtaifuwuyuding(Map<String, Object> yonghuming);
	public List<Pingtaifuwuyuding> getAll(Map<String, Object> map);
	public List<Pingtaifuwuyuding> getsypingtaifuwuyuding1(Map<String, Object> map);
	public List<Pingtaifuwuyuding> getsypingtaifuwuyuding3(Map<String, Object> map);
	public List<Pingtaifuwuyuding> getsypingtaifuwuyuding2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Pingtaifuwuyuding> getByPage(Map<String, Object> map);
	public List<Pingtaifuwuyuding> select(Map<String, Object> map);
//	所有List
}

