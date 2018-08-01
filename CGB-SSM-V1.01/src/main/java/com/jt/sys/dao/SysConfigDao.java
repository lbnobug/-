package com.jt.sys.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jt.sys.entity.SysConfig;
//MapperScannerConfigurer
public interface SysConfigDao {
	 List<SysConfig> findPageObjects(
			 @Param("startIndex")Integer startIndex,
			 @Param("pageSize")Integer pageSize);
}
