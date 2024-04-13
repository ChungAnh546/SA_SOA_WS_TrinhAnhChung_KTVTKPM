package vn.edu.iuh.fit.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class CalculatorWsImpl implements CalculatorWs{
    @WebMethod
    public int add(int num1, int num2) {
        return num1+num2;
    }
}
