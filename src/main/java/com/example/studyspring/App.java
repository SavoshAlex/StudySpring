package com.example.studyspring;


//    Chapter 4, The IoC container
//    Chapter 5, Resources
//    Chapter 6, Validation, Data Binding, and Type Conversion
//    Chapter 7, Spring Expression Language (SpEL)
//    Chapter 8, Aspect Oriented Programming with Spring
//    Chapter 9, Spring AOP APIs
//    Chapter 10, Testing 



public class App {
    public static class InnerOne {
        public static class InnerTwo {
            public static class InnerTree {
            }
        }
    }
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String str = "";
        
        str.replace('1', '2');
        
        int id = Integer.parseInt("");
        System.out.println(id);
    }
}
