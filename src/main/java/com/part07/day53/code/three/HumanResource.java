package com.part07.day53.code.three;

/**
 * @author aserendipper
 * @date 2023/8/14
 * @desc
 */
public abstract class HumanResource {
    protected long id;
    protected double salary;
    
    public HumanResource(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public abstract double calculateSalary();
}
