package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Pingtaifuwu;

public interface PingtaifuwuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pingtaifuwu record);

    int insertSelective(Pingtaifuwu record);

    Pingtaifuwu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pingtaifuwu record);
	
    int updateByPrimaryKey(Pingtaifuwu record);
	public Pingtaifuwu quchongPingtaifuwu(Map<String, Object> faburen);
	public List<Pingtaifuwu> getAll(Map<String, Object> map);
	public List<Pingtaifuwu> getsypingtaifuwu1(Map<String, Object> map);
	public List<Pingtaifuwu> getsypingtaifuwu3(Map<String, Object> map);
	public List<Pingtaifuwu> getsypingtaifuwu2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Pingtaifuwu> getByPage(Map<String, Object> map);
	public List<Pingtaifuwu> select(Map<String, Object> map);
//	所有List
}

