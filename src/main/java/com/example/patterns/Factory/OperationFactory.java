package com.example.patterns.Factory;


public class OperationFactory {
    
    public static Operation getOperation(int criteria) {
        if (criteria == Operation.SUM){
            return new Sum();
        } else if (criteria == Operation.DIFF) {
            return new Diff();
        } else if (criteria == Operation.MULT) {
            return new Mult();
        } else if (criteria == Operation.DIV){
            return new Div();
        }
        return null;
    }
    
    public static void main(String[] args) {
        
        Double d1 = 4d;
        Double d2 = 5d;
        
        Operation mult = getOperation(Operation.MULT);
        
        Double d3 = mult.calculate(d1, d2);
        
        System.out.println("d3 = " + d3);
        
    }
}

interface Operation {
    public final int SUM = 1; 
    public final int DIFF = 2; 
    public final int MULT = 3; 
    public final int DIV = 4; 
    
    public Double calculate(Double d1, Double d2);
}

class Sum implements Operation {
    public Double calculate(Double d1, Double d2) {
        return d1 + d2;
    }
}

class Diff implements Operation {
    public Double calculate(Double d1, Double d2) {
        return d1 - d2;
    }
}

class Mult implements Operation {
    public Double calculate(Double d1, Double d2) {
        return d1 * d2;
    }
}

class Div implements Operation {
    public Double calculate(Double d1, Double d2) {
        return d1/d2;
    }
}

