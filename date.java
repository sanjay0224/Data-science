import java.util.*;
class date{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    
    System.out.println("Enter year:");
    int y=sc.nextInt();
    System.out.println("Enter month:");
    int m=sc.nextInt();
    System.out.println("Enter date:");
    int d=sc.nextInt();

    
    if(y>=1900 && y<=2100){
        if(m>=1 && m<=12){
            if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
                if(d>=1&&d<=30){
                    System.out.println("valid date");
                }
                else{
                    System.out.println("date invalid");
                }
            }
            else if(m==4||m==6||m==9||m==11){
                if(d>=1&&d<=31){
                    System.out.println("valid date");
                }
                else{
                    System.out.println("date is invalid");
                }   
            }
            else{
                if(y%400==0 || y%4==0 && y%100!=0){
                    if(d>=1&&d<=29){
                    System.out.println("date valid");
                    }
                    else{
                        System.out.println("invalid date");
                    }}
                else{
                    System.out.println("date is invalid");
                }
                
            }

        }}
    

    
    
    
    else{
            System.out.println("year is invalid");
    }
}
}
    
    

    
    
