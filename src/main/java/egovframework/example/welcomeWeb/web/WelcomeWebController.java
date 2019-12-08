package egovframework.example.welcomeWeb.web;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.cmmn.vo.UserCmmnVO;
import egovframework.example.welcomeWeb.service.WelcomeWebService;
import egovframework.example.welcomeWeb.service.WelcomeWebVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Controller
public class WelcomeWebController {
	
	@Resource
	private WelcomeWebService welcomeWebService;
	
	@RequestMapping("/welcomeWeb.do")
	public String welcomeWebInit(@RequestParam(required = false) String selectSeqNo,
			@RequestParam(required = false) String selectColumn, 
			@RequestParam String selectCount, 
			ModelMap model) throws Exception {
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectWelcomeWebServiceList();
		
		List<EgovMap> pieChartList = welcomeWebService.selectPieChartServiceList();
		
		System.out.println(pieChartList);
		
		System.out.println(selectSeqNo);
		System.out.println(selectColumn);
		System.out.println(selectCount);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("selectSeqNo", selectSeqNo);
		model.addAttribute("selectColumn", selectColumn);
		model.addAttribute("selectCount", selectCount);
		
		return "welcomeWeb/welcomeWeb.tiles";
		
	}
	
	@RequestMapping("/welcomeWebTable.do")
	public String welcomeWebTableInit(ModelMap model) throws Exception {
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectWelcomeWebServiceList();
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWebTable.tiles";
		
	}
	
	@RequestMapping("/welcomeWebMap.do")
	public String welcomeWebMapInit(HttpServletRequest req, ModelMap model) throws Exception {
		System.out.println(req.getParameter("userNm"));
		
		HashMap<String, Object> resMap = new HashMap<>();
		
		resMap.put("userNm", req.getParameter("userNm"));
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectWelcomeWebMapServiceList(resMap);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWebTable.tiles";
		
	}
	
	@RequestMapping("/welcomeWebEgovMap.do")
	public String welcomeWebEgovMapInit(HttpServletRequest req, ModelMap model) throws Exception {
		System.out.println(req.getParameter("userNm"));
		
		EgovMap egovMap = new EgovMap();
		
		egovMap.put("user_nm", req.getParameter("userNm"));
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectWelcomeWebEgovMapServiceList(egovMap);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWebTable.tiles";
		
	}
	
	@RequestMapping("/welcomeWebString.do")
	public String welcomeWebStringInit(HttpServletRequest req, ModelMap model) throws Exception {
		String userNm = req.getParameter("userNm");
		
		System.out.println(req.getParameter("userNm"));
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectWelcomeWebStringServiceList(userNm);
		
		int ageInt = welcomeWebService.selectWelcomeWebIntServiceInfo(userNm);
		
		System.out.println("ageInt : " + ageInt);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWebTable.tiles";
		
	}
	
	@RequestMapping("/welcomeWebVO.do")
	public String welcomeWebVOInit(HttpServletRequest req, ModelMap model) throws Exception {
		
		WelcomeWebVO welcomeWebVO = new WelcomeWebVO();
		
		welcomeWebVO.setUserNm(req.getParameter("userNm"));
		
		System.out.println(welcomeWebVO.getUserNm());
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectWelcomeWebVOServiceList(welcomeWebVO);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWebTable.tiles";
	}
	
	@RequestMapping("/welcomeWebReqPm.do")
	public String welcomeWebReqPmInit(@RequestParam String userNm, 
			String pageName, @RequestParam(value="pageName", required=false) String temp, @RequestParam HashMap map, ModelMap model) throws Exception {
		
		System.out.println("RequsetParam으로 받아요! : " + userNm);
		System.out.println("RequsetParam으로 또 받아요! : " + pageName);
		System.out.println("RequsetParam으로 또또 받아요! : " + temp);
		System.out.println("RequsetParam으로 또또또 받아요! : " + map);
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectWelcomeWebStringServiceList(userNm);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWebTable.tiles";
	}
	
	@RequestMapping("/welcomeWebModelVO.do")
	public String welcomeWebModelVOInit(@ModelAttribute("vo") WelcomeWebVO vo,
			ModelMap model) throws Exception {
		System.out.println("@ModelAttribute로 보는 userNm : " + vo.getUserNm());
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectWelcomeWebVOServiceList(vo);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWebTable.tiles";
		
	}
	
	@RequestMapping("/welcomeWebCmmnVO.do")
	public String welcomeWebCmmnVOInit(HttpServletRequest req, ModelMap model) throws Exception {
		
		UserCmmnVO userCmmnVO = new UserCmmnVO();
		
		userCmmnVO.setUserNm(req.getParameter("userNm"));
		
		System.out.println("userCmmnVO로 보는 userNm : " + userCmmnVO.getUserNm());
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectWelcomeWebCmmnVOServiceList(userCmmnVO);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWebTable.tiles";
	}
	
}
