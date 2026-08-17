package com.siukonda.djplmsystem.service;

import com.siukonda.djplmsystem.domain.vo.DjplmDrawingVo;

import java.util.List;

/**
 * 获取图纸
 * @project： SEBC
 * @filename： IDjplmDrawingVo
 * @author： hcx
 * @create： 2022/10/22 20:52
 */
public interface IDjplmDrawingVoService {

    /**
     * 根据物料ID查找图纸信息
     * @param itemId 物料ID
     * @return
     */
    public List<DjplmDrawingVo> selectDjplmDrawingVoListByItemid(String itemId);

    /**
     * 根据物料ID检查有没有图纸
     * @param itemId 物料ID
     * @return
     */
    public Boolean checkDrawingExist(String itemId);

    /**
     * 根据文件guid查找图纸信息
     * @param fileGuid 物料ID
     * @return
     */
    public DjplmDrawingVo selectDjplmDrawingVoListByFileGuid(String fileGuid,String fileitemid);

}
