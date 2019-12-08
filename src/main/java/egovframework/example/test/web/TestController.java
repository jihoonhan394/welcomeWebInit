package egovframework.example.test.web;

import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/test.do")
	public String testInit(HttpServletRequest req) throws Exception {
		
		 String[] values = req.getParameterValues("test[]");
		
		System.out.println( Arrays.toString(values));
		
		String[] values2 = req.getParameterValues("test1");
		
		System.out.println( Arrays.toString(values));
		
		return "test/test.tiles";
	}
	
}
