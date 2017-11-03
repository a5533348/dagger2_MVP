package cn.xdeveloper.dagger2.ui.login;

import javax.inject.Inject;

import cn.xdeveloper.dagger2.base.mvp.BasePresenter;
import cn.xdeveloper.dagger2.base.scope.ActivityScope;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/3.
 */
@ActivityScope
public class LoginPresenter extends BasePresenter<LoginContract.Model, LoginContract.View> implements LoginContract.Presenter {

    @Inject
    LoginPresenter() {
    }


    /**
     * 登录
     */
    @Override
    public void login(final String mobile, final String password) {
        mModel.login(mobile, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(String result) {
                        mView.loginSuccess(result);
                    }
                });

    }

    @Override
    public void onDestroy() {

    }


}
