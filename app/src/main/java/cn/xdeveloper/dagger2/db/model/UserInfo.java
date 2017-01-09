package cn.xdeveloper.dagger2.db.model;

/**
 * Created by Ouyang on 2015/12/5.<br/>
 * Description：用户信息表对应的实体类
 */
public class UserInfo {

    /** 用户id */
    public Long userId = null;
    /** 手机号 */
    public String mobile = null;
    /** 账户密码 */
    public String password = null;
    /** 用户姓名 */
    public String name = null;
    /** 性别 */
    public Byte gender = null;
    /** 用户头像地址 */
    public String headUrl = null;
    /** 用户身份证号 */
    public String idCard = null;
    /** 用户所属企业(医院)id */
    public Long hospitalId;
    /** 用户所属企业(医院)名称 */
    public String hospitalName = null;
    /** 是否可获取数据 */
    public Integer hospitalGetInfo = null;
    /** 用户所属科室id */
    public Long deptId = null;
    /** 用户所属科室名称 */
    public String deptName = null;
    /** 用户职称 */
    public String position = null;
    /** 认证状态*/
    public Byte authStatus = null;
    /** 认证图片 */
    public String authImgUrl;
    /** 数据版本号-科室 */
    public Long deptDataVersion = null;
    /** 数据版本号-好友 */
    public Long contactDataVersion = null;
    /** 数据版本号-随访池 */
    public Long followPoolDataVersion = null;
    /** 数据版本号-头像 */
    public Long headDataVersion = null;


    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", headUrl='" + headUrl + '\'' +
                ", idCard='" + idCard + '\'' +
                ", hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalGetInfo=" + hospitalGetInfo +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", position='" + position + '\'' +
                ", authStatus=" + authStatus +
                ", authImgUrl='" + authImgUrl + '\'' +
                ", deptDataVersion=" + deptDataVersion +
                ", contactDataVersion=" + contactDataVersion +
                ", followPoolDataVersion=" + followPoolDataVersion +
                ", headDataVersion=" + headDataVersion +
                '}';
    }
}
