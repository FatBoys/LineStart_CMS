package table;

import java.sql.Connection;

import javabean.Question;
import table.inc.DBTable;

public class QuestionTable extends DBTable  {

	public static int insertQuestion(Connection conn, Question question) throws Exception {
		Object[] args = new Object[3];		
		args[PARAM_SQL] = "insert into question(question_id,survey_id,question_order,question_name,question_type,create_time,modify_time) values(?,?,?,?,?,now(),now())";
		args[PARAM_ERROR] = "QuestionTable===============insertQuestion has error";

		Object[] params = new Object[10];
		params[0] = question.getId();
		params[1] = question.getSurveyId();
		params[2] = question.getQuestionOrder();
		params[3] = question.getName();
		params[4] = question.getQuestionType();
		
		args[PARAM_ARGS] = params;
		return insertTranscation(conn,args);
}
}
