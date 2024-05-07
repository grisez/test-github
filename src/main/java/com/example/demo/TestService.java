@WebService(targetNamespace="http://spoonless.github.io/ws/hello", serviceName="HelloService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class HelloService {
  @WebMethod
  @WebResult(name = "helloMessage", targetNamespace = "http://spoonless.github.io/ws/hello")
  public String sayHello(
      @WebParam(name = "who", targetNamespace="http://spoonless.github.io/ws/hello") String name) {
    return "Hello " + name;
  }
}
