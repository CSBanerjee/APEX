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
        finalAnswer = handlePasswordAttempts('My_Salesforce_Password');
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
    
    public static integer checkForMakeSense(List<String> statements){
        integer makesSense = 0;
        for(string statement:statements ){
            if(statement.containsIgnoreCase('Make Sense')){
                makesSense++;
            }
        }
        return makesSense;
    }
    
    public static void checkHighestLowest(Map<String,Integer> myReportCard){
        integer maxMarks = 0;
        integer minMarks = 0;
        /*Map<String,Integer> myReportCard = new Map<String,Integer>();
        myReportCard.put('Physics',88);
        myReportCard.put('Chemistry',66);
        myReportCard.put('Biology',77);
        myReportCard.put('Math',98);*/
        for(String subject:myReportCard.keyset()){
            if(minMarks ==0){
            minMarks = myReportCard.get(subject);    
            }
            integer subjectMark = myReportCard.get(subject);
            if(maxMarks<subjectMark){
                maxMarks = subjectMark;
            }
            if(minMarks>subjectMark){
                minMarks = subjectMark;
            }

            
        }
        system.debug(maxMarks);
        system.debug(minMarks);
            
        
    }

}