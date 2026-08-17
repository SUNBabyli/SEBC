package com.siukonda.djplmsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djplmsystem.domain.MaClassificationDetail;
import com.siukonda.djplmsystem.domain.vo.DjplmIncludeVo;
import com.siukonda.djplmsystem.mapper.DjplmIncludeVoMapper;
import com.siukonda.djplmsystem.mapper.MaClassificationDetailMapper;
import com.siukonda.djplmsystem.service.IDjplmIncludeVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-11-10 15:42
 */
@Service
@DataSource(value = DataSourceType.DJPLMDB)
public class DjplmIncludeVoServiceImpl implements IDjplmIncludeVoService {

    @Autowired
    private DjplmIncludeVoMapper djplmIncludeVoMapper;

    @Autowired
    private MaClassificationDetailMapper maClassificationDetailMapper;


    List<DjplmIncludeVo> listDjplmIncludeAll=new ArrayList<>();
    Integer inproductrow;

    /**
     * 查找引用的构件信息
     * @param guid 构件guid
     * @return 返回引用构件信息
     */
    @Override
    public List<DjplmIncludeVo> selectComponentIncludeProductByItemGuid(String guid) {
        listDjplmIncludeAll.clear();
        inproductrow = 0;
        List<DjplmIncludeVo> listComponentItself = djplmIncludeVoMapper.selectComponentIncludeProductItself(guid);
        List<MaClassificationDetail> maClassificationDetails = maClassificationDetailMapper.selectMaClassificationDetailAllList();
        // 设置前端唯一码
//        listComponentItself.get(0).setIndexrow("0");
        // 设置子阶码
        listComponentItself.get(0).setSubnum("1");

        listComponentItself.get(0).setClassification(getMaClassificationDetailCF(listComponentItself.get(0).getClassification(),maClassificationDetails));
        // 添加进需要提交的集合中
        listDjplmIncludeAll.add(listComponentItself.get(0));
        // 将这个数据提交给下面递归
        getComponentIncludeProduct(listComponentItself.get(0).getSubguid(),listComponentItself.get(0).getSubnum(),maClassificationDetails);
        maClassificationDetails.clear();
        listComponentItself.clear();
        return listDjplmIncludeAll;
    }

    private List<DjplmIncludeVo> getComponentIncludeProduct(String subguid, String subnum, List<MaClassificationDetail> maClassificationDetails) {
        // 查询传过来的物料所有的父阶
        List<DjplmIncludeVo> listIncludeProduct = djplmIncludeVoMapper.selectComponentIncludeProductParent(subguid);
        // 循环查询的结果
        for (int i = 0; i < listIncludeProduct.size(); i++) {
            // 前端唯一码++
//            inproductrow ++;
//            listIncludeProduct.get(i).setIndexrow(String.valueOf(inproductrow));
            // 提取子阶前面定义的排序数据，并增加此次循环序号
            // 设置当前排序
            listIncludeProduct.get(i).setSubnum(subnum + "." + String.valueOf(i + 1));
            // 设置当前物料的父排序
            listIncludeProduct.get(i).setParentnum(subnum);

            listIncludeProduct.get(i).setClassification(getMaClassificationDetailCF(listIncludeProduct.get(i).getClassification(),maClassificationDetails));
            // 添加进需要提交的集合中
            listDjplmIncludeAll.add(listIncludeProduct.get(i));
            // 判断ID码的开始数据为1则跳出判断
            if(listIncludeProduct.get(i).getSubid().startsWith("1")==false)
            {
                getComponentIncludeProduct(listIncludeProduct.get(i).getSubguid(),listIncludeProduct.get(i).getSubnum(),maClassificationDetails);
            }
        }
        listIncludeProduct.clear();
        return listDjplmIncludeAll;
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
