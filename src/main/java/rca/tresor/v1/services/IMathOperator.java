package rca.tresor.v1.services;


import rca.tresor.v1.exceptions.InvalidOperationException;

public interface IMathOperator {

    double calculate(double operand1, double operand2, String operation) throws InvalidOperationException;
}
