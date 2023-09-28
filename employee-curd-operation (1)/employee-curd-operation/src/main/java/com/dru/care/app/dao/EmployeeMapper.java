package com.dru.care.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dru.care.app.bean.InsertEmployeesReq;

public class EmployeeMapper implements RowMapper<InsertEmployeesReq> {

	@Override
	public InsertEmployeesReq mapRow(ResultSet rs, int rowNum) throws SQLException {
		InsertEmployeesReq bean=new InsertEmployeesReq();
		bean.setEmpId(rs.getLong("emp_id"));
		bean.setFirstNm(rs.getString("first_nm"));
		bean.setMiddleNm(rs.getString("middle_nm"));
		bean.setLastNm(rs.getString("last_nm"));
		bean.setAddress(rs.getString("address"));
		bean.setPincode(rs.getInt("pincode"));
		bean.setGender(rs.getString("gender"));
		bean.setBranch(rs.getString("branch"));
		bean.setPhoneNo(rs.getLong("phone_no"));
		bean.setEmailId(rs.getString("email_id"));
		bean.setEmpSalary(rs.getDouble("emp_salary"));
		bean.setCompanyNm(rs.getString("company_nm"));
		bean.setEmpDesignation(rs.getString("emp_designation"));
		bean.setIsActive(rs.getBoolean("isactive"));
		return bean;
	}

}
