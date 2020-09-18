package org.cts;

public class BasicArray {
	public static void main(String[] args) {
int a[][]=new int[4][6];
a[0][0]=10;
a[0][1]=20;
a[0][2]=30;
a[0][3]=40;
a[0][4]=50;
a[0][5]=60;

a[1][0]=70;
a[1][1]=80;
a[1][2]=90;
a[1][3]=100;
a[1][4]=110;
a[1][5]=120;

a[2][0]=130;
a[2][1]=140;
a[2][2]=150;
a[2][3]=160;
a[2][4]=170;
a[2][5]=180;

a[3][0]=190;
a[3][1]=200;
a[3][2]=210;
a[3][3]=220;
a[3][4]=230;
a[3][5]=240;

for (int i=0; i<4; i++) {
	for (int j=0; j<6; j++) {
		System.out.println(a[i][j]+ " ");
	}
}
	}
	}
