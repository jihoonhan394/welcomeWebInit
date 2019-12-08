package egovframework.example.cmmn.vo;

import org.apache.ibatis.type.Alias;

@Alias("userCmmnVO")
public class UserCmmnVO {
	private String userNm;

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	
}
