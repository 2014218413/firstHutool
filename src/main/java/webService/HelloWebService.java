package webService;

import javax.jws.WebService;

/**
 * 对外发布接口
 * */
@WebService(targetNamespace = "webService.myBoot")
public interface HelloWebService {
    //对外发布接口的方法
    public String sayHello(String username,User[] users);
}
