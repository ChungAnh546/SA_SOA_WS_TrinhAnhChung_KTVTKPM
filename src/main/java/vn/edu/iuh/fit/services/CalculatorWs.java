package vn.edu.iuh.fit.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface CalculatorWs {
    @WebMethod
    int add(int num1,int num2);

}
