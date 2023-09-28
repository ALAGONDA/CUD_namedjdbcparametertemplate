package com.dru.care.app.service;

import java.util.List;

import com.dru.care.app.bean.DeleteEmployeeReq;
import com.dru.care.app.bean.InsertEmployeesReq;
import com.dru.care.app.bean.InsertEmployeeReq;
import com.dru.care.app.bean.UpdateEmployeeReq;

public interface EmployeeBeanService {

	Boolean insertEmployeeBean(InsertEmployeesReq employeesReq);

	Boolean updateEmployeeBean(InsertEmployeesReq employeesReq);

	Boolean softDeleteEmployeeBean(InsertEmployeesReq employeesReq);

	InsertEmployeesReq findEmployeeBeanById(InsertEmployeesReq employeesReq);

	List<InsertEmployeesReq> findAllEmployeeBean();

	Boolean insertEmployeeBeanUsingMap(InsertEmployeeReq insertEmployeeReq);

	Boolean insertEmployeeBeanUsingMapSqlParameter(InsertEmployeeReq insertEmployeeReq);

	Boolean insertEmployeeBeanUsingBeanProperty(InsertEmployeeReq insertEmployeeReq);

	Boolean updateEmployeeBeanUsingMap(UpdateEmployeeReq updateEmployeeReq);

	Boolean updateEmployeeBeanUsingMapSqlParameter(UpdateEmployeeReq updateEmployeeReq);

	Boolean updateEmployeeBeanUsingBeanProperty(UpdateEmployeeReq updateEmployeeReq);

	Boolean softDeleteEmployeeBeanUsingMap(DeleteEmployeeReq deleteEmployeeReq);

	Boolean softDeleteEmployeeBeanUsingMapSqlParameter(DeleteEmployeeReq deleteEmployeeReq);

	Boolean softDeleteEmployeeBeanUsingBeanParameter(DeleteEmployeeReq deleteEmployeeReq);

}
