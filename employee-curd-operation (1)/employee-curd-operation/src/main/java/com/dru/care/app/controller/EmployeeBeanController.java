package com.dru.care.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dru.care.app.bean.DeleteEmployeeReq;
import com.dru.care.app.bean.InsertEmployeesReq;
import com.dru.care.app.bean.InsertEmployeeReq;
import com.dru.care.app.bean.UpdateEmployeeReq;
import com.dru.care.app.service.EmployeeBeanService;

@RestController
public class EmployeeBeanController {

	@Autowired
	private EmployeeBeanService employeeBeanService;

	/*
	 * insert employee using Map with NamedParameterJdbcTemplate
	 */
	@PostMapping(value = "/insertEmployeeBeanUsingMap")
	public Boolean insertEmployeeBeanUsingMap(@RequestBody InsertEmployeeReq insertEmployeeReq) {
		return employeeBeanService.insertEmployeeBeanUsingMap(insertEmployeeReq);
	}

	/*
	 * insert employee using MapSqlParameterSource with NamedParameterJdbcTemplate
	 */
	@PostMapping(value = "/insertEmployeeBeanUsingMapSqlParameter")
	public Boolean insertEmployeeBeanUsingMapSqlParameter(@RequestBody InsertEmployeeReq insertEmployeeReq) {
		return employeeBeanService.insertEmployeeBeanUsingMapSqlParameter(insertEmployeeReq);
	}

	/*
	 * insert employee using BeanPropertySqlParameterSource with
	 * NamedParameterJdbcTemplate
	 */
	@PostMapping(value = "/insertEmployeeBeanUsingBeanProperty")
	public Boolean insertEmployeeBeanUsingBeanProperty(@RequestBody InsertEmployeeReq insertEmployeeBean) {
		return employeeBeanService.insertEmployeeBeanUsingBeanProperty(insertEmployeeBean);
	}

	/*
	 * update employee using Map with NamedParameterJdbcTemplate
	 */
	@PostMapping(value = "/updateEmployeeBeanUsingMap")
	public Boolean updateEmployeeBeanUsingMap(@RequestBody UpdateEmployeeReq updateEmployeeReq) {
		return employeeBeanService.updateEmployeeBeanUsingMap(updateEmployeeReq);
	}

	/*
	 * update employee using MapSqlParameterSource with NamedParameterJdbcTemplate
	 */
	@PostMapping(value = "/updateEmployeeBeanUsingMapSqlParameter")
	public Boolean updateEmployeeBeanUsingMapSqlParameter(@RequestBody UpdateEmployeeReq updateEmployeeReq) {
		return employeeBeanService.updateEmployeeBeanUsingMapSqlParameter(updateEmployeeReq);
	}

	/*
	 * update employee using BeanPropertySqlParameterSource with
	 * NamedParameterJdbcTemplate
	 */
	@PostMapping(value = "/updateEmployeeBeanUsingBeanProperty")
	public Boolean updateEmployeeBeanUsingBeanProperty(@RequestBody UpdateEmployeeReq updateEmployeeReq) {
		return employeeBeanService.updateEmployeeBeanUsingBeanProperty(updateEmployeeReq);
	}

	/*
	 * soft delete employee using Map with NamedParameterJdbcTemplate
	 */
	@PostMapping(value = "/softDeleteEmployeeBeanUsingMap")
	public Boolean softDeleteEmployeeBeanUsingMap(@RequestBody DeleteEmployeeReq deleteEmployeeReq) {
		return employeeBeanService.softDeleteEmployeeBeanUsingMap(deleteEmployeeReq);
	}

	/*
	 * soft delete employee using MapSqlParameterSource with
	 * NamedParameterJdbcTemplate
	 */
	@PostMapping(value = "/softDeleteEmployeeBeanUsingMapSqlParameter")
	public Boolean softDeleteEmployeeBeanUsingMapSqlParameter(@RequestBody DeleteEmployeeReq deleteEmployeeReq) {
		return employeeBeanService.softDeleteEmployeeBeanUsingMapSqlParameter(deleteEmployeeReq);
	}

	/*
	 * soft delete employee using BeanPropertySqlParameter with
	 * NamedParameterJdbcTemplate
	 */
	@PostMapping(value = "/softDeleteEmployeeBeanUsingBeanParameter")
	public Boolean softDeleteEmployeeBeanUsingBeanParameter(@RequestBody DeleteEmployeeReq deleteEmployeeReq) {
		return employeeBeanService.softDeleteEmployeeBeanUsingBeanParameter(deleteEmployeeReq);
	}

	@PostMapping(value = "/insertEmployeeBean")
	public Boolean insertEmployeeBean(@RequestBody InsertEmployeesReq insertEmployeesReq) {
		return employeeBeanService.insertEmployeeBean(insertEmployeesReq);
	}

	@PostMapping(value = "/updateEmployeeBean")
	public Boolean updateEmployeeBean(@RequestBody InsertEmployeesReq insertEmployeesReq) {
		return employeeBeanService.updateEmployeeBean(insertEmployeesReq);
	}

	@PostMapping(value = "/softDeleteEmployeeBean")
	public Boolean softDeleteEmployeeBean(@RequestBody InsertEmployeesReq insertEmployeesReq) {
		return employeeBeanService.softDeleteEmployeeBean(insertEmployeesReq);
	}

	@PostMapping(value = "/findEmployeeBeanById")
	public InsertEmployeesReq findEmployeeBeanById(@RequestBody InsertEmployeesReq insertEmployeesReq) {
		return employeeBeanService.findEmployeeBeanById(insertEmployeesReq);
	}

	@PostMapping(value = "/findAllEmployeeBean")
	public List<InsertEmployeesReq> findAllEmployeeBean() {
		return employeeBeanService.findAllEmployeeBean();
	}

}
