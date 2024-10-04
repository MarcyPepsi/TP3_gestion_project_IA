public class StartDate {

	private String day = "1er";
	private String month = "janvier";
	private String year = "1970";

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Travail commencé le ");
		sb.append(day);
		sb.append(" ");
		sb.append(month);
		sb.append(" ");		
		sb.append(year);	
		return sb.toString();
	}

}
