package egovframework.example.welcomeWeb.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.stringtemplate.v4.compiler.STParser.mapExpr_return;

import egovframework.example.welcomeWeb.service.TestVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public class Step2Test {
	
	public static void main(String[] args) {
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		for (int i = 0; i < 3; i++) {
			
//			list.add(new HashMap<String, Object>());
//			
//			list.get(i).put(Integer.toString(i), i);
//			
			Map<String, Object> obj = new HashMap<String, Object>();
			
			list.add(i, obj);
			
			obj.put(Integer.toString(i), (i < 2) ? "hanq" + i : i);
			
			list.set(i, obj);
			
			
			
			
			
			
		} 
		
		TestVO vo = new TestVO();
		
		vo.setList(list);

		Map<String, Object> obj = new HashMap<String, Object>();
		
		for (int i = 0; i < vo.getList().size(); i++) {
			
			for (String a : vo.getList().get(i).keySet()) {
				
				if (Integer.parseInt(a) % 2 == 0) {
					obj.put(a, vo.getList().get(i));
					
					vo.setObj(obj);
				}
			}
			
		}
		
		List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();
		
		int j = 0;
		
		for (int i = 0; i < vo.getObj().size(); i++) {
			
			/*if (vo.getObj().get(Integer.toString(j)) == null) j++;
				list2.add(i, (Map<String, Object>) vo.getObj().get(Integer.toString(j)));
				
				j++;*/
				
			if (vo.getObj().get(Integer.toString(j)) == null) {
			j++;
			}
			
			list2.add(i, (Map<String, Object>) vo.getObj().get(Integer.toString(j)));
			
			j++;
		} 
		
		
		System.out.println(list);
		
		System.out.println(vo.getObj());
		
		System.out.println(list2);
		
	}
}
