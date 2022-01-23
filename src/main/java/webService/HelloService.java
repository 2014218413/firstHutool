package webService;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloService {
    public String sayHello(String username,User[] users);
}
