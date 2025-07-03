package lib;
import java.lang.*;


public class PasswordValidator {

    /**
     * @param password in string form user.
     * @return PasswordStrength describe how strong password form user is.
     */
    
     public static PasswordStrength validate(String password) { 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
         
        int minLength = 8; 
        PasswordStrength strength = null;
        int count = 0;

        
        for(int i = 0 ; i < password.length() ; i++){
            if(Character.isDigit(password.charAt(i)))
            count++;
        }



         if( password.length() < minLength )
         strength = PasswordStrength.INVALID;
        
         if(password.length() >= minLength)
         strength = PasswordStrength.WEAK;

         if(password.matches(".*[A-Z].*"))
         strength = PasswordStrength.MEDIUM;
         
         if(password.matches(".*[a-z].*"))
         strength = PasswordStrength.MEDIUM;

         if(password.matches(".*[A-Z].*") && password.matches(".*[a-z].*"))
         strength = PasswordStrength.STRONG;

         if(password.matches(".*[A-Z].*") && password.matches(".*[a-z].*"))
         strength = PasswordStrength.STRONG;

         if((password.matches(".*[A-Z].*") || password.matches(".*[a-z].*")) && (password.matches(".*\\W.*")))
         strength = PasswordStrength.STRONG;

         if(count < 8)
         strength = PasswordStrength.INVALID;

         if(password.matches(".*\s.*"))
         strength = PasswordStrength.INVALID;

         if(password == null)
         strength = PasswordStrength.INVALID;
         
         
          return strength ;
    }
}