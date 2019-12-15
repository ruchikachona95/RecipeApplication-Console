package potluck.domain;

import util.Input;

public class Ingredient extends Recipe {

	private int ingredientID;
	private String ingredientName;
	private String measurement;

	public Ingredient(){
		super();
		ingredientID = 01;
		ingredientName = "";
		measurement = "";
	}

	// MUTATOR METHODS
	public void setIngredientID(int ingredientID) { this.ingredientID = ingredientID; }
	public void setIngredientName(String ingredientName) { this.ingredientName = ingredientName; }
	public void setMeasurement(String measurement) { this.measurement = measurement; }

	// ACCESSOR METHODS
	public int getIngredientID() { return ingredientID; }
	public String getIngredientName() { return ingredientName; }
	public String getMeasurement() { return measurement; }

	public void inputAllFields(){
		super.inputAllFields();
		ingredientName = Input.instance.getString("Ingredient: ");
		measurement = Input.instance.getString("Measurement: ");
	}

	@Override
	public String toString(){ return String.format("%s\nIngredients:%s %s\n", super.toString(), measurement, ingredientName); }	
}