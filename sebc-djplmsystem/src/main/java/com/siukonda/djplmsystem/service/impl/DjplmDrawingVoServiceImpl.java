package com.siukonda.djplmsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djplmsystem.domain.vo.DjplmDrawingVo;
import com.siukonda.djplmsystem.mapper.DjplmDrawingVoMapper;
import com.siukonda.djplmsystem.service.IDjplmDrawingVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @project： SEBC
 * @filename： DjplmDrawingVoServiceImpl
 * @author： hcx
 * @create： 2022/10/22 20:57
 */
@Service
@DataSource(value = DataSourceType.DJPLMDB)
public class DjplmDrawingVoServiceImpl implements IDjplmDrawingVoService {

    @Autowired
    private DjplmDrawingVoMapper djplmDrawingVoMapper;

    @Override
    public List<DjplmDrawingVo> selectDjplmDrawingVoListByItemid(String itemId) {
        return djplmDrawingVoMapper.selectDjplmDrawingVoListByItemid(itemId);
    }

    @Override
    public Boolean checkDrawingExist(String itemId) {
        if(djplmDrawingVoMapper.checkDrawingNums(itemId)>0){
            return true;
        };
        return false;
    }

    @Override
    public DjplmDrawingVo selectDjplmDrawingVoListByFileGuid(String fileGuid,String fileitemid) {
        return djplmDrawingVoMapper.selectDjplmDrawingVoListByFileGuid(fileGuid,fileitemid);
    }
}
