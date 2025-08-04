import java.util.*;
class Grade{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int marks,total=0;
        String var="";
        for(int i=1;i<=5;i++){
            if(i==1)
            {
                var="rst";
            }
            else if(i==2)
            {
                     var="nd";
            }
            else if(i==3)
            {
                var="rd";
            }
            else 
            {
                var="th";
            }
             System.out.print("ENTER "+i+var+" SUBJECT MARK: ");
             marks=scanner.nextInt();
            
            if(marks<0||marks>100){
                System.out.println("INVALID.ENTER(0 TO 100)");
                i--;
                continue;
            }
                total+=marks;
        }
        int average=total/5;
    char grade;
        if(average>90){
                grade='O';
        }
        else if(average>75){
            grade='A';
        }
        else if(average>65){
            grade='B';      
        }
        else if(average >45){
            grade ='C';
        }
        else{
            grade='F';
        }
        System.out.println("TOTAL: "+ total);
        System.out.println("AVERAGE: "+ average+"%");
        System.out.println("GRADE: " + grade);
    }
}