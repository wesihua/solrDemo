package com.wei.solr;

public class Demo {

	/**
	 * 判断两圆是否碰撞。思路是判断两个圆心之间的距离是否大于两个半径的和
	 * @param x1
	 * @param y1
	 * @param r1
	 * @param x2
	 * @param y2
	 * @param r2
	 * @return
	 */
	boolean collisWith(int x1,int y1, int r1, int x2, int y2, int r2){
		boolean b = false;
		//求两点之间的距离
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		//两个半径的和
		int r = r1 + r2;
		if(distance <= r){
			b = true;
		}
		return b;
	}
	
	/**
	 * 兔子生兔子问题【斐波那楔数列：f(n) = f(n-1) + f(n-2)】 考点是递归
	 * @param month 第几月
	 * @return
	 */
	public int sum(int month){
		if(month > 2){
			return sum(month - 1) + sum(month - 2);
		}
		return 2;
	}
}
