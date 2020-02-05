package org.zhujian.mtex.service.adminServiceImpl;

import org.springframework.stereotype.Service;
import org.zhujian.mtex.entity.Admin;
import org.zhujian.mtex.entity.AdminExample;
import org.zhujian.mtex.mapper.AdminMapper;
import org.zhujian.mtex.service.AdminService;

import javax.annotation.Resource;
import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminMapper adminMapper;
    @Override
    public List<Admin> findAdmin(String adminName) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminNameLike("%"+adminName+"%");
        return adminMapper.selectByExample(example);
    }
}
