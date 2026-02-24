package oop.labor02;

public class DateUtil {
    public static boolean leapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isValidDate(int year, int month, int day){
        if(year >= 0){
            if(month > 0 && month < 13){
                if(month == 1 && day == 31){
                    return true;
                }else{
                    return false;
                }
                if(leapYear(year) == false && (month == 2 && day == 28)){
                    return true;
                }else{
                    return false;
                }
                if(leapYear(year) == true && (month == 2 && day == 29)){
                    return true;
                }else{
                    return false;
                }
                if(month == 3 && day == 31){
                    return true;
                }else{
                    return false;
                }
                if(month == 4 && day == 30){
                    return true;
                }else{
                    return false;
                }
                if(month == 5 && day == 31){
                    return true;
                }else{
                    return false;
                }
                if(month == 6 && day == 30){
                    return true;
                }else{
                    return false;
                }
                if(month == 7 && day == 31){
                    return true;
                }else{
                    return false;
                }
                if(month == 8 && day == 31){
                    return true;
                }else{
                    return false;
                }
                if(month == 9 && day == 30){
                    return true;
                }else{
                    return false;
                }
                if(month == 10 && day == 31){
                    return true;
                }else{
                    return false;
                }
                if(month == 11 && day == 30){
                    return true;
                }else{
                    return false;
                }
                if(month == 12 && day == 31){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }
}
