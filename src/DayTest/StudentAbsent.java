package DayTest;

public class StudentAbsent {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        for(int i = 0;i<s.length();i++){
            if(absent >= 2){
                return false;
            }
            if(s.charAt(i)=='A'){
                absent ++;
            }
            if(s.length()-i>=3){
                if(s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L'){
                    return false;
                }
            }
        }
        if(absent >= 2){
            return false;
        }
        return true;
    }
}
