package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.PingtaifuwuyudingMapper;
import com.entity.Pingtaifuwuyuding;
import com.server.PingtaifuwuyudingServer;
@Service
public class PingtaifuwuyudingServerImpi implements PingtaifuwuyudingServer {
   @Resource
   private PingtaifuwuyudingMapper gdao;
	@Override
	public int add(Pingtaifuwuyuding po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Pingtaifuwuyuding po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Pingtaifuwuyuding> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Pingtaifuwuyuding> getsypingtaifuwuyuding1(Map<String, Object> map) {
		return gdao.getsypingtaifuwuyuding1(map);
	}
	public List<Pingtaifuwuyuding> getsypingtaifuwuyuding2(Map<String, Object> map) {
		return gdao.getsypingtaifuwuyuding2(map);
	}
	public List<Pingtaifuwuyuding> getsypingtaifuwuyuding3(Map<String, Object> map) {
		return gdao.getsypingtaifuwuyuding3(map);
	}
	
	@Override
	public Pingtaifuwuyuding quchongPingtaifuwuyuding(Map<String, Object> account) {
		return gdao.quchongPingtaifuwuyuding(account);
	}

	@Override
	public List<Pingtaifuwuyuding> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Pingtaifuwuyuding> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Pingtaifuwuyuding getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

