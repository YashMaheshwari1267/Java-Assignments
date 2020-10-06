package collection.assignments;

public class MovieDetails implements Comparable<MovieDetails>{
	private String movName;
	private String leadActor;
	private String leadActress;
	private String genre;

	public MovieDetails(String movName, String leadActor, String leadActress, String genre) {
		this.genre = genre;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.movName = movName;
	}

	@Override
	public int compareTo(MovieDetails obj) {
		if (this.movName != obj.movName) {
			int x = this.movName.compareTo(obj.movName);
			if (x > 0)
				return 1;
			else if (x < 0)
				return -1;
		}
		return 0;
	}
	
	

	@Override
	public String toString() {
		return "MovieDetails [movName=" + movName + ", leadActor=" + leadActor + ", leadActress=" + leadActress
				+ ", genre=" + genre + "]";
	}

	public String getMovName() {
		return movName;
	}

	public void setMovName(String movName) {
		this.movName = movName;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
