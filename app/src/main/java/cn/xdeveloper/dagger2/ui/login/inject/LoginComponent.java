package cn.xdeveloper.dagger2.ui.login.inject;

import cn.xdeveloper.dagger2.base.AppComponent;
import cn.xdeveloper.dagger2.base.scope.ActivityScope;
import cn.xdeveloper.dagger2.ui.login.LoginActivity;
import dagger.Component;

@ActivityScope
@Component(modules = LoginModule.class, dependencies = AppComponent.class)
public interface LoginComponent {

    void inject(LoginActivity activity);

}
