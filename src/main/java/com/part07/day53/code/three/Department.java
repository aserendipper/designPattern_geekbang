package com.part07.day53.code.three;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/8/14
 * @desc
 */
public class Department extends HumanResource {
    List<HumanResource> subNodes = new ArrayList<>();

    public Department(long id) {
        super(id);
    }

    @Override
    public double calculateSalary() {
        double sum = 0;
        for (HumanResource hr : subNodes) {
            sum += hr.calculateSalary();
        }
        this.salary = sum;
        return sum;
    }
    
    public void addSubNode(HumanResource hr) {
        subNodes.add(hr);
    }
}
