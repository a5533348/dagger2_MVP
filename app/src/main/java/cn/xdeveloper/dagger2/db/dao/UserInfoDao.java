package cn.xdeveloper.dagger2.db.dao;

import android.database.sqlite.SQLiteDatabase;

import cn.xdeveloper.dagger2.db.CommonDBHelper;

/**
 * Created by Ouyang on 2015/12/5.<br/>
 * Description：用户信息dao
 */
public class UserInfoDao {

    private static final String TAG = UserInfoDao.class.getSimpleName();

    private SQLiteDatabase database;


    public UserInfoDao(CommonDBHelper dbHelper) {
        database = dbHelper.getWritableDatabase();
    }

}
