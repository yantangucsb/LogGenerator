package model;

import java.util.Map;

public class LogRecord {
	public long lsn;
	public long wid;
	public long islsn;
	public String actiName;
	public Map<String, String> attRead;
	public Map<String, String> attWrite;
	
	public LogRecord(){
		
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(lsn);
		sb.append(' ');
		sb.append(wid);
		sb.append(' ');
		sb.append(islsn);
		sb.append(' ');
		sb.append(actiName);
		sb.append(' ');
		for(Map.Entry<String, String> pair: attRead.entrySet()){
			sb.append(pair.getKey());
			sb.append('=');
			sb.append(pair.getValue());
			sb.append(' ');
		}
		sb.append("# ");
		for(Map.Entry<String, String> pair: attWrite.entrySet()){
			sb.append(pair.getKey());
			sb.append('=');
			sb.append(pair.getValue());
			sb.append(' ');
		}
		
		sb.deleteCharAt(sb.length()-1);
		sb.append('\n');
		return sb.toString();
	}
}
