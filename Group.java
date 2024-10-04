public class Group {

	private String[] students = {
		"GADEU MONTHE VINETTE MARCY", "COELHO FERNANDES RODRIGO CESAR"
	};

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Le groupe est constitué de :\n");
		boolean notFirst = false;
		for (String student: students) {
			if (notFirst) {
				sb.append("\n");
			} else {
				notFirst = true;
			}
			sb.append(student);
		}
		return sb.toString();
	}

}
