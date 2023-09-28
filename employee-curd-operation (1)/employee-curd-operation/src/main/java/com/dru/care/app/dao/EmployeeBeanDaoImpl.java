package com.dru.care.app.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dru.care.app.bean.DeleteEmployeeReq;
import com.dru.care.app.bean.InsertEmployeesReq;
import com.dru.care.app.bean.InsertEmployeeReq;
import com.dru.care.app.bean.UpdateEmployeeReq;

@Repository
public class EmployeeBeanDaoImpl implements EmployeeBeanDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${insertQuery}")
	private String insertQuery;

	@Value("${updateQuery}")
	private String updateQuery;

	@Value("${softDeleteQuery}")
	private String softDeleteQuery;

	@Value("${findQuery}")
	private String findQuery;

	@Value("${findAllQuery}")
	private String findAllQuery;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Value("${queries.queryForInsertEmployee}")
	private String queryForInsertEmployee;

	@Value("${queries.queryForUpdateEmployee}")
	private String queryForUpdateEmployee;

	@Value("${queries.queryForSoftDeleteEmployee}")
	private String queryForSoftDeleteEmployee;

	/*
	 * insert employee using Map with NamedParameterJdbcTemplate
	 */
	@Override
	public Boolean insertEmployeeBeanUsingMap(InsertEmployeeReq insertEmployeeReq) {
		int update = 0;
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("firstNm", insertEmployeeReq.getFirstNm());
			map.put("lastNm", insertEmployeeReq.getLastNm());
			map.put("address", insertEmployeeReq.getAddress());
			map.put("phoneNo", insertEmployeeReq.getPhoneNo());
			map.put("emailId", insertEmployeeReq.getEmailId());
			map.put("empSalary", insertEmployeeReq.getEmpSalary());
			map.put("companyNm", insertEmployeeReq.getCompanyNm());
			map.put("empDesignation", insertEmployeeReq.getEmpDesignation());
			map.put("middleNm", insertEmployeeReq.getMiddleNm());
			map.put("pincode", insertEmployeeReq.getPincode());
			map.put("gender", insertEmployeeReq.getGender());
			map.put("branch", insertEmployeeReq.getBranch());
			update = namedParameterJdbcTemplate.update(queryForInsertEmployee, map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return update > 0;

	}

	/*
	 * insert employee using MapSqlParameterSource with NamedParameterJdbcTemplate
	 */

	@Override
	public Boolean insertEmployeeBeanUsingMapSqlParameter(InsertEmployeeReq insertEmployeeReq) {
		int update = 0;
		try {
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("firstNm", insertEmployeeReq.getFirstNm());
			parameters.addValue("lastNm", insertEmployeeReq.getLastNm());
			parameters.addValue("address", insertEmployeeReq.getAddress());
			parameters.addValue("phoneNo", insertEmployeeReq.getPhoneNo());
			parameters.addValue("emailId", insertEmployeeReq.getEmailId());
			parameters.addValue("empSalary", insertEmployeeReq.getEmpSalary());
			parameters.addValue("companyNm", insertEmployeeReq.getCompanyNm());
			parameters.addValue("empDesignation", insertEmployeeReq.getEmpDesignation());
			parameters.addValue("middleNm", insertEmployeeReq.getMiddleNm());
			parameters.addValue("pincode", insertEmployeeReq.getPincode());
			parameters.addValue("gender", insertEmployeeReq.getGender());
			parameters.addValue("branch", insertEmployeeReq.getBranch());
			update = namedParameterJdbcTemplate.update(queryForInsertEmployee, parameters);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return update > 0;
	}

	/*
	 * insert employee using BeanPropertySqlParameterSource with
	 * NamedParameterJdbcTemplate
	 */
	@Override
	public Boolean insertEmployeeBeanUsingBeanProperty(InsertEmployeeReq insertEmployeeReq) {
		int update = 0;
		try {
			update = namedParameterJdbcTemplate.update(queryForInsertEmployee,
					new BeanPropertySqlParameterSource(insertEmployeeReq));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return update > 0;
	}

	/*
	 * update employee using Map with NamedParameterJdbcTemplate
	 */
	@Override
	public Boolean updateEmployeeBeanUsingMap(UpdateEmployeeReq updateEmployeeReq) {
		int update = 0;
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("firstNm", updateEmployeeReq.getFirstNm());
			map.put("lastNm", updateEmployeeReq.getLastNm());
			map.put("address", updateEmployeeReq.getAddress());
			map.put("phoneNo", updateEmployeeReq.getPhoneNo());
			map.put("emailId", updateEmployeeReq.getEmailId());
			map.put("empSalary", updateEmployeeReq.getEmpSalary());
			map.put("companyNm", updateEmployeeReq.getCompanyNm());
			map.put("empDesignation", updateEmployeeReq.getEmpDesignation());
			map.put("middleNm", updateEmployeeReq.getMiddleNm());
			map.put("pincode", updateEmployeeReq.getPincode());
			map.put("gender", updateEmployeeReq.getGender());
			map.put("branch", updateEmployeeReq.getBranch());
			map.put("empId", updateEmployeeReq.getEmpId());
			update = namedParameterJdbcTemplate.update(queryForUpdateEmployee, map);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return update > 0;
	}

	/*
	 * update employee using MapSqlParameterSource with NamedParameterJdbcTemplate
	 */
	@Override
	public Boolean updateEmployeeBeanUsingMapSqlParameter(UpdateEmployeeReq updateEmployeeReq) {
		int update = 0;
		try {
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("firstNm", updateEmployeeReq.getFirstNm());
			parameters.addValue("lastNm", updateEmployeeReq.getLastNm());
			parameters.addValue("address", updateEmployeeReq.getAddress());
			parameters.addValue("phoneNo", updateEmployeeReq.getPhoneNo());
			parameters.addValue("emailId", updateEmployeeReq.getEmailId());
			parameters.addValue("empSalary", updateEmployeeReq.getEmpSalary());
			parameters.addValue("companyNm", updateEmployeeReq.getCompanyNm());
			parameters.addValue("empDesignation", updateEmployeeReq.getEmpDesignation());
			parameters.addValue("middleNm", updateEmployeeReq.getMiddleNm());
			parameters.addValue("pincode", updateEmployeeReq.getPincode());
			parameters.addValue("gender", updateEmployeeReq.getGender());
			parameters.addValue("branch", updateEmployeeReq.getBranch());
			parameters.addValue("empId", updateEmployeeReq.getEmpId());
			update = namedParameterJdbcTemplate.update(queryForUpdateEmployee, parameters);

		} catch (Exception e) {
			e.printStackTrace();

		}

		return update > 0;
	}

	/*
	 * update employee using BeanPropertySqlParameterSource with
	 * NamedParameterJdbcTemplate
	 */
	@Override
	public Boolean updateEmployeeBeanUsingBeanProperty(UpdateEmployeeReq updateEmployeeReq) {
		int update = 0;
		try {
			update = namedParameterJdbcTemplate.update(queryForUpdateEmployee,
					new BeanPropertySqlParameterSource(updateEmployeeReq));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return update > 0;

	}

	/*
	 * soft delete employee using Map with NamedParameterJdbcTemplate
	 */
	@Override
	public Boolean softDeleteEmployeeBeanUsingMap(DeleteEmployeeReq deleteEmployeeReq) {
		int update = 0;
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("empId", deleteEmployeeReq.getEmpId());
			update = namedParameterJdbcTemplate.update(queryForSoftDeleteEmployee, map);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return update > 0;
	}

	/*
	 * soft delete employee using MapSqlParameter with NamedParameterJdbcTemplate
	 */
	@Override
	public Boolean softDeleteEmployeeBeanUsingMapSqlParameter(DeleteEmployeeReq deleteEmployeeReq) {
		int update = 0;
		try {
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("empId", deleteEmployeeReq.getEmpId());
			update = namedParameterJdbcTemplate.update(queryForSoftDeleteEmployee, parameters);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return update > 0;
	}

	/*
	 * soft delete employee using BeanPropertySqlParameterSource with
	 * NamedParameterJdbcTemplate
	 */
	@Override
	public Boolean softDeleteEmployeeBeanUsingBeanParameter(DeleteEmployeeReq deleteEmployeeReq) {
		int update = 0;
		try {
			update = namedParameterJdbcTemplate.update(queryForSoftDeleteEmployee,
					new BeanPropertySqlParameterSource(deleteEmployeeReq));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return update > 0;
	}

	@Override
	public Boolean insertEmployeeBean(InsertEmployeesReq insertEmployeesReq) {
		int update = 0;
		try {
			update = jdbcTemplate.update(insertQuery, insertEmployeesReq.getFirstNm(), insertEmployeesReq.getLastNm(),
					insertEmployeesReq.getMiddleNm(), insertEmployeesReq.getAddress(), insertEmployeesReq.getPincode(),
					insertEmployeesReq.getGender(), insertEmployeesReq.getBranch(), insertEmployeesReq.getPhoneNo(),
					insertEmployeesReq.getEmailId(), insertEmployeesReq.getEmpSalary(),
					insertEmployeesReq.getCompanyNm(), insertEmployeesReq.getEmpDesignation());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return update > 0;
	}

	@Override
	public Boolean updateEmployeeBean(InsertEmployeesReq insertEmployeesReq) {
		int update = 0;
		try {
			update = jdbcTemplate.update(updateQuery, insertEmployeesReq.getFirstNm(), insertEmployeesReq.getLastNm(),
					insertEmployeesReq.getMiddleNm(), insertEmployeesReq.getAddress(), insertEmployeesReq.getPincode(),
					insertEmployeesReq.getGender(), insertEmployeesReq.getBranch(), insertEmployeesReq.getPhoneNo(),
					insertEmployeesReq.getEmailId(), insertEmployeesReq.getEmpSalary(),
					insertEmployeesReq.getCompanyNm(), insertEmployeesReq.getEmpDesignation(),
					insertEmployeesReq.getEmpId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return update > 0;
	}

	@Override
	public Boolean softDeleteEmployeeBean(InsertEmployeesReq insertEmployeesReq) {
		int update = 0;
		try {
			update = jdbcTemplate.update(softDeleteQuery, insertEmployeesReq.getEmailId());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return update > 0;
	}

	/*
	 * org.springframework.dao.EmptyResultDataAccessException: Incorrect result
	 * size: expected 1, actual 0
	 */
	@Override
	public InsertEmployeesReq findEmployeeBeanById(InsertEmployeesReq insertEmployeesReq) {
		InsertEmployeesReq queryForObject = null;
		try {
			queryForObject = jdbcTemplate.queryForObject(findQuery, new EmployeeMapper(),
					insertEmployeesReq.getEmpId());

		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		return queryForObject;

	}

	@Override
	public List<InsertEmployeesReq> findAllEmployeeBean() {
		List<InsertEmployeesReq> list = null;
		try {
			list = jdbcTemplate.query(findAllQuery, new EmployeeMapper());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
