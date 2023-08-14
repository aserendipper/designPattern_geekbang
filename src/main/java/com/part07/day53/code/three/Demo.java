package com.part07.day53.code.three;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/8/14
 * @desc
 */
public class Demo {
    private static final long ORGANIZATION_ROOT_ID = 1001;
    private Department department;
    private Employee employee;
    
    public void buildOrganization() {
        Department rootDepartment = new Department(ORGANIZATION_ROOT_ID);
        buildOrganization(rootDepartment);
    }
    
    private void buildOrganization(Department department) {
        List<Long> subDepartmentIds = new ArrayList<>();
        // 查询下一级部门
        for (Long subDepartmentId : subDepartmentIds) {
            Department subDepartment = new Department(subDepartmentId);
            department.addSubNode(subDepartment);
            // 递归构建
            buildOrganization(subDepartment);
        }
        List<Long> employeeIds = new ArrayList<>();
        // 查询本部门员工
        for (Long employeeId : employeeIds) {
            // 查询员工薪资
            double salary = 0;
            Employee employee = new Employee(employeeId, salary);
            department.addSubNode(employee);
        }
    }
}
