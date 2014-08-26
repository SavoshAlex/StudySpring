

package com.example.patterns.Singleton;

/**
 * И вы будете правы, так как проблему многопоточности мы решили, но потеряли две важные вещи: 
 * 1. Ленивую инициализацию (Объект instance будет создан classloader-ом во время инициализации класса)
 * 2. Отсутствует возможность обработки исключительных ситуаций(exceptions) во время вызова конструктора. 
 */
public class SingletonSecondCase {
    
    private static SingletonSecondCase instance = new SingletonSecondCase();
    
    private SingletonSecondCase(){}
    
    public static SingletonSecondCase getInstance(){
        return instance;
    }
}
