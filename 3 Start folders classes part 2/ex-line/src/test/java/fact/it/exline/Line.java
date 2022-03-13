package fact.it.exline;

public class Line {
	
	int thickness;
	

	int beginningX;
	int beginningY;
	int endX;
	int endY;
	
	public Line() {
		this.thickness = 1;
	};
	
	
	public void makeThinner() {
		this.thickness--;
	};
	
	public void makeThicker() {
		this.thickness++;
	};
	
	public String showCharacteristics() {
		return String.format("Line starts at (%d,%d), line ends at (%d,%d) and the thickness is: %d", beginningX, beginningY, endX, endY, thickness);
	};
	
	//auto-generated getters and setters	
	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	public int getBeginningX() {
		return beginningX;
	}

	public void setBeginningX(int beginningX) {
		this.beginningX = beginningX;
	}

	public int getBeginningY() {
		return beginningY;
	}

	public void setBeginningY(int beginningY) {
		this.beginningY = beginningY;
	}

	public int getEndX() {
		return endX;
	}

	public void setEndX(int endX) {
		this.endX = endX;
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		this.endY = endY;
	}

}
