package webService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String username,User[] users) {
        return users[0].getName()+"-----------"+username;
    }
}
