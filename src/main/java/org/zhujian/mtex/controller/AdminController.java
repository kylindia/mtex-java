package org.zhujian.mtex.controller;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.zhujian.mtex.entity.Admin;
import org.zhujian.mtex.service.AdminService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("back/admin")
@Scope("prototype")
public class AdminController {

    @Resource
    AdminService adminService;
    Map<String,Object> map = new HashMap<>();

    @RequestMapping(value = "hello" , method = RequestMethod.GET)
    @ResponseBody
    public String Hello(){
        return "Hello!";
    }

    /**
     * admin列表展现
     * @param pageIndex
     * @param pageSize
     * @param adminName
     * @return
     */
    @RequestMapping(value = "adminList" , method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> listAdmin (@RequestParam(defaultValue="1") Integer pageIndex,
                                         @RequestParam(defaultValue="10")Integer pageSize,String adminName){
        PageHelper.startPage(pageIndex,pageSize);
        List<Admin> list = adminService.findAdmin(adminName);
        Page<Admin> page = (Page<Admin>) list;
        map.put("adminList",list);
        map.put("code",1);
        if (0 != page.getPages()) {
            map.put("Pages", page.getPages());
        } else {
            map.put("Pages", 1);
        }
        map.put("pageSize", pageSize);
        map.put("pageIndex", pageIndex);
        map.put("total", page.getTotal());
        return map;
    }
}
