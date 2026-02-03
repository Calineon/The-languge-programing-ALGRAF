/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.the_language_programing_algraf;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
class calculator{
int number1;
char character;
int number2;
int result;
}
enum Token_type{
PlUS,MINUS, MULTIPLY,DIVISION,LPARAM,RPARAM,EOF
}

public class The_language_programing_ALGRAF {
class Token{
Token_type type;
String value;
}


    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    calculator p =new calculator();
    p.number1=scanner.nextInt();
    p.character=scanner.next().charAt(0);
    p.number2=scanner.nextInt();
    while(true){
    if(p.character=='+'){
     p.result=p.number1+p.number2;
     System.out.println(p.result);
    }
    if(p.character=='-'){
      p.result=p.number1-p.number2; 
      System.out.println(p.result);
    }
    if(p.character=='*'){
      p.result=p.number1*p.number2;
      System.out.println(p.result);
    }
    else if(p.character=='/'){
       if(p.number2!=2/0){
        p.result=p.number1+p.number2; 
       }
    }
    break;
    }
    }
}
