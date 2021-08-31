package codes;

public class LectureData {

	String title;
	String startDate;
	String endDate;
	int maxPeopleCount;
	String campusName;
	String teacherName;

	public LectureData(String title, String startDate, String endDate, int maxPeopleCount, String campusName,
			String teacherName) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.maxPeopleCount = maxPeopleCount;
		this.campusName = campusName;
		this.teacherName = teacherName;
	}
	
}
