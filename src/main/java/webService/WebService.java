package webService;


import javax.jws.WebParam;
@javax.jws.WebService
public interface WebService {
    String getMessage(User[] users);
}
