package com.dru.care.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dru.care.app.bean.DeleteEmployeeReq;
import com.dru.care.app.bean.InsertEmployeesReq;
import com.dru.care.app.bean.InsertEmployeeReq;
import com.dru.care.app.bean.UpdateEmployeeReq;
import com.dru.care.app.dao.EmployeeBeanDao;

@Service
public class EmployeeBeanServiceImpl implements EmployeeBeanService {

	@Autowired
	private EmployeeBeanDao employeeBeanDao;

	@Override
	public Boolean insertEmployeeBean(InsertEmployeesReq employeesReq) {
		return employeeBeanDao.insertEmployeeBean(employeesReq);
	}

	@Override
	public Boolean updateEmployeeBean(InsertEmployeesReq employeesReq) {
		return employeeBeanDao.updateEmployeeBean(employeesReq);
	}

	@Override
	public Boolean softDeleteEmployeeBean(InsertEmployeesReq employeesReq) {
		return employeeBeanDao.softDeleteEmployeeBean(employeesReq);
	}

	@Override
	public InsertEmployeesReq findEmployeeBeanById(InsertEmployeesReq employeesReq) {
		return employeeBeanDao.findEmployeeBeanById(employeesReq);
	}

	@Override
	public List<InsertEmployeesReq> findAllEmployeeBean() {
		return employeeBeanDao.findAllEmployeeBean();
	}

	@Override
	public Boolean insertEmployeeBeanUsingMap(InsertEmployeeReq insertEmployeeReq) {

		return employeeBeanDao.insertEmployeeBeanUsingMap(insertEmployeeReq);
	}

	@Override
	public Boolean insertEmployeeBeanUsingMapSqlParameter(InsertEmployeeReq insertEmployeeReq) {

		return employeeBeanDao.insertEmployeeBeanUsingMapSqlParameter(insertEmployeeReq);
	}

	@Override
	public Boolean insertEmployeeBeanUsingBeanProperty(InsertEmployeeReq insertEmployeeReq) {

		return employeeBeanDao.insertEmployeeBeanUsingBeanProperty(insertEmployeeReq);
	}

	@Override
	public Boolean updateEmployeeBeanUsingMap(UpdateEmployeeReq updateEmployeeReq) {
		return employeeBeanDao.updateEmployeeBeanUsingMap(updateEmployeeReq);
	}

	@Override
	public Boolean updateEmployeeBeanUsingMapSqlParameter(UpdateEmployeeReq updateEmployeeReq) {
		return employeeBeanDao.updateEmployeeBeanUsingMapSqlParameter(updateEmployeeReq);
	}

	@Override
	public Boolean updateEmployeeBeanUsingBeanProperty(UpdateEmployeeReq updateEmployeeReq) {
		return employeeBeanDao.updateEmployeeBeanUsingBeanProperty(updateEmployeeReq);
	}

	@Override
	public Boolean softDeleteEmployeeBeanUsingMap(DeleteEmployeeReq deleteEmployeeReq) {
		return employeeBeanDao.softDeleteEmployeeBeanUsingMap(deleteEmployeeReq);
	}

	@Override
	public Boolean softDeleteEmployeeBeanUsingMapSqlParameter(DeleteEmployeeReq deleteEmployeeReq) {
		return employeeBeanDao.softDeleteEmployeeBeanUsingMapSqlParameter(deleteEmployeeReq);
	}

	@Override
	public Boolean softDeleteEmployeeBeanUsingBeanParameter(DeleteEmployeeReq deleteEmployeeReq) {
		return employeeBeanDao.softDeleteEmployeeBeanUsingBeanParameter(deleteEmployeeReq);
	}

}
