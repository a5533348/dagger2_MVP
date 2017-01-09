package cn.xdeveloper.dagger2.db;

/**
 * Created by Ouyang on 2015/12/5.<br/>
 * Description：数据库相关常量
 */
public class DBConstants {

    /**
     * 所有公共数据库中表的表名
     */
    public static class CommonTables {
        /** 用户信息表 */
        public static final String T_USER_INFO = "t_userInfo";
    }

    /**
     * 所有私有数据库(对应某个登录用户)中表的表名
     */
    public static class PrivateTables {

        /** 联系人表 */
        public static final String T_CONTACTS = "t_contacts";
        /** 会话表 */
        public static final String T_CHAT_SESSION = "t_chatSession";
        /** 聊天记录表 */
        public static final String T_MSG_RECORD = "t_msgRecord";
        /** 好友申请表 */
        public static final String T_FRIEND_ADDITION = "t_friendAddition";
        /** 手机通讯录好友状态表 */
        public static final String T_PHONE_BOOK_FRIEND_ADDITION = "t_phoneBookFriendStatus";
        /** 随访池患者表 */
        public static final String T_FOLLOW_PATIENT = "t_followPatient";
        /** 系统消息表 */
        public static final String T_SYS_NOTIFICATION = "t_sys_notification";
    }

    /**
     * 通用数据库的常量
     */
    public static class CommonDB {
        /** 全局通用的数据库名字 */
        public static final String COMMON_DB_NAME = "huidr.db";
        /** 全局通用的数据库版本号 */
        public static final int COMMON_DB_VERSION = 1;

        /**
         * 获取创建用户信息表的sql
         * @return
         */
        public static String getCreateUserInfoSql() {
            StringBuilder sql = new StringBuilder("CREATE TABLE ");
            sql.append(CommonTables.T_USER_INFO).append(" (").append(UserInfoColumns.USER_ID).append(" INTEGER PRIMARY KEY,")
                    .append(UserInfoColumns.MOBILE).append(" TEXT,").append(UserInfoColumns.PASSWORD).append(" TEXT,")
                    .append(UserInfoColumns.NAME).append(" TEXT,").append(UserInfoColumns.ID_CARD).append(" TEXT,")
                    .append(UserInfoColumns.HEAD_URL).append(" TEXT,").append(UserInfoColumns.POSITION).append(" TEXT,")
                    .append(UserInfoColumns.HOSPITAL_ID).append(" INTEGER,").append(UserInfoColumns.HOSPITAL_NAME).append(" TEXT,")
                    .append(UserInfoColumns.HOSPITAL_GET_INFO).append(" INTEGER,")
                    .append(UserInfoColumns.DEPT_ID).append(" INTEGER,").append(UserInfoColumns.DEPT_NAME).append(" TEXT,")
                    .append(UserInfoColumns.AUTH_STATUS).append(" INTEGER,").append(UserInfoColumns.AUTH_IMG_URL).append(" TEXT,")
                    .append(UserInfoColumns.DATA_VERSION_DEPT).append(" INTEGER,")
                    .append(UserInfoColumns.DATA_VERSION_CONTACT).append(" INTEGER,")
                    .append(UserInfoColumns.DATA_VERSION_HEAD).append(" INTEGER,")
                    .append(UserInfoColumns.DATA_VERSION_FOLLOW_POOL).append(" INTEGER,")
                    .append(UserInfoColumns.GENDER).append(" INTEGER)");
            return sql.toString();
        }


        /** 用户信息表字段 */
        public static class UserInfoColumns {
            /** 用户id(主键,跟联系人id相同) */
            public static final String USER_ID = "userId";
            /** 即手机号 */
            public static final String MOBILE = "mobile";
            /** 账户密码 */
            public static final String PASSWORD = "password";
            /** 姓名 */
            public static final String NAME = "name";
            /** 头像地址 */
            public static final String HEAD_URL = "headUrl";
            /** 身份证 */
            public static final String ID_CARD = "idCard";
            /** 用户所属医院id */
            public static final String HOSPITAL_ID = "hospitalId";
            /** 用户所属医院名称 */
            public static final String HOSPITAL_NAME = "hospitalName";
            /** 是否可以获取信息 */
            public static final String HOSPITAL_GET_INFO = "hospitalGetInfo";
            /** 用户所属部门id */
            public static final String DEPT_ID = "deptId";
            /** 用户所属部门名称 */
            public static final String DEPT_NAME = "deptName";
            /** 用户职称 */
            public static final String POSITION = "position";
            /** 用户实名认证状态 */
            public static final String AUTH_STATUS = "authStatus";
            /** 用户实名认证的图片在服务器的地址 */
            public static final String AUTH_IMG_URL = "authImgUrl";
            /** 数据版本号-部门 */
            public static final String DATA_VERSION_DEPT = "deptDataVersion";
            /** 数据版本号-好友 */
            public static final String DATA_VERSION_CONTACT = "contactDataVersion";
            /** 数据版本号-头像 */
            public static final String DATA_VERSION_HEAD = "headDataVersion";
            /** 数据版本号-随访池 */
            public static final String DATA_VERSION_FOLLOW_POOL = "followPoolDataVersion";
            /** 性别 */
            public static final String GENDER = "gender";

        }
    }

    /**
     * 私有数据库的常量（即指定数据库名（手机号））
     */
    public static class PrivateDB {
        /** 数据库版本 */
        public static final int DB_VERSION = 1;

        /** 创建联系人表 */
        public static String getCreateContactsSql() {
            StringBuilder sql = new StringBuilder("CREATE TABLE ");
            sql.append(PrivateTables.T_CONTACTS).append(" (")
                    .append(ContactsColumns.USER_ID).append(" INTEGER PRIMARY KEY,")
                    .append(ContactsColumns.HOSPITAL_ID).append(" INTEGER,").append(ContactsColumns.HOSPITAL_NAME).append(" TEXT,")
                    .append(ContactsColumns.DEPT_ID).append(" INTEGER,").append(ContactsColumns.DEPT_NAME).append(" TEXT,")
                    .append(ContactsColumns.NAME).append(" TEXT,").append(ContactsColumns.REMARK).append(" TEXT,")
                    .append(ContactsColumns.GENDER).append(" INTEGER,").append(ContactsColumns.PHONE).append(" TEXT,")
                    .append(ContactsColumns.EMAIL).append(" TEXT,").append(ContactsColumns.POSITION).append(" TEXT,")
                    .append(ContactsColumns.FIRST_NAME_PY).append(" TEXT,")
                    .append(ContactsColumns.FULL_NAME_PY).append(" TEXT,")
                    .append(ContactsColumns.AUTH_STATUS).append(" INTEGER,")
                    .append(ContactsColumns.DATA_VERSION).append(" INTEGER,")
                    .append(ContactsColumns.HEAD_URL).append(" TEXT,")
                    .append(ContactsColumns.HEAD_VERSION).append(" INTEGER,")
                    .append(ContactsColumns.IS_FRIEND).append(" INTEGER)");
            return sql.toString();
        }
        /** 创建会话表 */
        public static String getCreateSessionSql() {
            StringBuilder sql = new StringBuilder("CREATE TABLE ");
            sql.append(PrivateTables.T_CHAT_SESSION).append(" (")
                    .append(ChatSessionColumns.SESSION_ID).append(" TEXT PRIMARY KEY,")
                    .append(ChatSessionColumns.SESSION_NAME).append(" TEXT,")
                    .append(ChatSessionColumns.MEMBER_NAME).append(" TEXT,")
                    .append(ChatSessionColumns.MANAGER_ID).append(" INTEGER,")
                    .append(ChatSessionColumns.MEMBER).append(" TEXT,")
                    .append(ChatSessionColumns.UNREAD_COUNT).append(" INTEGER,")
                    .append(ChatSessionColumns.IS_SINGLE_CHAT).append(" INTEGER,")
                    .append(ChatSessionColumns.IS_VISIBLE).append(" INTEGER,")
                    .append(ChatSessionColumns.SYNC_STATUS).append(" INTEGER,")
                    .append(ChatSessionColumns.SET_TOP_SEQ).append(" INTEGER,")
                    .append(ChatSessionColumns.IS_TOP).append(" INTEGER DEFAULT(")
                    .append(0).append("),")
                    .append(ChatSessionColumns.CREATE_TM).append(" TEXT,")
                    .append(ChatSessionColumns.IS_SILENCE).append(" INTEGER,")
                    .append(ChatSessionColumns.REMARK_AS_UNREAD).append(" INTEGER DEFAULT(")
                    .append(0).append("))");
            return sql.toString();
        }
        /** 创建聊天记录表 */
        public static String getCreateMsgRecordSql() {
            StringBuilder sql = new StringBuilder("CREATE TABLE ");
            sql.append(PrivateTables.T_MSG_RECORD).append(" (")
                    .append(ChatMessageColumns.MSG_ID).append(" TEXT PRIMARY KEY,").append(ChatMessageColumns.SESSION_ID).append(" TEXT,")
                    .append(ChatMessageColumns.SENDER_ID).append(" INTEGER,").append(ChatMessageColumns.SENDER_NAME).append(" TEXT,")
                    .append(ChatMessageColumns.SEND_TIME).append(" TEXT,").append(ChatMessageColumns.STATUS).append(" INTEGER,")
                    .append(ChatMessageColumns.MSG_TYPE).append(" INTEGER,").append(ChatMessageColumns.CONTENT).append(" TEXT,")
                    .append(ChatMessageColumns.IS_SEND).append(" INTEGER,").append(ChatMessageColumns.IS_READ).append(" INTEGER,")
                    .append(ChatMessageColumns.IS_RECALLED).append(" INTEGER DEFAULT(").append(0).append("))");
            return sql.toString();
        }

        /** 创建好友添加表 */
        public static String getCreateFriendAdditionSql() {
            StringBuilder sql = new StringBuilder("CREATE TABLE ");
            sql.append(PrivateTables.T_FRIEND_ADDITION).append(" (")
                    .append(FriendAdditionColumns.ID).append(" INTEGER PRIMARY KEY AUTOINCREMENT, ")
                    .append(FriendAdditionColumns.APPLICANT_USER_ID).append(" INTEGER,")
                    .append(FriendAdditionColumns.APPLICANT_HOSPITAL_ID).append(" INTEGER,")
                    .append(FriendAdditionColumns.APPLICANT_NAME).append(" TEXT,").append(FriendAdditionColumns.CONTENT).append(" TEXT,")
                    .append(FriendAdditionColumns.STATUS).append(" INTEGER,").append(FriendAdditionColumns.IS_READ).append(" INTEGER,")
                    .append(FriendAdditionColumns.IS_RECEIVED).append(" INTEGER)");
            return sql.toString();
        }

        /** 创建手机通讯录好友状态表 */
        public static String getCreatePhoneBookFriendStatusSql() {
            StringBuilder sql = new StringBuilder("CREATE TABLE ");
            sql.append(PrivateTables.T_PHONE_BOOK_FRIEND_ADDITION).append(" (")
                    .append(PhoneBookFriendStatusColumns.CONTACT_ID).append(" INTEGER PRIMARY KEY, ")
                    .append(PhoneBookFriendStatusColumns.STATUS).append(" INTEGER)");
            return sql.toString();
        }

        /** 创建随访池患者表 */
        public static String getCreateFollowPatientSql() {
            StringBuilder sql = new StringBuilder("CREATE TABLE ");
            sql.append(PrivateTables.T_FOLLOW_PATIENT).append(" (")
                    .append(FollowPatientColumns.ID).append(" INTEGER AUTO_INCREMENT, ")
                    .append(FollowPatientColumns.USER_ID).append(" INTEGER, ")
                    .append(FollowPatientColumns.HEAD_URL).append(" TEXT,")
                    .append(FollowPatientColumns.MOBILE).append(" TEXT,")
                    .append(FollowPatientColumns.NAME).append(" TEXT,")
                    .append(FollowPatientColumns.FIRST_NAME_PY).append(" TEXT,")
                    .append(FollowPatientColumns.FULL_NAME_PY).append(" TEXT,")
                    .append(FollowPatientColumns.GENDER).append(" INTEGER,")
                    .append(FollowPatientColumns.AGE).append(" INTEGER,")
                    .append(FollowPatientColumns.ADDRESS).append(" TEXT,")
                    .append(FollowPatientColumns.STATUS).append(" INTEGER,")
                    .append(FollowPatientColumns.EMERGENCY_PERSON).append(" TEXT,")
                    .append(FollowPatientColumns.EMERGENCY_MOBILE).append(" TEXT,")
                    .append(FollowPatientColumns.EMERGENCY_RELATIONSHIP).append(" TEXT,")
                    .append(FollowPatientColumns.PLAN_NUM).append(" INTEGER,")
                    .append(FollowPatientColumns.FIRST_DIAGNOSIS).append(" TEXT,")
                    .append(FollowPatientColumns.AUTH_STATUS).append(" INTEGER,")
                    .append(FollowPatientColumns.SHARED_USER_ID).append(" INTEGER,")
                    .append(FollowPatientColumns.SHOW_AT_NEW_PATIENT).append(" INTEGER DEFAULT(")
                    .append(0).append("),")
                    .append(FollowPatientColumns.IS_READ).append(" INTEGER DEFAULT(")
                    .append(0).append("),")
                    .append(FollowPatientColumns.VISITED_HOSPITAL_ID).append(" INTEGER,")
                    .append(FollowPatientColumns.FOLLOW_UP_RELATION_ID).append(" INTEGER,")
                    .append(FollowPatientColumns.ID_CARD).append(" TEXT,")
                    .append(FollowPatientColumns.DATA_VERSION).append(" INTEGER)");
            return sql.toString();
        }

        public static String getCreateSysNotifiSql() {
            StringBuilder sql = new StringBuilder("CREATE TABLE ");
            sql.append(PrivateTables.T_SYS_NOTIFICATION).append("(")
                    .append(SysNotifiColumns.ID).append(" INTEGER PRIMARY KEY AUTOINCREMENT,")
                    .append(SysNotifiColumns.CONTENT).append(" TEXT,")
                    .append(SysNotifiColumns.SEND_TIME).append(" INTEGER,")
                    .append(SysNotifiColumns.IS_READ).append(" INTEGER,")
                    .append(SysNotifiColumns.URL).append(" TEXT);");
            return sql.toString();
        }

        /** 联系人表字段 */
        public static class ContactsColumns {
            /** 联系人ID */
            public static final String USER_ID = "userId";
            /** 医院id */
            public static final String HOSPITAL_ID = "hospitalId";
            /** 医院名称 */
            public static final String HOSPITAL_NAME = "hospitalName";
            /** 部门ID */
            public static final String DEPT_ID = "deptId";
            /** 部门名称 */
            public static final String DEPT_NAME = "deptName";
            /** 姓名 */
            public static final String NAME = "name";
            /** 备注 */
            public static final String REMARK = "remark";
            /** 性别 */
            public static final String GENDER = "gender";
            /** 电话 */
            public static final String PHONE = "phone";
            /** 邮箱 */
            public static final String EMAIL = "email";
            /** 职位 */
            public static final String POSITION = "position";
            /** 姓名首字母 */
            public static final String FIRST_NAME_PY = "firstNamePy";
            /** 姓名全拼字母 */
            public static final String FULL_NAME_PY = "fullNamePy";
            /** 认证状态 */
            public static final String AUTH_STATUS = "authStatus";
            /** 数据版本号 */
            public static final String DATA_VERSION = "dataVersion";
            /** 头像版本号 */
            public static final String HEAD_VERSION = "headVersion";
            /** 头像地址 */
            public static final String HEAD_URL = "headUrl";
            /** 是否已添加为好友 */
            public static final String IS_FRIEND = "isFriend";
        }

        /** 会话表字段 */
        public static class ChatSessionColumns {
            /** 会话ID */
            public static final String SESSION_ID = "sessionId";
            /** 会话名字 */
            public static final String SESSION_NAME = "sessionName";
            /** 成员名称以逗号相隔*/
            public static final String MEMBER_NAME = "memberName";
            /** 管理员id */
            public static final String MANAGER_ID = "managerId";
            /** 会话成员（多个成员以英文逗号分隔） */
            public static final String MEMBER = "member";
            /** 此会话的未读消息数 */
            public static final String UNREAD_COUNT = "unreadCount";
            /** 此会话是否是1对1聊天 */
            public static final String IS_SINGLE_CHAT = "isSingleChat";
            /** 会话是否可见*/
            public static final String IS_VISIBLE = "isVisible";
            /** 此会话是否被标记为未读 */
            public static final String REMARK_AS_UNREAD = "remarkAsUnread";
            /** 同步到通讯录的状态*/
            public static final String SYNC_STATUS = "syncStatus";
            /** 是否置顶*/
            public static final String IS_TOP = "isTop";
            /** 置顶序列*/
            public static final String SET_TOP_SEQ = "setTopSeq";
            /** 消息时间 */
            public static final String CREATE_TM = "createTm";
            /** 静音 */
            public static final String IS_SILENCE = "isSilence";
        }

        /** 聊天记录表字段 */
        public static class ChatMessageColumns {
            /** 消息ID */
            public static final String MSG_ID = "msgId";
            /** 会话ID */
            public static final String SESSION_ID = "sessionId";
            /** 发送人id */
            public static final String SENDER_ID = "senderId";
            /** 发送人名称 */
            public static final String SENDER_NAME = "senderName";
            /** 发送时间 */
            public static final String SEND_TIME = "sendTime";
            /** 消息发送状态 */
            public static final String STATUS = "status";
            /** 消息类型 */
            public static final String MSG_TYPE = "msgType";
            /** 消息内容 或 语音、图片等的保存地址 */
            public static final String CONTENT = "content";
            /** 是否是发送  0：不是  1：是 */
            public static final String IS_SEND = "isSend";
            /** 是否已读  0：不是  1：是 */
            public static final String IS_READ = "isRead";
            /** 是否已被撤回  0：不是  1：是 */
            public static final String IS_RECALLED = "isRecalled";
        }

        /** 好友申请表 */
        public static class FriendAdditionColumns {
            /** 主键id */
            public static final String ID = "_id";
            /** 对方的userId */
            public static final String APPLICANT_USER_ID = "applicantUserId";
            /** 对方的医院id */
            public static final String APPLICANT_HOSPITAL_ID = "applicantHospitalId";
            /** 对方的名字 */
            public static final String APPLICANT_NAME = "applicantName";
            /** 填写的申请内容 */
            public static final String CONTENT = "content";
            /** 此记录的处理状态,同意与否 */
            public static final String STATUS = "status";
            /** 此记录是否是收到 */
            public static final String IS_RECEIVED = "isReceived";
            /** 此记录是否已读  */
            public static final String IS_READ = "isRead";
        }

        /** 手机联系人的好友状态表 */
        public static class PhoneBookFriendStatusColumns {
            /** 手机通讯录中的联系人id */
            public static final String CONTACT_ID = "contactId";
            /** 手机通讯录中的联系人id */
            public static final String STATUS = "status";

        }

        /** 随访池患者表字段 */
        public static class FollowPatientColumns {
            public static final String ID = "_id";
            /** 用户ID */
            public static final String USER_ID = "userId";
            /** 头像地址url(前面需拼上图片服务器地址) */
            public static final String HEAD_URL = "headUrl";
            /** 手机号码 */
            public static final String MOBILE = "mobile";
            /** 姓名 */
            public static final String NAME = "name";
            /** 姓名首字母 */
            public static final String FIRST_NAME_PY = "firstNamePy";
            /** 姓名全拼字母 */
            public static final String FULL_NAME_PY = "fullNamePy";
            /** 性别 */
            public static final String GENDER = "gender";
            /** 年龄 */
            public static final String AGE = "age";
            /** 地址 */
            public static final String ADDRESS = "address";
            /** 患者报到状态 0未认证、1已接受、2待接受 */
            public static final String STATUS = "status";
            /** 紧急联系人姓名 */
            public static final String EMERGENCY_PERSON = "emergencyPerson";
            /** 紧急联系人手机号 */
            public static final String EMERGENCY_MOBILE = "emergencyMobile";
            /** 紧急联系人关系 */
            public static final String EMERGENCY_RELATIONSHIP = "emergencyRelationship";
            /** 随访计划数量 */
            public static final String PLAN_NUM = "planNum";
            /** 第一诊断 */
            public static final String FIRST_DIAGNOSIS = "firstDiagnosis";
            /** 患者认证状态 */
            public static final String AUTH_STATUS = "authStatus";
            /** 共享医生id（由其他医生共享过来） */
            public static final String SHARED_USER_ID = "sharedUserId";
            /** 数据版本号 */
            public static final String DATA_VERSION = "dataVersion";
            /** 是否在患者报到显示 */
            public static final String SHOW_AT_NEW_PATIENT = "showAtNewPatient";
            /** 此记录是否已读（用于患者报到界面） */
            public static final String IS_READ = "isRead";
            /** 患者住院的医院id */
            public static final String VISITED_HOSPITAL_ID = "visitedHospitalId";
            /** 随访关系ID */
            public static final String FOLLOW_UP_RELATION_ID = "followupRelationId";
            /** 身份证 */
            public static final String ID_CARD = "idCard";
        }

        /** 系统通知表字段 */
        public static class SysNotifiColumns {
            /** 主键id */
            public static final String ID = "_id";
            /** 内容 */
            public static final String CONTENT = "content";
            /** 通知发送时间 */
            public static final String SEND_TIME = "sendTime";
            /** 点击后打开的web的url */
            public static final String URL = "url";
            /** 是否已读*/
            public static final String IS_READ = "isRead";

        }

    }
}