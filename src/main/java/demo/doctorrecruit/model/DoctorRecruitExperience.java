package demo.doctorrecruit.model;

import javax.persistence.*;
import java.util.Objects;

//博士招生简历信息的持久化类
@Entity
@Table(name = "doctor_recruit_experience", schema = "doctorrecruit")
public class DoctorRecruitExperience {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "expId")
    private int expId;
    @Basic
    @Column(name = "applyId")
    private int applyId;
    @Basic
    @Column(name = "startEndMon")
    private String startEndMon;
    @Basic
    @Column(name = "placeUnit")
    private String placeUnit;
    @Basic
    @Column(name = "expDuty")
    private String expDuty;
    @Basic
    @Column(name = "dapart")
    private String dapart;

    public int getExpId() {
        return expId;
    }

    public void setExpId(int expId) {
        this.expId = expId;
    }

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }

    public String getStartEndMon() {
        return startEndMon;
    }

    public void setStartEndMon(String startEndMon) {
        this.startEndMon = startEndMon;
    }

    public String getPlaceUnit() {
        return placeUnit;
    }

    public void setPlaceUnit(String placeUnit) {
        this.placeUnit = placeUnit;
    }

    public String getExpDuty() {
        return expDuty;
    }

    public void setExpDuty(String expDuty) {
        this.expDuty = expDuty;
    }

    public String getDapart() {
        return dapart;
    }

    public void setDapart(String dapart) {
        this.dapart = dapart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorRecruitExperience that = (DoctorRecruitExperience) o;
        return expId == that.expId && applyId == that.applyId && Objects.equals(startEndMon, that.startEndMon) && Objects.equals(placeUnit, that.placeUnit) && Objects.equals(expDuty, that.expDuty) && Objects.equals(dapart, that.dapart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expId, applyId, startEndMon, placeUnit, expDuty, dapart);
    }
}
