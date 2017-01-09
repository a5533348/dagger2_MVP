package cn.xdeveloper.dagger2.manager;

import android.app.Application;

import cn.xdeveloper.dagger2.db.PrivateDBHelper;
import cn.xdeveloper.dagger2.db.dao.ContactDao;
import cn.xdeveloper.dagger2.db.dao.UserInfoDao;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DBManager {

    private Application application;

    private ContactDao contactDao;

    @Inject
    UserInfoDao mUserInfoDao;

    @Inject
    public DBManager(Application application) {
        this.application = application;
    }

    public UserInfoDao getUserInfoDao() {
        return mUserInfoDao;
    }

    public ContactDao getContactDao(Long userId) {
        if (contactDao == null) {
            synchronized (DBManager.class) {
                if (contactDao == null)
                    contactDao = new ContactDao(PrivateDBHelper.getInstance(application, userId));
            }
        }
        return contactDao;
    }
}
