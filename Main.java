package Library;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc=new Scanner(System.in);
        BookServiceInterface service=new BookServiceImpl();
        System.out.println("Welcome to Book Management Application");
        int num;

       

        do{
        	System.out.println("1. Admin\n"+ "2.User\n");
			num = sc.nextInt();
			if (num == 1) {
            System.out.println(
                    "1.Show All Books\n"+
                    "2.Show Available Books\n"+
                    "3.Add Book\n"+
                    "4.exit"
                    );
            System.out.println("Enter Your Choice !");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    service.showAllBooks();
                    break;
                case 2:
                    service.showAllAvailableBooks();
                    break;
                case 3:
                	service.addBook();
                    break;
                case 4:
                    System.out.println("Thank you for Using Application !!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter Valid Choice !");
            }
			}else{
				System.out.println("1.Add Book\n"+
	                    "2.Borrow Book\n"+
	                    "3.Return Book\n"+
	                    "4.exit");
				System.out.println("Enter Your Choice !");
	            int ch = sc.nextInt();

	            switch (ch){
	                case 1:
	                    service.addBook();
	                    break;
	                case 2:
	                    service.borrowBook();
	                    break;
	                case 3:
	                    service.returnBook();
	                    break;
	                case 4:
	                    System.out.println("Thank you for Using Application !!");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Please Enter Valid Choice !");
			}

            
            }
        }
        while(true);
    }
}