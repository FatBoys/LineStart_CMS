package table;

import java.sql.Connection;

import javabean.Survey;
import table.inc.DBTable;

public class SurveyTable extends DBTable {

	public static int insertSurvey(Connection conn, Survey survey) throws Exception {
		Object[] args = new Object[3];		
		args[PARAM_SQL] = "insert into survey(id,survey_name,survey_comments,create_time,modify_time) values(?,?,?,now(),now())";
		args[PARAM_ERROR] = "SurveyTable===============insertSurvey has error";

		Object[] params = new Object[10];
		params[0] = survey.getId();
		params[1] = survey.getSurveyName();
		params[2] = survey.getSurveyComments();
		
		args[PARAM_ARGS] = params;
		int surveyId = insertTranscation(conn,args);
		return surveyId;
	}
}
