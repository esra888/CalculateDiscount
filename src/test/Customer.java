package test;

import java.util.Date;

public class Customer {
    private String name;
    private boolean member;
    private String memberType;
    private Date customerTime;

    public Customer() {
        this.member = false;
    }

    public Customer(String name, boolean member, String memberType, Date customerTime) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
        this.customerTime = customerTime;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public String getMemberType() {
        return memberType;
    }

    public Date getCustomerTime() {
        return customerTime;
    }
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    public void setCustomerTime(Date CustomerTime) {
        this.customerTime = customerTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                ", customerTime='" + customerTime + '\'' +
                '}';
    }
}

