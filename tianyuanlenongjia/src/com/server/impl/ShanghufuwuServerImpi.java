package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ShanghufuwuMapper;
import com.entity.Shanghufuwu;
import com.server.ShanghufuwuServer;
@Service
public class ShanghufuwuServerImpi implements ShanghufuwuServer {
   @Resource
   private ShanghufuwuMapper gdao;
	@Override
	public int add(Shanghufuwu po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Shanghufuwu po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Shanghufuwu> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Shanghufuwu> getsyshanghufuwu1(Map<String, Object> map) {
		return gdao.getsyshanghufuwu1(map);
	}
	public List<Shanghufuwu> getsyshanghufuwu2(Map<String, Object> map) {
		return gdao.getsyshanghufuwu2(map);
	}
	public List<Shanghufuwu> getsyshanghufuwu3(Map<String, Object> map) {
		return gdao.getsyshanghufuwu3(map);
	}
	
	@Override
	public Shanghufuwu quchongShanghufuwu(Map<String, Object> account) {
		return gdao.quchongShanghufuwu(account);
	}

	@Override
	public List<Shanghufuwu> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Shanghufuwu> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Shanghufuwu getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

