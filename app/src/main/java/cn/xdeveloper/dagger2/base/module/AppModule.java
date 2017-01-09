package cn.xdeveloper.dagger2.base.module;

import android.app.Application;

import com.google.gson.Gson;

import javax.inject.Singleton;

import cn.xdeveloper.dagger2.HuiApplication;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/1/3.
 */
@Module
public class AppModule {


    public AppModule(HuiApplication application) {
        this.mApplication = application;
    }

    private Application mApplication;

    @Singleton
    @Provides
    public Application provideApplication() {
        return mApplication;
    }

    @Singleton
    @Provides
    public Gson provideGson(){return new Gson();}



}