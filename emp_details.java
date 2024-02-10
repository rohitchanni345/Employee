import java.util.Scanner;
public class emp_details
{
     void emp_info()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String emp_name = s.nextLine();
        System.out.println("Enter deptartment id:");
        int dept_id = s.nextInt();
        System.out.println("Enter the date of joining:");
        int date_of_joining = s.nextInt();
        System.out.println("Name : "+emp_name);
        System.out.println("Date of Joining : "+date_of_joining);
        System.out.print("Department ID : "+dept_id);

    }
}