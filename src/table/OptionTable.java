package table;

import java.sql.Connection;

import javabean.Option;
import table.inc.DBTable;

public class OptionTable extends DBTable {
	
	public static int insertOption(Connection conn, Option option) throws Exception {
		Object[] args = new Object[3];		
		args[PARAM_SQL] = "insert into option(option_id,question_id,option_order,option_content,create_time,modify_time) values(?,?,?,?,now(),now())";
		args[PARAM_ERROR] = "OptionTable===============insertOption has error";

		Object[] params = new Object[10];
		params[0] = option.getId();
		params[1] = option.getQuestionId();
		params[2] = option.getOptionOrder();
		params[3] = option.getContent();
		
		args[PARAM_ARGS] = params;
		return insertTranscation(conn,args);
}

}
