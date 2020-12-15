package com.z.spring.domain;

public class Order {
    private String order_num;
    private String order_date;
    private String cust_id;

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_num='" + order_num + '\'' +
                ", order_date='" + order_date + '\'' +
                ", cust_id='" + cust_id + '\'' +
                '}';
    }
}
