import java.util.Scanner;

public class SalarySystem {
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.println("Employee ID : ");
       int id = sc.nextInt();
       System.out.println("Employee Name : ");
       String name= sc.next();
       System.out.println("Month : ");
       int month = sc.nextInt();
       switch (month){
           case 1:
               System.out.println("Jan");
           case 2:
               System.out.println("Feb");
           case 3:
               System.out.println("March");
           case 4:
               System.out.println("April");
           case 5:
               System.out.println("May");
           case 6:
               System.out.println("June");
           case 7:
               System.out.println("July");
           case 8:
               System.out.println("Aug");
           case 9:
               System.out.println("Sept");
           case 10:
               System.out.println("Oct");
           case 11:
               System.out.println("Nov");
           case 12:
               System.out.println("Dec");
           break;
       }
       System.out.println("Year : ");
       int year = sc.nextInt();
       if(year % 4 == 0)
       {
           System.out.println("It's a leap year");
       }
       else
       {
           System.out.println("Not a leap year");
       }

       System.out.println("Working Days");
       int w_days = sc.nextInt();
       System.out.println("Number of leaves : ");
       int leaves = sc.nextInt();
       System.out.println("Conveyence Allowance(%) : ");
       float c_Allowance = sc.nextFloat();
       System.out.println("Medical Allowance(%) : ");
       float m_Allowance = sc.nextFloat();
       System.out.println("Other Allowances(%) : ");
       float o_Allowance = sc.nextFloat();
       System.out.println("Base Salary : ");
       float b_sal = sc.nextFloat();
       System.out.println("Professional tax(%) : ");
       float p_tax = sc.nextFloat();

       float yearSal = b_sal*12;

        System.out.println("Paid days: "+(w_days - leaves));
        System.out.println("Base Salary: "+b_sal);
        float l_amt = (b_sal / w_days)*leaves;
        System.out.println("Leave Amount: "+l_amt);

        c_Allowance = (yearSal * c_Allowance)/100;
        System.out.println("Conveyence Allowance:" + c_Allowance);

        m_Allowance = (yearSal * m_Allowance)/100;
        System.out.println("Medical Allowance:" + m_Allowance);

        o_Allowance = (yearSal * o_Allowance)/100;
        System.out.println("Other Allowance:" + o_Allowance);

        float annualctc = (yearSal + c_Allowance + m_Allowance +o_Allowance);
        System.out.println("Annual CTC:" + annualctc);

        float t_allowance = (c_Allowance + m_Allowance + o_Allowance);
        System.out.println("Total Allowance:" + t_allowance);

        p_tax = (yearSal * p_tax/100) - (b_sal);
        System.out.println("Professional tax:" + p_tax);

        float t_deduct = (p_tax + l_amt) - (b_sal);
        System.out.println("Total Deduction:" + t_deduct);

        float t_mnthAllowance = (c_Allowance/12) +  (m_Allowance/12) + (o_Allowance/12);
        System.out.println("Total Monthly Allowance:" + t_mnthAllowance);

        System.out.println("------------------------------------");

        float netsal = (t_mnthAllowance +b_sal) - t_deduct;
        System.out.println("Net Salary:" + netsal);
    }

}