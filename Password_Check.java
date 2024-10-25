public class BasicClassInApex {
    public static string correctPassword = 'My_Salesforce_Password';
    public static integer attemptCounter = 1;
    
    public static void attemptDifferentPassword(){
        string finalAnswer = '';
        finalAnswer = handlePasswordAttempts('firstattemt');
        system.debug(finalAnswer);
        finalAnswer = handlePasswordAttempts('secondattemt');
        system.debug(finalAnswer);
        finalAnswer = handlePasswordAttempts('thirdattemt');
        system.debug(finalAnswer);
        finalAnswer = handlePasswordAttempts('thirdattemt');
        system.debug(finalAnswer);
    }
    
    public static string handlePasswordAttempts(string passwordInput){
        if(passwordInput !=correctPassword){
            if(attemptCounter>3){
                return 'account is locked';
            }
            attemptCounter++;
            return 'failure';
        }
        else{
            return 'success';
        }        
    }

}