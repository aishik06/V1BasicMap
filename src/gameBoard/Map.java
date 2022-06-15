package gameBoard;

public class Map {
	int X, Y, currentX, currentY; 
	
	Map(int X, int Y){
		this.X = X;
		this.Y = Y;
	}
	
	public void move(String direction) {
		if(direction == "N") {
			checkValidity("N");
			moveCurrentY(1);
		}
		else if (direction == "S") {
			moveCurrentY(-1);
		}
		else if (direction == "E") {
			moveCurrentX(1);
		}
		else if (direction == "W") {
			moveCurrentX(-1);
		}
		else {
			System.out.println("invalid direction");
		}
	
	}
	
	public void checkValidity(String direction) {
		if(direction=="N") {
			if(currentY == Y) {
				setCurrentY(0);
			}
		}
		else if(direction == "S") {
			if(currentY == 0) {
				setCurrentY(Y);
			}
		}
		else if(direction == "E") {
			if(currentX == X) {
				setCurrentX(0);
			}
		}
		else if(direction == "W") {
			if(currentX == 0) {
				setCurrentX(X);
			}
		}
	}
	
	public int getCurrentX() {
		return currentX;
	}
	
	public int getCurrentY() {
		return currentY;
	}
	
	public void setCurrentX(int value) {
		currentX = value;
	}
	
	public void setCurrentY(int value) {
		currentY = value; 
	}
	
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	
	public void moveCurrentX(int value) {
		currentX = currentX + value;
	}
	public void moveCurrentY(int value) {
		currentY = currentY + value;
	}
	
	public void showPosition() {
		System.out.println("Your current position is: [" + currentX + ", " + currentY + "]");
	}
	
}
