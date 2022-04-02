package emailadmin;


public class EmailApp {
    
    public static void main(String[]args) {
        EmailAdmin eAdmin = new EmailAdmin("John", "Smith");
        eAdmin.setAltEmail("john.smith@hotmail.com");
        eAdmin.setPhoneNumber("888-888-8888");
        
        System.out.println(eAdmin.showInfo());
        System.out.println(eAdmin.setConfirm());
        
    }
    
}
