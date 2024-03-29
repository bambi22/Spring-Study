package hello.springstudy.my.service;

import org.springframework.stereotype.Service;

@Service("customMyService")
public class CustomMyService implements MyService{
    @Override
    public void executeService() {
        System.out.println("Executing Service Custom");
    }
}
