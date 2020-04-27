import java.util.*;
<<<<<<< HEAD
//UC-1 Ckeck Attendance
class EmpWageComputationUc1{
=======
//UC-2 daily wage

class EmpWageComputationUc2{
>>>>>>> UC-2/Dailywage
   public static void main(String[] args)throws Exception{
      int wage_per_hr=20;
      int full_day_hr=8;
      System.out.println("Welcome to Employee wage computation program");
      double attCheck=Math.random();
      if(attCheck>0.5){
         System.out.println("Employee is present");
<<<<<<< HEAD
      }else{
         System.out.println("Employee is absent");
=======
         System.out.println("daily_wage="+(wage_per_hr*full_day_hr))";
      }else{
         System.out.println("Employee is absent");
         System.out.println("daily_wage="+(wage_per_hr*0))";
>>>>>>> UC-2/Dailywage
      }
   }
}
