package com.excript.aula054;

public class Aula054 {

	public static void main(String[] args) {
		
		int[][] nums = new int[2][9];
		
		nums[0][0] = 1;
		nums[0][1] = 2;
		nums[0][2] = 3;
		nums[0][3] = 4;
		nums[0][4] = 5;
		nums[0][5] = 6;
		nums[0][6] = 7;
		nums[0][7] = 8;
		nums[0][8] = 9;
//		
//		System.out.println(nums[0][0]);
//		System.out.println(nums[1][0]);
//		
//		System.out.println(nums[0].length);
		
		for(int x = 0; x < nums[0].length; x++) {
			
			for(int y = 0; y <nums.length; y++) {
				System.out.println(nums[x][y]);
			}
			
			
		}
		
	}

}
