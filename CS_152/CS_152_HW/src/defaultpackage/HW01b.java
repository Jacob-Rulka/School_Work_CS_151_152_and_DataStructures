 package defaultpackage;



public class HW01b {
	
	
	private double[] practiceOverloadedMethod(double slope1, double slope2, double height1, double height2) { // Part A
		double [] point = {0,0};
		double SlopeM, HeightM;
		
		if (slope1 == slope2) {
			point[0] = -999;
			point[1] = -999;
		}
		else {
			SlopeM = slope1 - slope2;
			HeightM = height2 - height1;
			point[0] = HeightM / SlopeM;
			point[1] = (slope1 * point[0]) + height1;
		}
			
		return point;
	}
	
	private double practiceOverloadedMethod(double radius) { // Part B
		double Ar;
		Ar = (Math.PI * (Math.pow(radius, 2)));							
		
		return Ar;
	}
	
	private double practiceOverloadedMethod (String s) { // Part C, String s = "num operation num"
		String[] split = s.split(" ");
		
		String firstNum = split[0];
		String operation = split[1];
		String secondNum = split[2];
		
		double fNum = Double.valueOf(firstNum);
		double sNum = Double.valueOf(secondNum);
		
		if (operation.equals("plus")) {
			return fNum + sNum;
		}
		if (operation.equals("minus")) {
			return fNum - sNum;
		}
		return 0;
	}

	
	public static void main(String[] args) { // given code
		   HW01b obj = new HW01b();
		   
		   double[] result1 = obj.practiceOverloadedMethod(1.5, 3.9, 2.4, 6.3);
		   double result2 = obj.practiceOverloadedMethod(2.5);
		   double result3 = obj.practiceOverloadedMethod("2 plus 5");
		   double result4 = obj.practiceOverloadedMethod("23 minus 19");		
		   
		  
		   if(result1[0]==result1[1] && result1[0]==-999) {
			 System.out.println("The two lines are parallel");
		   }
		   else {
			 System.out.println("The result is: "+String.format("%,.2f" ,result1[0])+","+String.format("%,.2f",result1[1]));
		   }
		   System.out.println("The result is:"+String.format("%,.2f", result2));
		   System.out.println("The result is:"+String.format("%, .2f",result3));
		   System.out.println("The result is:"+String.format("%, .2f",result4));
			}
}
