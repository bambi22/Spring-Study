package hello.springstudy.my.service;

import org.springframework.stereotype.Service;

@Service("pkgMyService")
public class PkgMyService implements MyService{
    @Override
    public void executeService() {
        System.out.println("Executing Service Pkg");
    }
}
