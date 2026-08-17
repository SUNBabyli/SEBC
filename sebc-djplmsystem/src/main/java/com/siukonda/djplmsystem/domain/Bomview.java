package com.siukonda.djplmsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * BOM视图 BOMVIEW_0
 *
 * @author hcx
 * @date 2022-10-06
 */
public class Bomview
{
    private static final long serialVersionUID = 1L;

    /** 记录唯一标识符 */
    private String guid;

    /** 名称标识 */
    private String name;

    /** item_0.guid一样的 */
    private String end1;

    /** 物料编码 */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnd1() {
        return end1;
    }

    public void setEnd1(String end1) {
        this.end1 = end1;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("guid", getGuid())
                .append("name", getName())
                .append("end1", getEnd1())
                .append("id",getId())
                .toString();
    }
}