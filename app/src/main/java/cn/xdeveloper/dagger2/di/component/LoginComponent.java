package cn.xdeveloper.dagger2.di.component;

import android.app.Application;

import cn.xdeveloper.dagger2.base.AppComponent;
import cn.xdeveloper.dagger2.base.scope.ActivityScope;
import cn.xdeveloper.dagger2.di.module.LoginModule;
import cn.xdeveloper.dagger2.entity.Student;
import cn.xdeveloper.dagger2.ui.login.LoginActivity;

import cn.xdeveloper.dagger2.ui.login.LoginContract;
import dagger.Component;

@ActivityScope
@Component(modules = LoginModule.class, dependencies = AppComponent.class)
public interface LoginComponent {

    void inject(LoginActivity activity);

}
