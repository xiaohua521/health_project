package com.hua.dao;

import com.github.pagehelper.Page;
import com.hua.pojo.Permission;

import java.util.Set;

public interface PermissionDao {

    /**
     * 根据角色id获取权限
     * @param id
     * @return
     */
    Set<Permission> findPermissionListFindByRoleId(Integer id);
    /**
     * 分页查询权限列表
     * @param
     * @return
     */
    Page<Permission> findPage(String queryString);
    /**
     * 根据ID查询权限
     * @param id
     * @return
     */
    Permission findById(Integer id);
    /**
     * 添加权限
     * @param permission
     * @return
     */
    void add(Permission permission);
    /**
     * 根据ID删除权限
     * @param id
     * @return
     */
    void deleteById(Integer id);
    /**
     * 编辑更新权限信息
     * @param permission
     * @return
     */
    void update(Permission permission);
}