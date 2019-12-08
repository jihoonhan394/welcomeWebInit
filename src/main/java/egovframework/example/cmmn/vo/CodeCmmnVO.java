package egovframework.example.cmmn.vo;

import org.apache.ibatis.type.Alias;

@Alias("codeCmmnVO")
public class CodeCmmnVO {
	private String CodeNm;

	public String getCodeNm() {
		return CodeNm;
	}

	public void setCodeNm(String codeNm) {
		CodeNm = codeNm;
	}
	
}
