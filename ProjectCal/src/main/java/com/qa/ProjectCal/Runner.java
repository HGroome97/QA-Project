package com.qa.ProjectCal;

public class Runner {

	public static void main(String[] args) {
//		calcPrint(4,2,8);
		extraCalcPrint(1,3,6,10);

	}
	public static void calcPrint(int num1, int num2, int num3) {
		int i = 0;
		int temp = 0;
		while(i<3) {
			if(num1+num2==num3) {
				System.out.println(num1+" + "+num2+" = "+num3); 
				System.out.println(num2+" + "+num1+" = "+num3);
			}
			if(num1*num2==num3) {
				System.out.println(num1+" * "+num2+" = "+num3); 
				System.out.println(num2+" * "+num1+" = "+num3);
			}
			if(num1/num2==num3) System.out.println(num1+" / "+num2+" = "+num3);
			if(num2/num1==num3) System.out.println(num2+" / "+num1+" = "+num3);
			if(num1-num2==num3) System.out.println(num1+" - "+num2+" = "+num3);
			if(num2-num1==num3) System.out.println(num2+" - "+num1+" = "+num3);
			
			temp = num1;
			num1=num2;
			num2=num3;
			num3=temp;
			i++;
			}
			
	}
	public static void extraCalcPrint(int num1, int num2, int num3, int num4) {
		int i = 0;
		int temp = 0;
		calcPrint(num1, num2, num3);
		calcPrint(num1,num2,num4);
		calcPrint(num2, num3, num4);
		i = 0 ;
		while(i<4) {
			calcPrint(num1+num2, num3, num4);
			calcPrint(num1-num2, num3, num4);
			calcPrint(num1*num2, num3, num4);
			calcPrint(num1/num2, num3, num4);
			
			calcPrint(num1+num3, num2, num4);
			calcPrint(num1-num3, num2, num4);
			calcPrint(num1*num3, num2, num4);
			calcPrint(num1/num3, num2, num4);
			
			calcPrint(num1+num4, num3, num2);
			calcPrint(num1-num4, num3, num2);
			calcPrint(num1*num4, num3, num2);
			calcPrint(num1/num4, num3, num2);
			
			calcPrint(num3+num2, num1, num4);
			calcPrint(num3-num2, num1, num4);
			calcPrint(num3*num2, num1, num4);
			calcPrint(num3/num2, num1, num4);
			
			calcPrint(num4+num2, num3, num1);
			calcPrint(num4-num2, num3, num1);
			calcPrint(num4*num2, num3, num1);
			calcPrint(num4/num2, num3, num1);
			
			calcPrint(num3+num4, num1, num2);
			calcPrint(num3-num4, num1, num2);
			calcPrint(num3*num4, num1, num2);
			calcPrint(num3/num4, num1, num2);
			
			temp = num1;
			num1=num2;
			num2=num3;
			num3=num4;
			num4=temp;
			i++;
			}
		
		i = 0;
		temp = 0;
		while(i<4) {
			
			if(num1+num2+num3==num4) System.out.println(num1+" + "+num2+" + "+num3+" = "+num4);
			if(num1+num2*num3==num4) System.out.println(num1+" + "+num2+" * "+num3+" = "+num4);
			if(num1+num2/num3==num4) System.out.println(num1+" + "+num2+" / "+num3+" = "+num4);
			if(num1+num2-num3==num4) System.out.println(num1+" + "+num2+" - "+num3+" = "+num4);
			
			if(num1*num2+num3==num4) System.out.println(num1+" * "+num2+" + "+num3+" = "+num4);
			if(num1*num2*num3==num4) System.out.println(num1+" * "+num2+" * "+num3+" = "+num4);
			if(num1*num2/num3==num4) System.out.println(num1+" * "+num2+" / "+num3+" = "+num4);
			if(num1*num2-num3==num4) System.out.println(num1+" * "+num2+" - "+num3+" = "+num4);
			
			if(num1-num2+num3==num4) System.out.println(num1+" - "+num2+" + "+num3+" = "+num4);
			if(num1-num2*num3==num4) System.out.println(num1+" - "+num2+" * "+num3+" = "+num4);
			if(num1-num2/num3==num4) System.out.println(num1+" - "+num2+" / "+num3+" = "+num4);
			if(num1-num2-num3==num4) System.out.println(num1+" - "+num2+" - "+num3+" = "+num4);
			
			if(num1/num2+num3==num4) System.out.println(num1+" / "+num2+" + "+num3+" = "+num4);
			if(num1/num2*num3==num4) System.out.println(num1+" / "+num2+" * "+num3+" = "+num4);
			if(num1/num2/num3==num4) System.out.println(num1+" / "+num2+" / "+num3+" = "+num4);
			if(num1/num2-num3==num4) System.out.println(num1+" / "+num2+" - "+num3+" = "+num4);
			
			temp = num1;
			num1=num2;
			num2=num3;
			num3=num4;
			num4=temp;
			i++;
		}
	}
}

