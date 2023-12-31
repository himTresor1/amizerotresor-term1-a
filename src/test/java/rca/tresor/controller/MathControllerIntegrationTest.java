package rca.tresor.controller;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import rca.tresor.service.IMathOperator;
import rca.tresor.v1.controllers.MathController;
import rca.tresor.v1.dtos.DoMathRequestDto;
import rca.tresor.v1.dtos.MathResponseDto;
import rca.tresor.v1.exceptions.InvalidOperationException;

import static org.junit.jupiter.api.Assertions.*;

public class MathControllerIntegrationTest {

    @Test
    void givenTwoNumbers_whenAdded_Returns_Sum() throws InvalidOperationException {
        IMathOperator mathOperatorMock = Mockito.mock(IMathOperator.class);
        Mockito.when(mathOperatorMock.calculate(5.0, 4.0, "+")).thenReturn(9.0);

        MathController mathController = new MathController(mathOperatorMock);

        DoMathRequestDto doMathRequest = new DoMathRequestDto();
        doMathRequest.setOperand1(5.0);
        doMathRequest.setOperand2(4.0);
        doMathRequest.setOperation("+");

        MathResponseDto mathResponse = mathController.doMath(doMathRequest);

        assertEquals(9.0, mathResponse.getCalcResponse());
    }
}
