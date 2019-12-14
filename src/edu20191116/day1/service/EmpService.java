package edu20191116.day1.service;

import java.util.List;

import edu20191116.day1.vo.EmpInfo;

public interface EmpService {
	List<EmpInfo> getEmpList();

	Integer getEmpCount();

	EmpInfo getEmpById(Integer empid);

}
