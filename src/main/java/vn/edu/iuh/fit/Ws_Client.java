package vn.edu.iuh.fit;
import jakarta.xml.ws.Service;
import vn.edu.iuh.fit.services.CalculatorWs;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.Iterator;

public class Ws_Client {
    public static void main(String[] args) throws Exception {
// Create URL of .wsdl file
        URL wsdlURL = new
                URL("http://localhost:8080/calc/calculatorWebService?wsdl");
// Create a QName using targetNamespace and name
        QName qname = new QName("http://services.fit.iuh.edu.vn/",
                "CalculatorWsImplService");
// Creates a Service instance with the specified WSDL document location and
// service qualified name
        Service service = Service.create(wsdlURL, qname);
// We need to pass interface and model beans to client
        Iterator<QName> ports = service.getPorts();
        ports.forEachRemaining(System.out::println);
        QName portName = new QName("http://services.fit.iuh.edu.vn/",
                "CalculatorWsImplPort");
        CalculatorWs userService = service.getPort(portName,CalculatorWs.class);
        int a = userService.add(3, 4);
        System.out.println(a);
    }
}
