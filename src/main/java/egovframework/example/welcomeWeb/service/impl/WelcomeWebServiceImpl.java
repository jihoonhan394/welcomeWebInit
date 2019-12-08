package egovframework.example.welcomeWeb.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.cmmn.vo.UserCmmnVO;
import egovframework.example.welcomeWeb.service.WelcomeWebService;
import egovframework.example.welcomeWeb.service.WelcomeWebVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service
public class WelcomeWebServiceImpl implements WelcomeWebService {

	@Resource
	private WelcomeWebMapper welcomeWebMapper;
	
	@Override
	public List<EgovMap> selectWelcomeWebServiceList() throws Exception {
		
		return welcomeWebMapper.selectWelcomeWebServiceList();
	}

	@Override
	public List<EgovMap> selectPieChartServiceList() throws Exception {
		return welcomeWebMapper.selectPieChartServiceList();
	}

	@Override
	public List<EgovMap> selectWelcomeWebMapServiceList(HashMap<String, Object> resMap) throws Exception {
		return welcomeWebMapper.selectWelcomeWebMapServiceList(resMap);
	}

	@Override
	public List<EgovMap> selectWelcomeWebEgovMapServiceList(EgovMap egovMap) throws Exception {
		return welcomeWebMapper.selectWelcomeWebEgovMapServiceList(egovMap);
	}

	@Override
	public List<EgovMap> selectWelcomeWebStringServiceList(String userNm) throws Exception {
		return welcomeWebMapper.selectWelcomeWebStringServiceList(userNm);
	}

	@Override
	public int selectWelcomeWebIntServiceInfo(String userNm) throws Exception {
		return welcomeWebMapper.selectWelcomeWebIntServiceInfo(userNm);
	}

	@Override
	public List<EgovMap> selectWelcomeWebVOServiceList(WelcomeWebVO welcomeWebVO) throws Exception {
		return welcomeWebMapper.selectWelcomeWebVOServiceList(welcomeWebVO);
	}

	@Override
	public List<EgovMap> selectWelcomeWebCmmnVOServiceList(UserCmmnVO userCmmnVO) throws Exception {
		return welcomeWebMapper.selectWelcomeWebCmmnVOServiceList(userCmmnVO);
	}

}
