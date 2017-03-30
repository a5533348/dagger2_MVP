package cn.xdeveloper.dagger2.manager;

import cn.xdeveloper.dagger2.network.retrofit.UserService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ServiceManager {

    @Inject
    public UserService mUserService;

    @Inject
    public ServiceManager(){}

}
