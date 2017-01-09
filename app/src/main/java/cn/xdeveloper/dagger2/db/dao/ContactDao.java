package cn.xdeveloper.dagger2.db.dao;

import android.database.sqlite.SQLiteDatabase;

import cn.xdeveloper.dagger2.db.PrivateDBHelper;

public class ContactDao {

    private static final String TAG = ContactDao.class.getSimpleName();

    private SQLiteDatabase database;

    /**
     * 构造器
     *
     * @param helper
     */
    public ContactDao(PrivateDBHelper helper) {
        database = helper.getWritableDatabase();
    }

   }
