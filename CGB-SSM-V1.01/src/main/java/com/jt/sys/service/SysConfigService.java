package com.jt.sys.service;
import java.util.List;
import com.jt.sys.entity.SysConfig;

public interface SysConfigService {

	List<SysConfig> findPageObjects(
		Integer pageCurrent);
}
