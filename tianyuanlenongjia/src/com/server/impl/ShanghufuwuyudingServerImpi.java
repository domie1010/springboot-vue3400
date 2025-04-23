package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ShanghufuwuyudingMapper;
import com.entity.Shanghufuwuyuding;
import com.server.ShanghufuwuyudingServer;
@Service
public class ShanghufuwuyudingServerImpi implements ShanghufuwuyudingServer {
   @Resource
   private ShanghufuwuyudingMapper gdao;
	@Override
	public int add(Shanghufuwuyuding po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Shanghufuwuyuding po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Shanghufuwuyuding> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Shanghufuwuyuding> getsyshanghufuwuyuding1(Map<String, Object> map) {
		return gdao.getsyshanghufuwuyuding1(map);
	}
	public List<Shanghufuwuyuding> getsyshanghufuwuyuding2(Map<String, Object> map) {
		return gdao.getsyshanghufuwuyuding2(map);
	}
	public List<Shanghufuwuyuding> getsyshanghufuwuyuding3(Map<String, Object> map) {
		return gdao.getsyshanghufuwuyuding3(map);
	}
	
	@Override
	public Shanghufuwuyuding quchongShanghufuwuyuding(Map<String, Object> account) {
		return gdao.quchongShanghufuwuyuding(account);
	}

	@Override
	public List<Shanghufuwuyuding> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Shanghufuwuyuding> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Shanghufuwuyuding getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

