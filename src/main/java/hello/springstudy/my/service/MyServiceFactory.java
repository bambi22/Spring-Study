package hello.springstudy.my.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyServiceFactory {
    private final ApplicationContext ac;

    public MyService getService(String viewType) {
        if ("PKG".equalsIgnoreCase(viewType)) {
            return ac.getBean("pkgMyService", MyService.class);
        } else {
            return ac.getBean("customMyService", MyService.class);
        }
    }
}
