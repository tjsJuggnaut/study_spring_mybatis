package lorelei.tjsa.model;

public class lori_student {
	private Integer stuno;

	private String sname;

	private Integer sage;

	private String ssex;

	public Integer getStuno() {
		return stuno;
	}

	public void setStuno(Integer stuno) {
		this.stuno = stuno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname == null ? null : sname.trim();
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex == null ? null : ssex.trim();
	}
}