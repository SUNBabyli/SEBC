package com.siukonda.djplmsystem.mapper;

import com.siukonda.djplmsystem.domain.vo.DjplmDrawingVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @project： SEBC
 * @filename： DjplmDrawingVoMapper
 * @author： hcx
 * @create： 2022/10/22 20:59
 */
public interface DjplmDrawingVoMapper {

    /**
     * 根据物料id查找图纸信息
     * @param itemId 物料id
     * @return
     */
    public List<DjplmDrawingVo> selectDjplmDrawingVoListByItemid(String itemId);

    /**
     * 根据物料ID获取图纸数量
     * @param itemId 物料ID
     * @return
     */
    public Integer checkDrawingNums(String itemId);

    /**
     * 根据文件guid查找图纸信息
     * @param fileGuid 物料guid
     * @return
     */
    public DjplmDrawingVo selectDjplmDrawingVoListByFileGuid(@Param("fileGuid") String fileGuid, @Param("fileitemid") String fileitemid);
}
