package com.siukonda.web.controller.djplmsystem;

import com.siukonda.common.annotation.Log;
import com.siukonda.common.config.SebcConfig;
import com.siukonda.common.core.controller.BaseController;
import com.siukonda.common.core.domain.AjaxResult;
import com.siukonda.common.enums.BusinessType;
import com.siukonda.djplmsystem.domain.vo.DjplmDrawingVo;
import com.siukonda.djplmsystem.service.IDjplmDrawingVoService;
import com.siukonda.web.controller.common.CommonController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @project： SEBC
 * @filename： DjplmDrawingVoController
 * @author： hcx
 * @create： 2022/10/22 22:51
 */
@RestController
@RequestMapping("/djplmsystem/djplmdrawing")
public class DjplmDrawingVoController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(CommonController.class);

    @Autowired
    private IDjplmDrawingVoService djplmDrawingVoService;

    @GetMapping(value = "/{itemid}")
    public AjaxResult getDrawingListByitemid(@PathVariable String itemid) {
        return AjaxResult.success(djplmDrawingVoService.selectDjplmDrawingVoListByItemid(itemid));
    }

    /**
     * 下载图纸
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:djplmdrawing:download')")
    @Log(title = "图纸下载", businessType = BusinessType.DOWNLOAD)
    @GetMapping("/downloadDrawing")
    public void downloadDrawing(HttpServletResponse response, String fileguid , String fileitemid) throws Exception {
        System.out.println(fileguid);
        System.out.println(fileitemid);
        DjplmDrawingVo djplmDrawingVo = djplmDrawingVoService.selectDjplmDrawingVoListByFileGuid(fileguid,fileitemid);

        // 本地资源路径
        String localPath = SebcConfig.getDrawingDownloadPath();
        // 数据库资源地址
        String downloadPath = localPath + djplmDrawingVo.getFilepath();

        String fileFullPath = downloadPath + "\\" + djplmDrawingVo.getFileentityname();
        System.out.println(fileFullPath);
        if (fileFullPath != null) {
            // 设置文件路径
            File filefp = new File(fileFullPath);
            if (filefp.exists()) {
                response.setHeader("content-disposition", "attachment;filename="
                        + URLEncoder.encode(djplmDrawingVo.getFileuiname(), "UTF-8"));
                response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
                response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(filefp);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int len = 0;
                    while ((len = bis.read(buffer)) > 0) {
                        os.write(buffer, 0, len);
                    }
                    bis.close();
                } catch (Exception e) {
                    log.error("文件找不到！请联系管理员!", e);
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
