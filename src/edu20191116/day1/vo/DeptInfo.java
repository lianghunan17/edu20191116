package edu20191116.day1.vo;

public class DeptInfo {

	private Integer deptno;
	
	private String dname;
	
	private String loc;

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	@Override
	public String toString() {
		return "DeptInfo [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", getDeptno()=" + getDeptno()
				+ ", getDname()=" + getDname() + ", getLoc()=" + getLoc() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	
}
