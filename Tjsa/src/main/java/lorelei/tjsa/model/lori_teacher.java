package lorelei.tjsa.model;

public class lori_teacher {
	private Integer teacherno;

	private String teachername;

	public Integer getTeacherno() {
		return teacherno;
	}

	public void setTeacherno(Integer teacherno) {
		this.teacherno = teacherno;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername == null ? null : teachername.trim();
	}
}