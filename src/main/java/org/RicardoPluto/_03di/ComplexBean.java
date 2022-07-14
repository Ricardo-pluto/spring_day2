package org.RicardoPluto._03di;

import org.RicardoPluto._03di.OtherBean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexBean {
    // 简单属性
    private Long id;
    private String name;
    private Boolean sex;
    private BigDecimal salary;
    // 对象属性
    //单个对象属性
    private OtherBean otherBean;
    //多个对象属性
    private List<OtherBean> otherBeanList;
    private Set<String> set;
    private Set<OtherBean> otherBeanSet;

    //下面这个是重点
    private Properties props1;
    private Map<String,String> map1;
    private Map<String,OtherBean> map2;
    private String[] arrays;
    private OtherBean[] otherBeanArrays;
    private List<String> stringList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public List<OtherBean> getOtherBeanList() {
        return otherBeanList;
    }

    public void setOtherBeanList(List<OtherBean> otherBeanList) {
        this.otherBeanList = otherBeanList;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Set<OtherBean> getOtherBeanSet() {
        return otherBeanSet;
    }

    public void setOtherBeanSet(Set<OtherBean> otherBeanSet) {
        this.otherBeanSet = otherBeanSet;
    }

    public Properties getProps1() {
        return props1;
    }

    public void setProps1(Properties props1) {
        this.props1 = props1;
    }

    public Map<String, String> getMap1() {
        return map1;
    }

    public void setMap1(Map<String, String> map1) {
        this.map1 = map1;
    }

    public Map<String, OtherBean> getMap2() {
        return map2;
    }

    public void setMap2(Map<String, OtherBean> map2) {
        this.map2 = map2;
    }

    public String[] getArrays() {
        return arrays;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }

    public OtherBean[] getOtherBeanArrays() {
        return otherBeanArrays;
    }

    public void setOtherBeanArrays(OtherBean[] otherBeanArrays) {
        this.otherBeanArrays = otherBeanArrays;
    }
}
