package edu20191116.day1.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu20191116.day1.vo.EmpInfo;

public interface EmpMapper {

	@Select("select * from emp")
	@ResultMap("empResultMap")
	List<EmpInfo> getEmpList();
	
	@Select("select count(*) from emp")
	Integer getEmpCount();
	
	@Select("select * from emp where empno = #{id}")
	@ResultMap("empResultMap")
	EmpInfo getEmpById(@Param (value = "id")Integer empno);
}
