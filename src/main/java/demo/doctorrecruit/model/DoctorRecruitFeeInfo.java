package demo.doctorrecruit.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

//缴费信息的持久化类
@Entity
@Table(name = "doctor_recruit_fee_info", schema = "doctorrecruit")
public class DoctorRecruitFeeInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "feeId")
    private int feeId;
    @Basic
    @Column(name = "orderNum")
    private String orderNum;
    @Basic
    @Column(name = "feeTime")
    private Timestamp feeTime;
    @Basic
    @Column(name = "feeNum")
    private double feeNum;
    @Basic
    @Column(name = "remark")
    private Integer remark;

    public int getFeeId() {
        return feeId;
    }

    public void setFeeId(int feeId) {
        this.feeId = feeId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Timestamp getFeeTime() {
        return feeTime;
    }

    public void setFeeTime(Timestamp feeTime) {
        this.feeTime = feeTime;
    }

    public double getFeeNum() {
        return feeNum;
    }

    public void setFeeNum(double feeNum) {
        this.feeNum = feeNum;
    }

    public Integer getRemark() {
        return remark;
    }

    public void setRemark(Integer remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorRecruitFeeInfo that = (DoctorRecruitFeeInfo) o;
        return feeId == that.feeId && Double.compare(feeNum, that.feeNum) == 0 && Objects.equals(orderNum, that.orderNum) && Objects.equals(feeTime, that.feeTime) && Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeId, orderNum, feeTime, feeNum, remark);
    }
}
