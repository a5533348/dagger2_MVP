package cn.xdeveloper.dagger2.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ouyang on 2015/12/5.<br/>
 * Description：通用数据库
 */
public class CommonDBHelper extends SQLiteOpenHelper {

    public CommonDBHelper(Context context) {
        this(context, DBConstants.CommonDB.COMMON_DB_NAME, null, DBConstants.CommonDB.COMMON_DB_VERSION);
    }

    private CommonDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBConstants.CommonDB.getCreateUserInfoSql());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
