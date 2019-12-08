package egovframework.example.hanq.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.hanq.service.HanqService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service
public class HanqServiceImpl implements HanqService {

	@Resource
	private HanqMapper hanqMapper;
	
	@Override
	public List<EgovMap> selectHanqPieServiceList() throws Exception {
		
		return hanqMapper.selectHanqPieServiceList();
	}

	@Override
	public List<EgovMap> selectHanqTableServiceList() throws Exception {
		
		return hanqMapper.selectHanqTableServiceList();
	}

}
