package egovframework.example.hanq.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.hanq.service.HanqService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Controller
public class HanqController {
	
	@Resource
	private HanqService hanqService;
	
	@RequestMapping("/pie.do")
	public String hanqPieList(Model model) throws Exception {
		
		List<EgovMap> hanqPieList = hanqService.selectHanqPieServiceList();
		
		model.addAttribute("hanqPieList", hanqPieList);
		
		return "hanq/pie.tiles";
	}
	
	@RequestMapping("/table.do")
	public String hanqTableList(Model model) throws Exception {
		
		List<EgovMap> hanqTableList = hanqService.selectHanqTableServiceList();
		
		model.addAttribute("hanqTableList", hanqTableList);
		
		return "hanq/table.tiles";
	}
}
