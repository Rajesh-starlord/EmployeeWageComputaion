import java.util.*;
//UC-2 daily wage

class EmpWageComputationUc2{
   public static void main(String[] args)throws Exception{
      int wage_per_hr=20;
      int full_day_hr=8;
      System.out.println("Welcome to Employee wage computation program");
      double attCheck=Math.random();
      if(attCheck>0.5){
         System.out.println("Employee is present");
         System.out.println("daily_wage="+(wage_per_hr*full_day_hr))";
      }else{
         System.out.println("Employee is absent");
         System.out.println("daily_wage="+(wage_per_hr*0))";
      }
   }
}
