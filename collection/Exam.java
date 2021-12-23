package collection;

public class Exam {
	private String name;
	private Integer score;
	
	public Exam() {
		
	}
	
	public Exam(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Exam [name=" + name + ", score=" + score + "]";
	}
	
	
	
}
