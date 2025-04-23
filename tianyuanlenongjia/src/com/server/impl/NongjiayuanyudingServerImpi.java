package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.NongjiayuanyudingMapper;
import com.entity.Nongjiayuanyuding;
import com.server.NongjiayuanyudingServer;
@Service
public class NongjiayuanyudingServerImpi implements NongjiayuanyudingServer {
   @Resource
   private NongjiayuanyudingMapper gdao;
	@Override
	public int add(Nongjiayuanyuding po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Nongjiayuanyuding po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	@Override
	public int updatelb(Nongjiayuanyuding po) {
		return gdao.updateByPrimaryKeySelectivelb(po);
	}
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Nongjiayuanyuding> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Nongjiayuanyuding> getsynongjiayuanyuding1(Map<String, Object> map) {
		return gdao.getsynongjiayuanyuding1(map);
	}
	public List<Nongjiayuanyuding> getsynongjiayuanyuding2(Map<String, Object> map) {
		return gdao.getsynongjiayuanyuding2(map);
	}
	public List<Nongjiayuanyuding> getsynongjiayuanyuding3(Map<String, Object> map) {
		return gdao.getsynongjiayuanyuding3(map);
	}
	
	@Override
	public Nongjiayuanyuding quchongNongjiayuanyuding(Map<String, Object> account) {
		return gdao.quchongNongjiayuanyuding(account);
	}

	@Override
	public List<Nongjiayuanyuding> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Nongjiayuanyuding> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Nongjiayuanyuding getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

