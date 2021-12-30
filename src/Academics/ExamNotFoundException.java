package Academics;

public class ExamNotFoundException extends Exception{
String str;
ExamNotFoundException(String str){
    this.str = str;
}
    public String toString(){
        return ("Exception Occurred: "+str) ;
    }
}
