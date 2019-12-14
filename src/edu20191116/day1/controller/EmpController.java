package edu20191116.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu20191116.day1.service.EmpService;
import edu20191116.day1.vo.EmpInfo;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getEmpList(ModelMap modelMap) {

		List<EmpInfo> emp = empService.getEmpList();

		modelMap.addAttribute("list", emp);
		return "emp";

	}

	@RequestMapping(value = "/{empid}", method = RequestMethod.GET)
	@ResponseBody
	public EmpInfo getEmp(@PathVariable Integer empid) {
		return empService.getEmpById(empid);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addEmp(ModelMap modelMap) {
		modelMap.put("emp", new EmpInfo());
		return "add_emp";
	}
}
