package egovframework.example.main.web;

import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/main.do")
	public String initOne(HttpServletRequest req,
			ModelMap model, @RequestParam(required = false) String arr) throws Exception {
		
		 /*Enumeration<String> names = req.getParameterNames();
		 
		 while (names.hasMoreElements()) {
			String name = names.nextElement();
			
			System.out.println("각각의 name : " + name);
			
			String[] paramVal = req.getParameterValues(name);
			
			if (paramVal.length > 1) {
				System.out.println("각각의 value : " + Arrays.toString(paramVal));
			} else {
				System.out.println("각각의 value : " + paramVal[0]);
			}
			
			
		}
		
		if (arr != null) {
			String[] arrLiteral = arr.split(",");
			
			model.addAttribute("arr", arrLiteral);
		}*/
		
		return "main/main.tiles";
	}
}
