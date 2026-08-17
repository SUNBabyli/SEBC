package com.siukonda.djerpsystem.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.siukonda.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 用户对象 sys_user
 * 
 * @author ruoyi
 */
public class ErpUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */

    private String user_ID;

    /** 登录账号 */
    private String logonname;

    /** 用户名 */
    private String user_NAME;

    /** 最后登录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date logontime;


    public ErpUser()
    {

    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getLogonname() {
        return logonname;
    }

    public void setLogonname(String logonname) {
        this.logonname = logonname;
    }

    public String getUser_NAME() {
        return user_NAME;
    }

    public void setUser_NAME(String user_NAME) {
        this.user_NAME = user_NAME;
    }

    public Date getLogontime() {
        return logontime;
    }

    public void setLogontime(Date logontime) {
        this.logontime = logontime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("user_ID", getUser_ID())
            .append("logonname", getLogonname())
            .append("user_NAME", getUser_NAME())
            .append("logontime", getLogontime())
            .toString();
    }
}
