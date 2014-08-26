package com.example.patterns.Singleton;

/**
 * У этого решения есть единственный недостаток – 
 * оно не работает в многопоточной среде 
 * и поэтому не подходит в большинстве случаев. 
 * Решение подходит исключительно для однопоточных приложений.
 * @author user
 */
public class SingletonFirstCase {
    
    private static SingletonFirstCase instance;

    private SingletonFirstCase() {}
    
    public static SingletonFirstCase getInstance(){
        if(instance == null){
            instance = new SingletonFirstCase();
        }
        return instance;
    }
    
}
