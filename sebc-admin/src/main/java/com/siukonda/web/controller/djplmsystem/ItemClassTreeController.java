package com.siukonda.web.controller.djplmsystem;

import com.siukonda.common.core.controller.BaseController;
import com.siukonda.common.core.domain.AjaxResult;
import com.siukonda.djplmsystem.domain.MaClassificationDetail;
import com.siukonda.djplmsystem.domain.MaClassificationMaster;
import com.siukonda.djplmsystem.service.IItemClassTreeVoService;
import com.siukonda.djplmsystem.service.IMaClassificationDetailService;
import com.siukonda.djplmsystem.service.IMaClassificationMasterService;
import com.siukonda.djplmsystem.domain.vo.ItemClassTreeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义查询物料列表 ItemClassTreeController
 * @author zhaoyang
 * @create 2022-08-16 15:58
 */
@RestController
@RequestMapping("/djplmsystem/itemclass")
public class ItemClassTreeController extends BaseController {
    @Autowired
    private IMaClassificationDetailService maClassificationDetailService;

    @Autowired
    private IMaClassificationMasterService maClassificationMasterService;

    @Autowired
    private IItemClassTreeVoService itemClassTreeVoService;

    /**
     * 获取分类表下拉树列表
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:itemclasstree:list')")
    @GetMapping("/itemclasstreeselect")
    public AjaxResult treeselect(){
        // 一、一组主要分类目录
        // 1、先将要显示的主要分类数据拿出
        List<ItemClassTreeVo> itemClassTreeVoLists= new ArrayList<>();
        List<String> macimguidList= new ArrayList<String>();
        // 成品 FA04ED1B264F4F98B8988525341D61DA
        macimguidList.add("FA04ED1B264F4F98B8988525341D61DA");
        // 部件 E6996DF9B4CA43DBBA5A4BCA0B96A7C0
        macimguidList.add("E6996DF9B4CA43DBBA5A4BCA0B96A7C0");
        // 零件 665910093FA0404085B3DECC3A6AD274
        macimguidList.add("665910093FA0404085B3DECC3A6AD274");
        // 外购件 D80443D136E54916A6CD2C5A00506454
        macimguidList.add("D80443D136E54916A6CD2C5A00506454");
        // 原材料 EDC4E625494C49E9BDBE157280ACFEED
        macimguidList.add("EDC4E625494C49E9BDBE157280ACFEED");
        List<MaClassificationMaster> macimList = maClassificationMasterService.selectMacimListByGuid(macimguidList);
        for (int i = 0; i < macimList.size(); i++) {
            itemClassTreeVoLists.add(new ItemClassTreeVo(macimList.get(i).getGuid(),null,macimList.get(i).getTitle(),null,"master"));
        }
        // 二、二级主要分类
        // 2、根据主要分类再将对应的子分类数据拿出
        List<MaClassificationDetail> macidList = maClassificationDetailService.selectMacidListByMasterfk(macimguidList);
        // HashSet<String> macidGuidSet = new HashSet<String>(macidList.size());
        // List<String> macidGuidList = new ArrayList<String>(macidList.size());
        // for (MaClassificationDetail maClassificationDetail : macidList) {
        //     if(macidGuidSet.add(maClassificationDetail.getGuid())){
        //         macidGuidList.add(maClassificationDetail.getGuid());
        //     }
        // }
        for (int i =macidList.size()-1; i >=0 ; --i) {
            if(null == macidList.get(i).getParentguid()){
                // 将子分类当中父类标识为空的将内容删除，或者添加对应的父标识
                switch (macidList.get(i).getMasterfk()){
                    // 成品
                    case "FA04ED1B264F4F98B8988525341D61DA":
                        macidList.get(i).setParentguid("FA04ED1B264F4F98B8988525341D61DA");
                        break;
                    // 部件
                    case "E6996DF9B4CA43DBBA5A4BCA0B96A7C0":
                        macidList.get(i).setParentguid("E6996DF9B4CA43DBBA5A4BCA0B96A7C0");
                        break;
                    // 零件
                    case "665910093FA0404085B3DECC3A6AD274":
                        macidList.get(i).setParentguid("665910093FA0404085B3DECC3A6AD274");
                        break;
                    // 原材料
                    case "EDC4E625494C49E9BDBE157280ACFEED":
                        macidList.get(i).setParentguid("EDC4E625494C49E9BDBE157280ACFEED");
                        break;
                    // 外购件
                    case "D80443D136E54916A6CD2C5A00506454":
                        macidList.get(i).setParentguid("D80443D136E54916A6CD2C5A00506454");
                        break;
                    default:
                        macidList.remove(i);
                        break;
                }
            }
            itemClassTreeVoLists.add(new ItemClassTreeVo(macidList.get(i).getGuid(),macidList.get(i).getMasterfk(),macidList.get(i).getCode()+" "+macidList.get(i).getTitle(),macidList.get(i).getParentguid(),"detail"));
        }
        // // 三、产品物料主要分类下的物料明细
        // List<Item0> item0List = iItem0Service.selectItem0ListByclassification(macidGuidList);
        // for (int i = 0; i < item0List.size(); i++) {
        //     productTreeVoLists.add(new ProductTreeVo(item0List.get(i).getGuid(),null,item0List.get(i).getId()+" "+item0List.get(i).getF000175(),item0List.get(i).getClassification(),"item"));
        // }
        return AjaxResult.success(itemClassTreeVoService.buildItemClassTreeSelect(itemClassTreeVoLists));
    }
}
