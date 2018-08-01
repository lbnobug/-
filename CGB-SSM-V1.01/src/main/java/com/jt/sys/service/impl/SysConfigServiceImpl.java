package com.jt.sys.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.sys.dao.SysConfigDao;
import com.jt.sys.entity.SysConfig;
import com.jt.sys.service.SysConfigService;
@Service
public class SysConfigServiceImpl implements SysConfigService {
	@Autowired
	private SysConfigDao sysConfigDao;
	@Override
	public List<SysConfig> 
	  findPageObjects(Integer pageCurrent) {
	    //1.参数合法验证
		if(pageCurrent==null||pageCurrent<1)
	    throw new IllegalArgumentException("参数无效");
		//2.查询数据
		int pageSize=2;
		int startIndex=(pageCurrent-1)*pageSize;
		List<SysConfig> list=
		sysConfigDao.findPageObjects(
				startIndex,
				pageSize);
		//3.返回结果
		return list;
	}

}
