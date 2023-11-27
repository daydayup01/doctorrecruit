package demo.doctorrecruit.model;

import javax.persistence.*;
import java.util.Objects;

//博士生导师信息的持久化类
@Entity
@Table(name = "doctor_recruit_major_tutor", schema = "doctorrecruit")
public class DoctorRecruitMajorTutor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "doctorRectuitId")
    private int doctorRectuitId;
    @Basic
    @Column(name = "collegeId")
    private int collegeId;
    @Basic
    @Column(name = "majorId")
    private int majorId;
    @Basic
    @Column(name = "tutorId")
    private int tutorId;
    @Basic
    @Column(name = "researchDirect")
    private String researchDirect;
    @Basic
    @Column(name = "year")
    private String year;

    public int getDoctorRectuitId() {
        return doctorRectuitId;
    }

    public void setDoctorRectuitId(int doctorRectuitId) {
        this.doctorRectuitId = doctorRectuitId;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public int getTutorId() {
        return tutorId;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

    public String getResearchDirect() {
        return researchDirect;
    }

    public void setResearchDirect(String researchDirect) {
        this.researchDirect = researchDirect;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorRecruitMajorTutor that = (DoctorRecruitMajorTutor) o;
        return doctorRectuitId == that.doctorRectuitId && collegeId == that.collegeId && majorId == that.majorId && tutorId == that.tutorId && Objects.equals(researchDirect, that.researchDirect) && Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorRectuitId, collegeId, majorId, tutorId, researchDirect, year);
    }
}
