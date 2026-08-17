package com.siukonda.djplmsystem.mapper;

import com.siukonda.djplmsystem.domain.Bomview;
import com.siukonda.djplmsystem.domain.vo.DjplmbomVo;

import java.util.List;

/**
 * 鼎捷PLM产品BOMMapper接口
 * 
 * @author hcx
 * @date 2022-09-23
 */
public interface DjplmbomVoMapper
{
    /**
     *
     * 查询对应的成品BOM表
     * @param bomview BOMVIEW_0三个值都有用
     * @return 单个产品的BOM表
     */
    public List<DjplmbomVo> selectDjplmbomVoListByEnd1(Bomview bomview);

}
