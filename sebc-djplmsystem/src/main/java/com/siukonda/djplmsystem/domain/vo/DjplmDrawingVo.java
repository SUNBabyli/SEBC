package com.siukonda.djplmsystem.domain.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @project：    SEBC
 * @filename：   DjplmDrawingVo
 * @author：     hcx
 * @create：     2022/10/22 17:13
 */
public class DjplmDrawingVo {

    private static final long serialVersionUID = 1L;

    /** 物料唯一标识 */
    private String guid;

    /** 物料料号 */
    private String itemid;

    /** 文件名 */
    private String fileid;

    /** 文件唯一标识 */
    private String fileguid;

    /** 文件对象 */
    private String fileobject;

    /** 版本号 */
    private String filerevisionid;

    /** 文件全名 */
    private String fileuiname;

    /** 文件路径 */
    private String filepath;

    /** 实体文件 */
    private String fileentityname;

    /** 文件类型 */
    private String filetype;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public String getFileguid() {
        return fileguid;
    }

    public void setFileguid(String fileguid) {
        this.fileguid = fileguid;
    }

    public String getFileobject() {
        return fileobject;
    }

    public void setFileobject(String fileobject) {
        this.fileobject = fileobject;
    }

    public String getFilerevisionid() {
        return filerevisionid;
    }

    public void setFilerevisionid(String filerevisionid) {
        this.filerevisionid = filerevisionid;
    }

    public String getFileuiname() {
        return fileuiname;
    }

    public void setFileuiname(String fileuiname) {
        this.fileuiname = fileuiname;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFileentityname() {
        return fileentityname;
    }

    public void setFileentityname(String fileentityname) {
        this.fileentityname = fileentityname;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("guid",getGuid())
                .append("itemid",getItemid())
                .append("fileid",getFileid())
                .append("fileguid",getFileguid())
                .append("fileobject",getFileobject())
                .append("filerevisionid",getFilerevisionid())
                .append("filename",getFileuiname())
                .append("filepath",getFilepath())
                .append("fileentityname",getFileentityname())
                .append("filetype",getFiletype())
                .toString();
    }
}
