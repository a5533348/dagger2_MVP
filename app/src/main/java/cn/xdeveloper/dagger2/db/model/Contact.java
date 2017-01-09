package cn.xdeveloper.dagger2.db.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Ouyang on 2015/12/7.<br/>
 * Description：好友实体类
 */
public class Contact implements Parcelable {

    /** 用户类型*/
    public static final byte USER_TYPE_PATIENT = 0;
    public static final byte USER_TYPE_DOCTOR = 1;

    /** 性别-男 */
    public static final byte GENDER_MALE = 1;
    /** 医生认证状态-未认证 */
    public static final byte AUTH_STATUS_NOT = 0;
    /** 医生认证状态-待审核 */
    public static final byte AUTH_STATUS_DOING = 1;
    /** 医生认证状态-审核通过 */
    public static final byte AUTH_STATUS_SUCCESS = 2;
    /** 医生认证状态-审核失败 */
    public static final byte AUTH_STATUS_FAILURE = 3;
    /** 是好友 */
    public static final byte IS_FRIEND = 1;
    /** 不是是好友 */
    public static final byte NOT_FRIEND = 0;

    /** 联系人ID */
    public Long userId = null;
    /** 医院ID */
    public Long hospitalId = null;
    /** 医院ID */
    public String hospitalName = null;
    /** 部门ID */
    public Long deptId = null;
    /** 部门ID */
    public String deptName = null;
    /** 姓名 */
    public String name = null;
    /** 备注 */
    public String remark = null;
    /** 性别 */
    public Byte gender = null;
    /** 电话 */
    public String phone = null;
    /** 邮箱 */
    public String email = null;
    /** 职位 */
    public String position = null;
    /** 姓名首字母 */
    public String firstNamePy = null;
    /** 姓名全拼字母 */
    public String fullNamePy = null;
    /** 认证状态,详见{@link #AUTH_STATUS_NOT}、{@link #AUTH_STATUS_DOING}、{@link #AUTH_STATUS_SUCCESS}、{@link #AUTH_STATUS_FAILURE} */
    public Byte authStatus = null;
    /** 数据版本号 */
    public Long dataVersion = null;
    /** 是否已加为好友 */
    public Boolean isFriend = null;
    /** 头像地址url(前面需拼上图片服务器地址) */
    public String headUrl = null;
    /** 头像版本号 */
    public Long headVersion = null;

    /** 是否被选中,选择联系人创建对话时使用,不需存数据库 */
    public boolean isChecked = false;

    public Contact() {}

    @Override
    public String toString() {
        return "Contact{" +
                "userId=" + userId +
                ", hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", firstNamePy='" + firstNamePy + '\'' +
                ", fullNamePy='" + fullNamePy + '\'' +
                ", authStatus=" + authStatus +
                ", dataVersion=" + dataVersion +
                ", isFriend=" + isFriend +
                ", headUrl='" + headUrl + '\'' +
                ", headVersion=" + headVersion +
                ", isChecked=" + isChecked +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.userId);
        dest.writeValue(this.hospitalId);
        dest.writeString(this.hospitalName);
        dest.writeValue(this.deptId);
        dest.writeString(this.deptName);
        dest.writeString(this.name);
        dest.writeString(this.remark);
        dest.writeValue(this.gender);
        dest.writeString(this.phone);
        dest.writeString(this.email);
        dest.writeString(this.position);
        dest.writeString(this.firstNamePy);
        dest.writeString(this.fullNamePy);
        dest.writeValue(this.authStatus);
        dest.writeValue(this.dataVersion);
        dest.writeValue(this.isFriend);
        dest.writeString(this.headUrl);
        dest.writeValue(this.headVersion);
        dest.writeByte(this.isChecked ? (byte) 1 : (byte) 0);
    }

    protected Contact(Parcel in) {
        this.userId = (Long) in.readValue(Long.class.getClassLoader());
        this.hospitalId = (Long) in.readValue(Long.class.getClassLoader());
        this.hospitalName = in.readString();
        this.deptId = (Long) in.readValue(Long.class.getClassLoader());
        this.deptName = in.readString();
        this.name = in.readString();
        this.remark = in.readString();
        this.gender = (Byte) in.readValue(Byte.class.getClassLoader());
        this.phone = in.readString();
        this.email = in.readString();
        this.position = in.readString();
        this.firstNamePy = in.readString();
        this.fullNamePy = in.readString();
        this.authStatus = (Byte) in.readValue(Byte.class.getClassLoader());
        this.dataVersion = (Long) in.readValue(Long.class.getClassLoader());
        this.isFriend = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.headUrl = in.readString();
        this.headVersion = (Long) in.readValue(Long.class.getClassLoader());
        this.isChecked = in.readByte() != 0;
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel source) {
            return new Contact(source);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };
}
