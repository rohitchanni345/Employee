import java.util.Scanner;
public class dept_details extends emp_details
{
    void dept_info()
    {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter the Department ID : ");
        int dept_id = sc.nextInt();
        System.out.println("Enter the Department Name : ");
        String dept_name = sc.nextLine();*/
        int dept_id = sc.nextInt();
        //System.out.print("Department ID : "+dept_id);
        if(dept_id == 1)
        {
             System.out.println("MCA department");
        }
        else if(dept_id == 2)
        {
            System.out.println("Civil department");
        }
        else if(dept_id ==3)
        {
            System.out.println("ECE department");
        }
        else
        {
            System.out.println("invalid department id");
        }  
    }
    public static void main(String[] args)
    {
        dept_details d = new dept_details();
        d.emp_info();
        d.dept_info();
    }
}