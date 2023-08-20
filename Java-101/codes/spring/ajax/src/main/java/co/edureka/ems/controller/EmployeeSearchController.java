package co.edureka.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.dto.Employee;
import co.edureka.ems.services.EmployeeService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class EmployeeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static EmployeeService service;
	
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");
		service = (EmployeeService) context.getBean("employee-service");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno = request.getParameter("eno");
		Integer empno = Integer.parseInt(eno);
		Employee emp = service.searchEmployeeByNo(empno);
		
		PrintWriter out = response.getWriter();
		
		if(emp != null) {
			JSONObject jObj = new JSONObject();
			jObj.put("emp_name", emp.getEmployeeName());
			jObj.put("emp_sal", emp.getEmployeeSal());
			
			response.setContentType("application/json");
			out.print(jObj);
		}else {
			response.setContentType("text/plain");
			out.print("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
