package egovframework.example.array.web;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import egovframework.example.array.service.ArrayService;

@Controller
public class ArrayController {

	@Resource
	private ArrayService arrayService;
	
	@RequestMapping("/array.do")
	public String initArray(ModelMap model) throws Exception {
		
		model.addAttribute("arrayList", arrayService.selectArrayServiceList());
		
		return "array/array.tiles";
	}
}

