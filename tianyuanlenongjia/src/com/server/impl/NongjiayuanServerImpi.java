package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.NongjiayuanMapper;
import com.entity.Nongjiayuan;
import com.server.NongjiayuanServer;
@Service
public class NongjiayuanServerImpi implements NongjiayuanServer {
   @Resource
   private NongjiayuanMapper gdao;
	@Override
	public int add(Nongjiayuan po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Nongjiayuan po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Nongjiayuan> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Nongjiayuan> getsynongjiayuan1(Map<String, Object> map) {
		return gdao.getsynongjiayuan1(map);
	}
	public List<Nongjiayuan> getsynongjiayuan2(Map<String, Object> map) {
		return gdao.getsynongjiayuan2(map);
	}
	public List<Nongjiayuan> getsynongjiayuan3(Map<String, Object> map) {
		return gdao.getsynongjiayuan3(map);
	}
	
	@Override
	public Nongjiayuan quchongNongjiayuan(Map<String, Object> account) {
		return gdao.quchongNongjiayuan(account);
	}

	@Override
	public List<Nongjiayuan> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Nongjiayuan> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Nongjiayuan getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

