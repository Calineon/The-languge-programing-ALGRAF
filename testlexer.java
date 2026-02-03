/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.the_language_programing_algraf;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
enum calculation{
NUMBER,
PLUS,
MINUS,
MULTYPLY,
DIVISION,
EOF
}
class operation{
private calculation NUM;
private char chr;
operation(calculation NUM,char chr){
this.NUM=NUM;
this.chr=chr;
}
@Override
public String toString(){
switch(NUM){
    case NUMBER: return "NUMBER";
    case MINUS: return "MINUS";
    case MULTYPLY: return "MULTYPLY";
    case DIVISION: return "DIVISION";
}
}



public class The_language_programing_ALGRAF {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    }
    }
