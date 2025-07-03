package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }

        PasswordStrength result2 = PasswordValidator.validate("12345678");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: 8 Digits or more ");
        } else {
            System.out.println("Test Case 2 FAILED: Expected WEAK but got " + result2);
        }

        PasswordStrength result3 = PasswordValidator.validate("12345678A");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: Contain 8 Digits or more with Uppercase");
        } else {
            System.out.println("Test Case 3 FAILED: Expected MEDIUM but got " + result3);
        }

        PasswordStrength result4 = PasswordValidator.validate("12345678a");
        if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 Passed: Contain 8 Digits or more with Lowercase");
        } else {
            System.out.println("Test Case 4 FAILED: Expected MEDIUM but got " + result4);
        }

        PasswordStrength result5 = PasswordValidator.validate("12345678Aa");
        if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 5 Passed: Contain 8 Digits or more with Uppercase and Lowercase");
        } else {
            System.out.println("Test Case 5 FAILED: Expected STRONG but got " + result5);
        }

        PasswordStrength result6 = PasswordValidator.validate("12345678Aa@");
        if (result6 == PasswordStrength.STRONG) {
            System.out.println("Test Case 6 Passed: Contain 8 Digits or more with Uppercase and Lowercase plus Special Character");
        } else {
            System.out.println("Test Case 6 FAILED: Expected STRONG but got " + result6);
        }

        PasswordStrength result7 = PasswordValidator.validate("AAAAAAAAAA");
        if (result7 == PasswordStrength.INVALID) {
            System.out.println("Test Case 7 Passed: INVALID must contain 8 digits ");
        } else {
            System.out.println("Test Case 7 FAILED: Expected INVALID but got " + result7);
        }

        PasswordStrength result8 = PasswordValidator.validate("          ");
        if (result8 == PasswordStrength.INVALID) {
            System.out.println("Test Case 8 Passed: INVALID of blank");
        } else {
            System.out.println("Test Case 8 FAILED: Expected INVALID but got " + result8);
        }

        PasswordStrength result9 = PasswordValidator.validate("          12345678");
        if (result9 == PasswordStrength.INVALID) {
            System.out.println("Test Case 9 Passed: INVALID must not have white space");
        } else {
            System.out.println("Test Case 9 FAILED: Expected INVALID but got " + result9);
        }

        PasswordStrength result10 = PasswordValidator.validate("12345678   ");
        if (result10 == PasswordStrength.INVALID) {
            System.out.println("Test Case 10 Passed: INVALID must not have white space");
        } else {
            System.out.println("Test Case 10 FAILED: Expected INVALID but got " + result10);
        }

        PasswordStrength result11 = PasswordValidator.validate("12345678A@");
        if (result11 == PasswordStrength.STRONG) {
            System.out.println("Test Case 11 Passed: 8 digits or more with upper or lowercase and Special Character");
        } else {
            System.out.println("Test Case 11 FAILED: Expected STRONG but got " + result11);
        }



        System.out.println("--------------------------------");
    }
}
