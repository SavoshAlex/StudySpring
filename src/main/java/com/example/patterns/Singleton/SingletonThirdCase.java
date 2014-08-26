package com.example.patterns.Singleton;

/**
 * В данном случае мы полностью решили проблему ленивой инициализации 
 * – объект инициализируется при первом вызове метода getInstance(). 
 * Но у нас осталась проблема с обработкой исключительных ситуаций в конструкторе. 
 * Так что, если конструктор класса не вызывает опасений создания исключительных ситуаций, 
 * то смело можно использовать этот метод. 
 * 
 */
public class SingletonThirdCase {

    private SingletonThirdCase() {
    }
    
    public static class SingletonHolder {
        private final static SingletonThirdCase instance = new SingletonThirdCase();
    }
    
    public static SingletonThirdCase getInstance(){
        return SingletonHolder.instance;
    }
    
}
