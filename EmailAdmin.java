//Author Name: Kylie Fauquher
//Date: 03/2022

package emailadmin;

import java.util.Scanner;

public class EmailAdmin {
    private String firstName;
    private String lastName;
    private String password;
    private String dept;
    private int mailbox = 100;
    private String altEmail;
    private int defaultPasswordLength = 8;
    private String email;
    private String companyEmail = "eyebeem.com";
    private String phonenumber;
    private String confirm;
         
    //Recieve first and last name.
    public EmailAdmin(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New Employee: " + this.firstName + " " + this.lastName);     
        this.dept = setDept();
        this.password = randomPassword(defaultPasswordLength);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dept.toLowerCase() + "." + companyEmail;
    }
    //Asks for department and user enters department.
    private String setDept() {
        System.out.print("Welcome to EyeBeeM " + firstName + " " + lastName + "! Please enter your department number and we will generate the information you need to get started today: \n1 Sales\n2 Development\n3 Accounting\n0 None\n>>> ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if(deptChoice == 1) {
            return "Sales";
        }
        else if(deptChoice == 2) {
            return "Development";
        }
        else if(deptChoice == 3) {
            return "Accounting";
        }
        else
        {return " ";
        }
    }

    // Generate random password.
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@$%*";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);        
        }
        return new String(password);
    }
    //Set mailbox capacity.
    public void setMailBoxCapacity(int capacity) {
        this.mailbox = capacity;
    }
    //Set alternative email.
    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }
    //Change password.
    public void changePassword(String password) {
        this.password = password;
    }
    //Sey phone number
    public void setPhoneNumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public int getBoxCap(){
        return mailbox;
    }
    public String getAltEmail(){
        return altEmail;
    }
     public String getPassword(){
        return password;
     }
     public String getPhoneNumber(){
        return phonenumber;
     }
    //What showInfo returns
     public String showInfo() {
        System.out.print("\n" + "Display Name: " + firstName + " " + lastName + "\nDepartment: " + dept + "\nCompany Email: " + email + "\nTemporary Password: " + password + "\nMailbox Capacity: " + mailbox + "mb" + "\n" + "\nPersonal Email: " + altEmail + "\nPhone number: " + phonenumber);
        return null;
     }
     
    //Asks user if information is correct, responds pending on choice.
      String setConfirm() {
         System.out.print("\nDoes this information look correct to you? " + "\n1 Yes" + "\n2 No" + "\n>>> ");
         Scanner in = new Scanner(System.in);
        int confirmChoice = in.nextInt();
        if(confirmChoice == 1) {
            return "\nWe hope you enjoy your first day, welcome aboard!";
        }
        else if(confirmChoice == 2) {
        return "\nPlease contact HR at 555-555-5555 if anything looks amiss. Enjoy your first day and welcome aboard!";
        }
        else
        {
        return " ";
        }
    }
}


        
    
    
    

