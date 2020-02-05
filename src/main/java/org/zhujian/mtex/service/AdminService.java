package org.zhujian.mtex.service;

import org.zhujian.mtex.entity.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> findAdmin(String adminName);
}
