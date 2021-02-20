package day3;

public class SmallestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int marks[]= {67,89,56,40,30,90};
        int small=marks[0];
        for(int i=0;i<marks.length;i++)
        {
        	//if(small<marks[i]) for finding biggest number
        	if(small>marks[i])    //67>89  67>56 56>40  40>30 30>90
        		small=marks[i];
        }
        System.out.println(small);
	}

}
