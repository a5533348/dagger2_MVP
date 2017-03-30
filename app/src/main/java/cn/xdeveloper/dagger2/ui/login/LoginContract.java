package cn.xdeveloper.dagger2.ui.login;

import cn.xdeveloper.dagger2.base.mvp.IView;
import cn.xdeveloper.dagger2.base.mvp.IModel;
import cn.xdeveloper.dagger2.base.mvp.IPresenter;
import rx.Observable;

/**
 * Created by Administrator on 2017/1/3.
 */

public interface LoginContract {

    interface View extends IView {

        /**
         * 登录成功
         *
         * @param result
         */
        void loginSuccess(String result);
    }

    interface Presenter extends IPresenter{

        /**
         * 登录
         * @param mobile
         * @param password
         */
        void login(String mobile, String password);

    }

    interface Model extends IModel {

        /**
         * 登录
         *
         * @param mobile
         * @param password
         */
        Observable<String> login(String mobile, String password);

    }
}
