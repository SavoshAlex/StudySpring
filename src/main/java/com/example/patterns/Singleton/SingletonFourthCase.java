/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.patterns.Singleton;

/**
 * У этого варианта есть только один недостаток. 
 * Синхронизация полезна только один раз, при первом обращении к getInstance(), 
 * после этого каждый раз, при обращении этому методу, синхронизация просто забирает время. 
 * Что можно сказать по этому поводу? Ну, во-первых, если вызов getInstance() 
 * не происходит достаточно часто (что значит «достаточно часто» решать вам), 
 * то этот метод имеет преимущество перед остальными – прост, понятен, 
 * лениво инициализируется, дает возможность обрабатывать исключительные 
 * ситуации в конструкторе. А во-вторых, синхронизация в Java перестала быть 
 * обременительно медленной настолько, насколько ее боятся. Ну что еще для счастья надо?
 */
public class SingletonFourthCase {
    
    private static SingletonFourthCase instance;
    
    private SingletonFourthCase(){}
    
    public static synchronized SingletonFourthCase getInstance(){
        if(instance == null){
            instance = new SingletonFourthCase();
        }
        return instance;
    }
}
