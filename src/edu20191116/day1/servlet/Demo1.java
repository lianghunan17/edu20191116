package edu20191116.day1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo1 extends HttpServlet {
//servlet 接口
	// httpservlet doget dopost

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//OutputStream ops = resp.getOutputStream();
		// url,uriの要求
		// ops.write(("Hello world"+req.getRequestURL().toString()).getBytes());
		// Integer num = Integer.valueOf(req.getParameter("num"));
		// String result = isOddOrEven(num);
		// ops.write(result.getBytes());
		// resp.sendRedirect("jsp/check.jsp");//
		req.getRequestDispatcher("jsp/check.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer num = Integer.valueOf(req.getParameter("num"));
		System.out.println(num);
		req.setAttribute("num",num);
		req.setAttribute("result",isOddOrEven(num));
		doGet(req,resp);
	}

	private String isOddOrEven(Integer num) {
		String result = null;
		if (num % 2 != 0) {//
			result = num + ":odd";
		} else {
			result = num + ":even";
		}
		return result;
	}
}
