package javafx.application;
public class Average {
public static void main(String [] args) {
	int [] arraydata=new int[] {12,34,55,67,78,88,90,105,220};
	int sum=0;
	for(int p=0;p<arraydata.length;p++)
		sum=sum+arraydata[p];
	double ave=sum/arraydata.length;
	System.out.println("the average value is :"+ave);
				
		
}


}