package lorelei.tjsa.model;

public class lori_course {
	private Integer courseno;

	private String cname;

	private Integer teacherno;

	public Integer getcourseno() {
		return courseno;
	}

	public void setcourseno(Integer courseno) {
		this.courseno = courseno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname == null ? null : cname.trim();
	}

	public Integer getTeacherno() {
		return teacherno;
	}

	public void setTeacherno(Integer teacherno) {
		this.teacherno = teacherno;
	}
}