package rca.tresor.v1.dtos;

import lombok.Data;

@Data
//@AllArgsConstructor
public class DoMathRequestDto {
    private double operand1;
    private double operand2;
    private String operation;

    public DoMathRequestDto(double operand1, double operand2, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    public DoMathRequestDto() {
        operand1= this.getOperand1();
        operand2=this.getOperand2();
        operation= this.getOperation();
    }


    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
