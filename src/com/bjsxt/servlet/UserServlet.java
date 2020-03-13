package com.bjsxt.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//设置请求编码格式
		req.setCharacterEncoding("utf-8");
		//设置相应编码格式
		resp.setContentType("text/html;charset=utf-8");
		//调用登录处理方法
		checkUserLogin(req,resp);
		//获取请求信息
		//处理请求信息
		//响应处理结果
			//直接响应
			//请求转发
			//重定向
	}
	//处理登录
	private void checkUserLogin(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}
	
	
}
