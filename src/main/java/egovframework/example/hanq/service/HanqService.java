package egovframework.example.hanq.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface HanqService {

	List<EgovMap> selectHanqPieServiceList() throws Exception;

	List<EgovMap> selectHanqTableServiceList() throws Exception;

}
