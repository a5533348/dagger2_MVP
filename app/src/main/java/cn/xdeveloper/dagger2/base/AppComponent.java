package cn.xdeveloper.dagger2.base;

import android.app.Application;

import com.google.gson.Gson;
import cn.xdeveloper.dagger2.base.module.ApiServiceModule;
import cn.xdeveloper.dagger2.base.module.AppModule;
import cn.xdeveloper.dagger2.base.module.DBModule;
import cn.xdeveloper.dagger2.base.module.HttpModule;
import cn.xdeveloper.dagger2.manager.DBManager;
import cn.xdeveloper.dagger2.manager.ServiceManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/1/3.
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class, ApiServiceModule.class, DBModule.class})
public interface AppComponent {

    Application application();

    ServiceManager serviceManager();

    DBManager DBManager();

    Gson gson();

}
