package model;

import java.util.ArrayList;
import java.util.List;

public class Log {
	public static Log log = null;
	public List<LogRecord> records;
	int lsn;
	
	public Log(){
		records = new ArrayList<LogRecord>();
		lsn=0;
	}
	
}
