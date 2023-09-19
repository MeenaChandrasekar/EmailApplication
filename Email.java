package emailapp;

import java.util.Scanner;
import java.util.random.*;

public class Email {
	 private String FirstName;
	 private String LastName;
	 private String Password;
	 private String department;
	 private String email;
	 private int mailboxCapacity=500;
	 private int defaultPasswordLength= 10;
	 private String alternateEmail;
	 private String companySuffix="Samsungcompany.com";
	 
	 //Constructor to receive first name and last name 
	 public Email(String FirstName,String LastName) {
		 this.FirstName=FirstName;
		 this.LastName=LastName;
         // System.out.println("EMAIL CREATED:" +this.FirstName+" "+this.LastName);
	
		 //call a method asking for the department and return the department
		 this.department=setDepartment();
		// System.out.println("Department:" +this.department);
		 
		 // call a method to return random password
		 this.Password= randomPassword(defaultPasswordLength);		 
		 System.out.println("Your Password is:" + this.Password);
		 
		 // combine elements to generate email
		 email =FirstName.toLowerCase()+"."+ LastName.toLowerCase()+"@" + department+"."+companySuffix;
		 //System.out.println("Your email is:" + email); 
		 
	 }
	

	// Ask for department
	 private String setDepartment() {
		System.out.println("New worker:" +FirstName+".Department Codes:\n1 for sales\n2 Development\n3 for Accounting\n0 for none\nEnter Dept code: ");
		Scanner in=new Scanner(System.in);
		int deptChoice=in.nextInt();
		if(deptChoice==1) { return "sales";}
		else if(deptChoice==2) { return "dev";}
		else if(deptChoice==3) { return "Acct";}
		else {return " ";}
		
	 }
	 //Generate the random password
	 
	 private String randomPassword(int length) {
		 String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		 char[] password=new char[length];
		 for(int i=0;i<length;i++) {
			 int rand=(int)(Math.random()* passwordSet.length());
			 password[i]=passwordSet.charAt(rand);
		 }
		 return new String(password);
}

	 // generate the mail box capacity
	 public void setMailboxCapacity(int Capacity) {
		 this.mailboxCapacity=Capacity;
	 }	
	 // set the alternate email
	 public void setAlternateEmail(String altEmail) {
		 this.alternateEmail=altEmail;
}
	 // change the password
	public void changePassword(String password) {
		this.changePassword(password);
	}
    public int getMailboxCapacity(){ return mailboxCapacity;}
    public String getAlternateEmail() { return alternateEmail;}
    public String getPassword() { return Password;}
 
    public String showInfo() {
    	return "DIASPLAY NAME:" + FirstName+" "+LastName+"\nCOMPANY EMAIL:"+email+
    			"\nMAILBOX CAPACITY:"+mailboxCapacity+"mb";
    			
    }
    
 }
