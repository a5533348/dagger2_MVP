package cn.xdeveloper.dagger2.ui.login;


import javax.inject.Inject;

import cn.xdeveloper.dagger2.base.mvp.BaseModel;
import cn.xdeveloper.dagger2.base.scope.ActivityScope;
import cn.xdeveloper.dagger2.manager.ServiceManager;
import rx.Observable;

@ActivityScope
public class LoginModel extends BaseModel implements LoginContract.Model {

    @Inject
    ServiceManager mServiceManager;

    @Inject
    public LoginModel() {

    }


    @Override
    public Observable<String> login(String mobile, String password) {

//        JsonObject param = new JsonObject();
//        param.addProperty("mobile",password);
//        param.addProperty("password",password);
//
//
//        return mServiceManager.mUserService.login(param);

        return Observable.just("登录成功");
    }

}
