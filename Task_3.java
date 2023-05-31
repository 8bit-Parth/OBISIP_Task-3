//Task 3: ATM Interface
import java.util.*;
class Task_3{

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> list = new ArrayList<>();
    static int t_amount = 20000;
    static String other_user = "Parth";

    public static void activity(){

        System.out.println("You have "+t_amount+"$ ");
        System.out.println("1. Transection History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer to other user");
        System.out.println("5. Exit");
        int input = sc.nextInt();

        switch(input){
            case 1  : transection_hist();
            break;
            case 2  : withdraw();
            break;
            case 3  : deposit();
            break;
            case 4  : transfer();
            break;
            case 5  : System.out.println("Thank you, Have a nice day!!"); 
            return;

            default : System.out.println("Please Enter Valid Choice");
            break;
        }
    }

    //Shows Transection History
    public static void transection_hist(){
        System.out.println();

        if(list.size() == 0 ) {
            System.out.println("No Transection Occured yet");
            System.out.println();
            activity();
            return;
        }else{
            System.out.println("****Your Transection History****");
            for(int i = 0 ; i < list.size() ; i++){
                System.out.println(list.get(i));
            }
            System.out.println();
            activity();
            return;
        }
    }

    //For withdraw money
    public static void withdraw(){
        System.out.println();

        System.out.print("Enter the amount you want to Withdraw: ");
        int withd = sc.nextInt();
        t_amount -= withd;
        System.out.println(withd+ "$ Withdrawed " + t_amount + "$ left in account");
        list.add("---> "+withd+ "$ Withdrawed " + t_amount + "$ left in account");
        activity();
        return;
    }
    
    // For deposit money
    public static void deposit(){
        System.out.println();

        System.out.print("Enter the amount You Want to Deposit : ");
        int depo = sc.nextInt();
        t_amount += depo;
        System.out.println(depo+ "$ Deposit " + t_amount + "$ left in your account");
        list.add("---> "+depo+ "$ Deposit " + t_amount + "$ left in your account");
        activity();
        return;
    }

    //For transfer Money
    public static void transfer(){
        System.out.println();

        
        System.out.println("Enter amount you want to tranfer: ");
        int amt = sc.nextInt();
        t_amount -= amt;
        System.out.println(amt+"$ Has been Transfered To "+ other_user + " account, Total amount Left : "+t_amount);
        list.add("---> "+amt+"$ Has been Transfered To "+ other_user + " account, Total amount Left : "+t_amount);
        activity();
        return;
    }

    public static void main(String[] args) {
        
        int count = 0;
        String userId = "PR03";
        int pin = 1384;
        System.out.print("Enter User ID : ");
        String id = sc.nextLine();
        while(true){
            if(count == 3){
                System.out.println("To many failed attempts! sorry try again in some time..");
                break;
            }
            if(id.equals(userId)){
                System.out.print("Enter Your Pin : ");
                int p = sc.nextInt();
                if(p == pin){
                    System.out.println();
                    System.out.println("Wlecome To ATM");
                    System.out.println();
                    activity();
                    break;
                }else{
                    count++;
                    System.out.println("Wrong pin! sorry try again...");
                }
            }else{
                count++;
                System.out.print("Wrong User Id ! Try again...");
                System.out.print("\nEnter User ID : ");
                id = sc.nextLine();
            }
        }
    }
}
 