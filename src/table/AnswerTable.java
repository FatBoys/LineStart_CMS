package table;

import java.sql.Connection;

import javabean.Answer;
import table.inc.DBTable;

/**
 * 答卷表
 * @author xmwang
 *
 */
public class AnswerTable extends DBTable  {
	
	public static int insertAnswer(Connection conn, Answer answer) throws Exception {
		Object[] args = new Object[3];		
		args[PARAM_SQL] = "insert into answer(answer_id,question_id,survey_id,answer_content,create_time,modify_time) values(?,?,?,?,now(),now())";
		args[PARAM_ERROR] = "AnswerTable===============insertAnswer has error";

		Object[] params = new Object[10];
		params[0] = answer.getId();
		params[1] = answer.getQuestionId();
		params[2] = answer.getSurveyId();
		params[3] = answer.getContent();
		
		args[PARAM_ARGS] = params;
		return insertTranscation(conn,args);
}

}
