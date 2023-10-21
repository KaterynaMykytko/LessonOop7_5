package org.courses.ex7_5;

public class Calculator {

   private int number1;
   private int number2;


   public Calculator(int number1, int number2){
      this.number1 = number1;
      this.number2 = number2;
   }

   public void add(){
      System.out.println(number1 + number2);
   }

   public void sub(){
      System.out.println(number1 - number2);
   }

   public void mul(){
      System.out.println(number2 * number1);
   }

   public void div(){
      if (number2 == 0) {
         throw new ArithmeticException("Divide by zero.");
      }
      System.out.println(number1/number2);
   }
}
