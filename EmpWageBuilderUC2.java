public class EmpWageBuilderUC2{

        public static void main(String args[]){	
	int IS_FULL_TIME = 1;
	int EMP_RATE_PER_HOUR = 20;

        double empCheck = Math.floor(Math.random() * 10) % 2;
	int empHours = 0;
	int empWage = 0;

        if (empCheck == IS_FULL_TIME)
                empHours = 8;
	else 
               empHours = 4;
	empWage = empHours * EMP_RATE_PER_HOUR;
	System.out.println("Emp wage:" + empWage);
     }

}