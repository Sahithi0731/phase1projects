import java.util.regex.*;    
import java.util.*;    
public class Email{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("sahithi@domain.co.in");  
        emails.add("sahithi@domain.com");  
        emails.add("sahithi.name@domain.com");  
        emails.add("sahithi#@domain.co.in");  
        emails.add("sahithi@domain.com");  
        emails.add("sahithi@domaincom");  
        //Add invalid emails in list  
        emails.add("@yahoo.com");  
        emails.add("sahithi#.com");  
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  