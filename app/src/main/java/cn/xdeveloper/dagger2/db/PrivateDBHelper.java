package cn.xdeveloper.dagger2.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import cn.xdeveloper.dagger2.db.DBConstants.PrivateDB;


/**
 * Created by Ouyang on 2015/12/5.<br/>
 * Description：私有数据库，即指定名字（即手机号码）的数据库<br/>
 * 在退出登录时需调用{@link }
 */
public class PrivateDBHelper extends SQLiteOpenHelper {

    private static PrivateDBHelper helper;

    public static PrivateDBHelper getInstance(Context context, long userId) {
        if (helper == null) {
            synchronized (PrivateDBHelper.class) {
                if (helper == null) {
                    helper = new PrivateDBHelper(context.getApplicationContext(), userId);
                }
            }
        }
        return helper;
    }

    /**
     * 关闭数据库, 用在退出登录时
     */
    public static void closeDb() {
        if (helper != null)
            helper.close();
        helper = null;
    }

    /**
     * 获取数据库OpenHelper
     * @param context
     * @param userId 数据库名字,即用户id,打开数据库前需先检测是否有登录账号
     */
    public PrivateDBHelper(Context context, long userId) {
        this(context, userId + ".db", null, PrivateDB.DB_VERSION);
    }

    private PrivateDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(PrivateDB.getCreateContactsSql());
        db.execSQL(PrivateDB.getCreateSessionSql());
        db.execSQL(PrivateDB.getCreateMsgRecordSql());
        db.execSQL(PrivateDB.getCreateFriendAdditionSql());
        db.execSQL(PrivateDB.getCreatePhoneBookFriendStatusSql());
        db.execSQL(PrivateDB.getCreateFollowPatientSql());
        db.execSQL(PrivateDB.getCreateSysNotifiSql());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }
}
