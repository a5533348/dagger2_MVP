package cn.xdeveloper.dagger2.base.module;

import javax.inject.Singleton;

import cn.xdeveloper.dagger2.network.retrofit.UserService;
import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import retrofit2.Retrofit;

/**
 * Created by Administrator on 2017/1/3.
 */
@Module
public class ApiServiceModule {

    @Singleton
    @Provides
    HttpUrl provideBaseUrl() {
        return HttpUrl.parse("http://10.10.19.15:8060/huidrRESTful/");
    }

    @Singleton
    @Provides
    UserService provideUserService(Retrofit retrofit) {
        return retrofit.create(UserService.class);
    }

}
