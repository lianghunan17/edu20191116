package edu20191116.day1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu20191116.day1.dao.mapper.EmpMapper;
import edu20191116.day1.vo.EmpInfo;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper empMapper;

	@Override
	public List<EmpInfo> getEmpList() {
		// TODO Auto-generated method stub
		return empMapper.getEmpList();
	}

	@Override
	public Integer getEmpCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmpInfo getEmpById(Integer empid) {
		// TODO Auto-generated method stub
		return empMapper.getEmpById(empid);
	}

}
