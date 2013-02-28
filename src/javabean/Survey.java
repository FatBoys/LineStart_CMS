package javabean;

import java.util.Date;

/**
 * 问卷
 * @author xmwang
 *
 */
public class Survey {
	
	/** 问卷id */
	private int  id;
	
	/** 问卷名称 */
	private String surveyName;
	
	/** 问卷备注 */
	private String surveyComments;
	
	/** 创建时间 */
	private Date createTime;
	
	/** 修改时间 */
	private Date updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public String getSurveyComments() {
		return surveyComments;
	}

	public void setSurveyComments(String surveyComments) {
		this.surveyComments = surveyComments;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	

}
