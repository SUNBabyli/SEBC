package com.siukonda.djplmsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djplmsystem.domain.Bomview;
import com.siukonda.djplmsystem.domain.MaClassificationDetail;
import com.siukonda.djplmsystem.domain.MaCodeDetail;
import com.siukonda.djplmsystem.domain.vo.DjplmbomVo;
import com.siukonda.djplmsystem.mapper.DjplmbomVoMapper;
import com.siukonda.djplmsystem.mapper.MaClassificationDetailMapper;
import com.siukonda.djplmsystem.mapper.MaCodeDetailMapper;
import com.siukonda.djplmsystem.service.IDjplmbomVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 鼎捷PLM产品BOMService业务层处理
 * 
 * @author hcx
 * @date 2022-10-15
 */
@Service
@DataSource(value = DataSourceType.DJPLMDB)
public class DjplmbomVoServiceImpl implements IDjplmbomVoService
{
    @Autowired
    private DjplmbomVoMapper djplmbomVoMapper;

    @Autowired
    private MaCodeDetailMapper maCodeDetailMapper;

    @Autowired
    private MaClassificationDetailMapper maClassificationDetailMapper;

    @Autowired
    private DjplmDrawingVoServiceImpl djplmDrawingVoService;


    /**
     *
     * 查询对应的成品BOM表
     * @param bomview BOMVIEW_0三个值都有用
     * @return 单个产品的BOM表
     */
    @Override
    public List<DjplmbomVo> selectDjplmbomVoListByEnd1(Bomview bomview) {
        List<DjplmbomVo> djplmbomVoList = new ArrayList<>();

        // 先将数据库中获取到的数据去重
        // List<DjplmbomVo> djplmbomVoListbybomview = djplmbomVoMapper.selectDjplmbomVoListByEnd1(bomview);
        // List<DjplmbomVo> djplmbomVos = new ArrayList<>();
        // djplmbomVoListbybomview.stream().forEach( b -> {
        //     if(!djplmbomVos.contains(b)){
        //         djplmbomVos.add(b);
        //     }
        // });
        List<DjplmbomVo> djplmbomVos = djplmbomVoMapper.selectDjplmbomVoListByEnd1(bomview);
        // List<MaCodeDetail> maCodeDetails = maCodeDetailMapper.selectMaCodeDetailList();
        List<MaClassificationDetail> maClassificationDetails = maClassificationDetailMapper.selectMaClassificationDetailAllList();
        for (DjplmbomVo djplmbomVo : djplmbomVos) {
            // 查找最顶层机
            if(djplmbomVo.getParentguid() == null){
                String indexRow = "";
                // 设置层阶码
                djplmbomVo.setIndexrow(indexRow);
                djplmbomVo.setParentnum("0");
                djplmbomVo.setSubnum("1");
                // 设置单位
                // djplmbomVo.setZdw(getMaCodeDetailTitle(djplmbomVo.getZdw(),maCodeDetails));
                // 添加父信息
                djplmbomVoList.add(djplmbomVo);
                djplmbomVo.setShowfalg(true);
                // 将所有的子迭代出来
                List<DjplmbomVo> getplmSubBomList = getSubBom(indexRow, djplmbomVo.getSubnum(),djplmbomVo,djplmbomVos);
                // 添加所有迭代好的子信息
                djplmbomVoList.addAll(getplmSubBomList);
                // if(getplmSubBomList.size() > 0){
                //     for (DjplmbomVo subbom : getplmSubBomList) {
                //         if(!djplmbomVoList.contains(subbom)){
                //             djplmbomVoList.add(subbom);
                //         }
                //     }
                // }
            }
        }
        List<DjplmbomVo> djplmbomVoListOk = new ArrayList<>();
        for (DjplmbomVo djplmbomVo : djplmbomVoList) {
            // 设置单位
            // djplmbomVo.setZdw(getMaCodeDetailTitle(djplmbomVo.getZdw(),maCodeDetails));
            // 设置分类
            djplmbomVo.setClassification(getMaClassificationDetailCF(djplmbomVo.getClassification(),maClassificationDetails));
            // 设置品号类型
            // djplmbomVo.setSourcetype(getMaCodeDetailTitle(djplmbomVo.getSourcetype(),maCodeDetails));
            // 设置BOM工序
            // djplmbomVo.setProcess(getMaCodeDetailTitle(djplmbomVo.getProcess(),maCodeDetails));
            djplmbomVo.setCheckDrawingExist(djplmbomVo.getDrawingnum() > 0 ? true : false);
            djplmbomVoListOk.add(djplmbomVo);
        }
        djplmbomVos.clear();
        maClassificationDetails.clear();
        djplmbomVoList.clear();
        subBomList.clear();
        return djplmbomVoListOk;
    }


    List<DjplmbomVo> subBomList = new ArrayList<>();
    String subIndexRow = "";
    String subNumRow = "";
    private List<DjplmbomVo> getSubBom(String indexRow, String subnum,DjplmbomVo djplmbomVo, List<DjplmbomVo> djplmbomVos) {
        int j = 0;
        for (int i = 0; i < djplmbomVos.size(); i++) {
            if(djplmbomVo.getSubguid().equals(djplmbomVos.get(i).getParentguid())){
                if(!djplmbomVos.get(i).getShowfalg()) {
                    j++;
                    subNumRow = subnum + "." + String.valueOf(j);
                    if (indexRow == "") {
                        subIndexRow = String.valueOf(j);
                    } else {
                        subIndexRow = indexRow + "." + String.valueOf(j);
                    }
                    djplmbomVos.get(i).setParentnum(subnum);
                    if(subBomList.contains(djplmbomVos.get(i))){
                        djplmbomVos.get(i).setParentnum(null);
                        continue;
                    }
                    // DjplmbomVo djplmbomVo1 = new DjplmbomVo();
                    // djplmbomVo1 = djplmbomVos.get(i);
                    djplmbomVos.get(i).setIndexrow(subIndexRow);
                    // djplmbomVos.get(i).setParentnum(subnum);
                    djplmbomVos.get(i).setSubnum(subNumRow);
                    subBomList.add(djplmbomVos.get(i)); //这里认为是有问题的
                    djplmbomVos.get(i).setShowfalg(true);
                    getSubBom(subIndexRow, subNumRow,djplmbomVos.get(i), djplmbomVos);
                }
            }
        }
        return subBomList;
    }

    /**
     * 获取对应的分类字段中文名称
     * @param guid 提供的guid值
     * @param maCodeDetails 分类码表
     * @return
     */
    private String getMaCodeDetailTitle(String guid, List<MaCodeDetail> maCodeDetails) {
        for (MaCodeDetail maCodeDetail : maCodeDetails) {
            if(maCodeDetail.getGuid().equals(guid)){
                return maCodeDetail.getTitle();
            }
        }
        return "";
    }

    /**
     * 获取对应的分类字段中文名称
     * @param classification 提供classification分类码
     * @param maClassificationDetails 分类码表
     * @return
     */
    private String getMaClassificationDetailCF(String classification, List<MaClassificationDetail> maClassificationDetails) {
        for (MaClassificationDetail maClassificationDetail : maClassificationDetails) {
            if(maClassificationDetail.getGuid().equals(classification)){
                return maClassificationDetail.getTitle() + "[" +maClassificationDetail.getCode() +"]";
            }
        }
        return "";
    }

}
