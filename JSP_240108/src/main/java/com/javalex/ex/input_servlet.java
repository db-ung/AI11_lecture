package com.javalex.ex;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class input_servlet
 */
@WebServlet("/inpu")
public class input_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public input_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		String na = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String ma = request.getParameter("major");
			//사용자가 선택한 value값 처리
		String[] ho = request.getParameterValues("hobby") ;
			// 사용자가 선택한 복수의 value값들 처리
		String si = request.getParameter("site");
		
		PrintWriter pw = response.getWriter(); // 간략하게 줄일수있다
		
		pw.println("<h3>"+na+"님 환영함.<h3>");
		pw.println("<h3>"+age+"나이함.<h3>");
		
		// 전공값 출력 :: 영문으로 전달받은 값을 한글로 전환함
		switch(ma) {		
		case "computer":	//value 값이 computer라면
			ma="컴공과";
			break;
		case "math":
			ma="수학과";
			break;
		case "teacher":
			ma="교육과";
			break;
		}
		pw.println("<h3>전공 : "+ma+"<h3>");
		
		pw.println("<p>취미:");
		if(ho==null) { // 사용자가 아무것도 선택하지 않았다면
			pw.println("취미 없음");
		}
		else {	//사용자가 취미란에 어떤 것이라도 선택을 한 경우
			for(int i = 0;i<ho.length;i++) {
				switch(ho[i]) {	//0부터 시작하여, hobby 원소들 한글로 변형
				case "jogging":
					ho[i]="조깅";break;
				case "cook":
					ho[i]="요리";break;
				case "read":
					ho[i]="독서";break;
				case "game":
					ho[i]="게임";break;
				}
				pw.println(ho[i]);
				if(i!=ho.length-1) {
					pw.println(",");
				}
			}
		}
		pw.println("</p>");
		
		switch(si) {		
		case "naver":	//value 값이 naver라면
			si="네이버";
			break;
		case "daum":
			si="다음";
			break;
		case "google":
			si="구글";
			break;
		}
		pw.println("<h3>"+si+"앵 <h3>");
		
		// \"로 println 수행하면 "로 전송됨
		pw.println("<form action=\"input.html\">");
		pw.println("<input type=\"submit\" value=\"다시 입력\">");
		pw.println("</form>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
