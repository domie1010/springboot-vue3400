package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.PingtaifuwuMapper;
import com.entity.Pingtaifuwu;
import com.server.PingtaifuwuServer;
@Service
public class PingtaifuwuServerImpi implements PingtaifuwuServer {
   @Resource
   private PingtaifuwuMapper gdao;
	@Override
	public int add(Pingtaifuwu po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Pingtaifuwu po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Pingtaifuwu> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Pingtaifuwu> getsypingtaifuwu1(Map<String, Object> map) {
		return gdao.getsypingtaifuwu1(map);
	}
	public List<Pingtaifuwu> getsypingtaifuwu2(Map<String, Object> map) {
		return gdao.getsypingtaifuwu2(map);
	}
	public List<Pingtaifuwu> getsypingtaifuwu3(Map<String, Object> map) {
		return gdao.getsypingtaifuwu3(map);
	}
	
	@Override
	public Pingtaifuwu quchongPingtaifuwu(Map<String, Object> account) {
		return gdao.quchongPingtaifuwu(account);
	}

	@Override
	public List<Pingtaifuwu> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Pingtaifuwu> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Pingtaifuwu getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

