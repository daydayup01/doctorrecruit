package demo.doctorrecruit.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

//博士招生缴费订单信息的持久化类
@Entity
@Table(name = "doctor_recruit_order_info", schema = "doctorrecruit")
public class DoctorRecruitOrderInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "orderId")
    private int orderId;
    @Basic
    @Column(name = "orderApplyTime")
    private Timestamp orderApplyTime;
    @Basic
    @Column(name = "orderNum")
    private int orderNum;
    @Basic
    @Column(name = "applyId")
    private int applyId;
    @Basic
    @Column(name = "orderState")
    private String orderState;
    @Basic
    @Column(name = "remark")
    private String remark;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Timestamp getOrderApplyTime() {
        return orderApplyTime;
    }

    public void setOrderApplyTime(Timestamp orderApplyTime) {
        this.orderApplyTime = orderApplyTime;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorRecruitOrderInfo that = (DoctorRecruitOrderInfo) o;
        return orderId == that.orderId && orderNum == that.orderNum && applyId == that.applyId && Objects.equals(orderApplyTime, that.orderApplyTime) && Objects.equals(orderState, that.orderState) && Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderApplyTime, orderNum, applyId, orderState, remark);
    }
}
