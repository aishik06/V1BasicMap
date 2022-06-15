package gameBoard;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character ash = new Character();
		Map map = new Map(20, 20);
		boolean game = true;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(game == true) {
			System.out.println("select your move: ");
			String direction = sc.nextLine();
			map.move(direction);
			map.showPosition();
			count+=1;
			if(count >= 5) {
				game = false;
			}
		}
	}

}
