package javabean;

import java.util.Date;
/**
 * 问题
 * @author xmwang
 *
 */
public class Question {
	
	private int id;
	
	/** 问卷id */
	private int surveyId;
	
	/** 问题顺序 */
	private String questionOrder;
	
	/** 问题名称 */
	private String name;
	
	/** 问题类型 */
	private String questionType;
	
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

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getQuestionOrder() {
		return questionOrder;
	}

	public void setQuestionOrder(String questionOrder) {
		this.questionOrder = questionOrder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
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
