package cn.xdeveloper.dagger2.manager;

import cn.xdeveloper.dagger2.network.retrofit.UserService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ServiceManager {

    private UserService mUserService;

    @Inject
    public ServiceManager(UserService userService) {
        this.mUserService = userService;
    }

    public UserService getUserService() {
        return mUserService;
    }

}
