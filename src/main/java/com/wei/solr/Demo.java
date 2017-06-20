package com.wei.solr;

public class Demo {

	/**
	 * �ж���Բ�Ƿ���ײ��˼·���ж�����Բ��֮��ľ����Ƿ���������뾶�ĺ�
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
		//������֮��ľ���
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		//�����뾶�ĺ�
		int r = r1 + r2;
		if(distance <= r){
			b = true;
		}
		return b;
	}
	
	/**
	 * �������������⡾쳲���Ш���У�f(n) = f(n-1) + f(n-2)�� �����ǵݹ�
	 * @param month �ڼ���
	 * @return
	 */
	public int sum(int month){
		if(month > 2){
			return sum(month - 1) + sum(month - 2);
		}
		return 2;
	}
}
