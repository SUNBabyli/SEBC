package com.siukonda.djplmsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * BOM视图 MA_CODE_DETAIL
 *
 * @author hcx
 * @date 2022-10-14
 */
public class MaCodeDetail {
    private static final long serialVersionUID = 1L;

    /** 记录唯一标识符 */
    private String guid;

    /** 主识符 */
    private String masterguid;

    /** 名称 */
    private String title;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getMasterguid() {
        return masterguid;
    }

    public void setMasterguid(String masterguid) {
        this.masterguid = masterguid;
    }

    public void setTitle(String title)
    {
        this.title = title.split(";")[1];
    }

    public String getTitle()
    {
        return title;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("guid", getGuid())
                .append("masterguid", getMasterguid())
                .append("title", getTitle())
                .toString();
    }
}
