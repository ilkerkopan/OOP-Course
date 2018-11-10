package tr.edu.iku.oop.lesson2;

import java.util.Scanner;

public class RailRoadOptimization {

	public static void main(String[] args) {
		final int L_SIZE_RAIL = 100;
		final int M_SIZE_RAIL = 30;
		final int S_SIZE_RAIL = 10;

		int railRoadLength = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input rail road length:");
		railRoadLength = scanner.nextInt();
		System.out.println("input rail road length is "+railRoadLength);
		
		int lSizeRailCount = railRoadLength / L_SIZE_RAIL;
		System.out.println("needed L size rail count is:"+ lSizeRailCount);
		
		int lSizeRemainder = railRoadLength % L_SIZE_RAIL;
		int mSizeRailCount = lSizeRemainder / M_SIZE_RAIL;
		System.out.println("needed M size rail count is:"+ mSizeRailCount);
		
		int mSizeRemainder = lSizeRemainder % M_SIZE_RAIL;
		int sSizeRailCount = mSizeRemainder / S_SIZE_RAIL;
		System.out.println("needed S size rail count is:"+ sSizeRailCount);
	}

}
