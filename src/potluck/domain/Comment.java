package potluck.domain;

import java.util.Date;

import util.Input;

public class Comment extends Recipe {

	private String comment;
	private int rating;
	private Date date;
	
	public Comment() {
		comment = "";
		rating = 0;
		date = null;
	}

	@Override
	public void inputAllFields() {
		comment = Input.instance.getString("Comment: ");
		while (rating < 1 || rating > 5) {
			rating = Input.instance.getInt("Rating (1-5): "); 
		}
		date = new Date();
	}

	// MUTATOR METHODS
	public void setComment(String comment) { this.comment = comment; }
	public void setRating(int rating) { this.rating = rating; }

	// ACCESSOR METHODS 
	public int getRating() { return rating; }
	public String getComment() { return comment; }

	@Override
	public String toString() {
		return String.format("Comment: %s\nRating: %d\nDate: (%s)\n", comment, rating, date);
	}
}