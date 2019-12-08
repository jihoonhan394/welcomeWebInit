package egovframework.example.welcomeWeb.service.impl;

import java.util.HashMap;
import java.util.List;

import egovframework.example.cmmn.vo.UserCmmnVO;
import egovframework.example.welcomeWeb.service.WelcomeWebVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper
public interface WelcomeWebMapper {

	List<EgovMap> selectWelcomeWebServiceList() throws Exception;

	List<EgovMap> selectPieChartServiceList() throws Exception;

	List<EgovMap> selectWelcomeWebMapServiceList(HashMap<String, Object> resMap) throws Exception;

	List<EgovMap> selectWelcomeWebEgovMapServiceList(EgovMap egovMap) throws Exception;

	List<EgovMap> selectWelcomeWebStringServiceList(String userNm) throws Exception;

	int selectWelcomeWebIntServiceInfo(String userNm) throws Exception;

	List<EgovMap> selectWelcomeWebVOServiceList(WelcomeWebVO welcomeWebVO) throws Exception;

	List<EgovMap> selectWelcomeWebCmmnVOServiceList(UserCmmnVO userCmmnVO) throws Exception;

}
