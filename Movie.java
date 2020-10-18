// --== CS400 File Header Information ==--
// Name: Christian Visaya
// Email: visaya@wisc.edu
// Team: AD
// TA: Sophie Stephenson
// Lecturer: Florian Heimerl
// Notes to Grader: <optional extra notes>

public class Movie implements Comparable<Movie>{
	private String title;
	private String director;
	private String genre;
	private int runtime;
	private String[] actors;
	private int year;
	private double ratings;
	
	public Movie() {
		this.title = "";
		this.director = "";
		this.genre = "";
		this.runtime = 0;
		this.actors = new String[0];
		this.year = 0;
		this.ratings = 0;
	}
	
	public Movie(String title, String director, String genre, int runtime, String[] actors, int year, double rating) {
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runtime = runtime;
		this.actors = actors;
		this.year = year;
		this.ratings = ratings;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDirector() {
		return director;
	}

	public String getGenre() {
		return genre;
	}

	public int getRuntime() {
		return runtime;
	}

	public String getActors() {
		String output = "[";
		for(int i = 0; i < actors.length - 1; i++) {
			output += actors[i] + ", ";
		}
		output += actors[actors.length - 1] + "]";
		
		return output;
	}

	public int getYear() {
		return year;
	}

	public double getRatings() {
		return ratings;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return getTitle();
	}
	
	@Override
	public int compareTo(Movie o) {
		if(title.compareTo(o.getTitle())>0) {
			return 1;
		}
		if(title.compareTo(o.getTitle())<0) {
			return -1;
		}
		return 0;
	}
	
}