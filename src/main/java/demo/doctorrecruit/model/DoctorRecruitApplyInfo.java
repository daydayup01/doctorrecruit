package demo.doctorrecruit.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

//博士申请表的持久化类
@Entity
@Table(name = "doctor_recruit_apply_info", schema = "doctorrecruit")
public class DoctorRecruitApplyInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "applyId")
    private int applyId;
    @Basic
    @Column(name = "year")
    private String year;
    @Basic
    @Column(name = "applyNum")
    private String applyNum;
    @Basic
    @Column(name = "applyType")
    private String applyType;
    @Basic
    @Column(name = "peorsonId")
    private int peorsonId;
    @Basic
    @Column(name = "devoteMajor")
    private String devoteMajor;
    @Basic
    @Column(name = "workProvince")
    private String workProvince;
    @Basic
    @Column(name = "workCity")
    private String workCity;
    @Basic
    @Column(name = "workUnit")
    private String workUnit;
    @Basic
    @Column(name = "foreignLangue")
    private String foreignLangue;
    @Basic
    @Column(name = "bachelorMajor")
    private String bachelorMajor;
    @Basic
    @Column(name = "masterCultivateUnitId")
    private String masterCultivateUnitId;
    @Basic
    @Column(name = "masterMajorId")
    private int masterMajorId;
    @Basic
    @Column(name = "masterDate")
    private String masterDate;
    @Basic
    @Column(name = "masterDegreeForm")
    private String masterDegreeForm;
    @Basic
    @Column(name = "majorId")
    private int majorId;
    @Basic
    @Column(name = "tutorId")
    private int tutorId;
    @Basic
    @Column(name = "researchDirection")
    private String researchDirection;
    @Basic
    @Column(name = "articles")
    private String articles;
    @Basic
    @Column(name = "majorNote")
    private String majorNote;
    @Basic
    @Column(name = "score459")
    private double score459;
    @Basic
    @Column(name = "score545")
    private double score545;
    @Basic
    @Column(name = "score546")
    private double score546;
    @Basic
    @Column(name = "score548")
    private double score548;
    @Basic
    @Column(name = "score549")
    private double score549;
    @Basic
    @Column(name = "score550")
    private double score550;
    @Basic
    @Column(name = "certificateNo")
    private String certificateNo;
    @Basic
    @Column(name = "scoreRemark")
    private String scoreRemark;
    @Basic
    @Column(name = "totalScore")
    private double totalScore;
    @Basic
    @Column(name = "enterCheckState")
    private int enterCheckState;
    @Basic
    @Column(name = "enterCheckDate")
    private Timestamp enterCheckDate;
    @Basic
    @Column(name = "studyState")
    private int studyState;
    @Basic
    @Column(name = "studyStateDate")
    private Timestamp studyStateDate;
    @Basic
    @Column(name = "feeNum")
    private double feeNum;
    @Basic
    @Column(name = "feeState")
    private int feeState;
    @Basic
    @Column(name = "feeApplyTime")
    private Timestamp feeApplyTime;
    @Basic
    @Column(name = "feeTime")
    private Timestamp feeTime;
    @Basic
    @Column(name = "examRoomId")
    private int examRoomId;
    @Basic
    @Column(name = "examClassRoomNum")
    private String examClassRoomNum;
    @Basic
    @Column(name = "examRoomNum")
    private String examRoomNum;
    @Basic
    @Column(name = "examSeatNum")
    private String examSeatNum;
    @Basic
    @Column(name = "examNo")
    private String examNo;
    @Basic
    @Column(name = "checkTime")
    private Timestamp checkTime;
    @Basic
    @Column(name = "checkState")
    private int checkState;
    @Basic
    @Column(name = "photoAttachId")
    private int photoAttachId;
    @Basic
    @Column(name = "orderNums")
    private String orderNums;
    @Basic
    @Column(name = "enrollDownloadTime")
    private String enrollDownloadTime;

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(String applyNum) {
        this.applyNum = applyNum;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public int getPeorsonId() {
        return peorsonId;
    }

    public void setPeorsonId(int peorsonId) {
        this.peorsonId = peorsonId;
    }

    public String getDevoteMajor() {
        return devoteMajor;
    }

    public void setDevoteMajor(String devoteMajor) {
        this.devoteMajor = devoteMajor;
    }

    public String getWorkProvince() {
        return workProvince;
    }

    public void setWorkProvince(String workProvince) {
        this.workProvince = workProvince;
    }

    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public String getForeignLangue() {
        return foreignLangue;
    }

    public void setForeignLangue(String foreignLangue) {
        this.foreignLangue = foreignLangue;
    }

    public String getBachelorMajor() {
        return bachelorMajor;
    }

    public void setBachelorMajor(String bachelorMajor) {
        this.bachelorMajor = bachelorMajor;
    }

    public String getMasterCultivateUnitId() {
        return masterCultivateUnitId;
    }

    public void setMasterCultivateUnitId(String masterCultivateUnitId) {
        this.masterCultivateUnitId = masterCultivateUnitId;
    }

    public int getMasterMajorId() {
        return masterMajorId;
    }

    public void setMasterMajorId(int masterMajorId) {
        this.masterMajorId = masterMajorId;
    }

    public String getMasterDate() {
        return masterDate;
    }

    public void setMasterDate(String masterDate) {
        this.masterDate = masterDate;
    }

    public String getMasterDegreeForm() {
        return masterDegreeForm;
    }

    public void setMasterDegreeForm(String masterDegreeForm) {
        this.masterDegreeForm = masterDegreeForm;
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

    public String getResearchDirection() {
        return researchDirection;
    }

    public void setResearchDirection(String researchDirection) {
        this.researchDirection = researchDirection;
    }

    public String getArticles() {
        return articles;
    }

    public void setArticles(String articles) {
        this.articles = articles;
    }

    public String getMajorNote() {
        return majorNote;
    }

    public void setMajorNote(String majorNote) {
        this.majorNote = majorNote;
    }

    public double getScore459() {
        return score459;
    }

    public void setScore459(double score459) {
        this.score459 = score459;
    }

    public double getScore545() {
        return score545;
    }

    public void setScore545(double score545) {
        this.score545 = score545;
    }

    public double getScore546() {
        return score546;
    }

    public void setScore546(double score546) {
        this.score546 = score546;
    }

    public double getScore548() {
        return score548;
    }

    public void setScore548(double score548) {
        this.score548 = score548;
    }

    public double getScore549() {
        return score549;
    }

    public void setScore549(double score549) {
        this.score549 = score549;
    }

    public double getScore550() {
        return score550;
    }

    public void setScore550(double score550) {
        this.score550 = score550;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getScoreRemark() {
        return scoreRemark;
    }

    public void setScoreRemark(String scoreRemark) {
        this.scoreRemark = scoreRemark;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public int getEnterCheckState() {
        return enterCheckState;
    }

    public void setEnterCheckState(int enterCheckState) {
        this.enterCheckState = enterCheckState;
    }

    public Timestamp getEnterCheckDate() {
        return enterCheckDate;
    }

    public void setEnterCheckDate(Timestamp enterCheckDate) {
        this.enterCheckDate = enterCheckDate;
    }

    public int getStudyState() {
        return studyState;
    }

    public void setStudyState(int studyState) {
        this.studyState = studyState;
    }

    public Timestamp getStudyStateDate() {
        return studyStateDate;
    }

    public void setStudyStateDate(Timestamp studyStateDate) {
        this.studyStateDate = studyStateDate;
    }

    public double getFeeNum() {
        return feeNum;
    }

    public void setFeeNum(double feeNum) {
        this.feeNum = feeNum;
    }

    public int getFeeState() {
        return feeState;
    }

    public void setFeeState(int feeState) {
        this.feeState = feeState;
    }

    public Timestamp getFeeApplyTime() {
        return feeApplyTime;
    }

    public void setFeeApplyTime(Timestamp feeApplyTime) {
        this.feeApplyTime = feeApplyTime;
    }

    public Timestamp getFeeTime() {
        return feeTime;
    }

    public void setFeeTime(Timestamp feeTime) {
        this.feeTime = feeTime;
    }

    public int getExamRoomId() {
        return examRoomId;
    }

    public void setExamRoomId(int examRoomId) {
        this.examRoomId = examRoomId;
    }

    public String getExamClassRoomNum() {
        return examClassRoomNum;
    }

    public void setExamClassRoomNum(String examClassRoomNum) {
        this.examClassRoomNum = examClassRoomNum;
    }

    public String getExamRoomNum() {
        return examRoomNum;
    }

    public void setExamRoomNum(String examRoomNum) {
        this.examRoomNum = examRoomNum;
    }

    public String getExamSeatNum() {
        return examSeatNum;
    }

    public void setExamSeatNum(String examSeatNum) {
        this.examSeatNum = examSeatNum;
    }

    public String getExamNo() {
        return examNo;
    }

    public void setExamNo(String examNo) {
        this.examNo = examNo;
    }

    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    public int getCheckState() {
        return checkState;
    }

    public void setCheckState(int checkState) {
        this.checkState = checkState;
    }

    public int getPhotoAttachId() {
        return photoAttachId;
    }

    public void setPhotoAttachId(int photoAttachId) {
        this.photoAttachId = photoAttachId;
    }

    public String getOrderNums() {
        return orderNums;
    }

    public void setOrderNums(String orderNums) {
        this.orderNums = orderNums;
    }

    public String getEnrollDownloadTime() {
        return enrollDownloadTime;
    }

    public void setEnrollDownloadTime(String enrollDownloadTime) {
        this.enrollDownloadTime = enrollDownloadTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorRecruitApplyInfo that = (DoctorRecruitApplyInfo) o;
        return applyId == that.applyId && peorsonId == that.peorsonId && masterMajorId == that.masterMajorId && majorId == that.majorId && tutorId == that.tutorId && Double.compare(score459, that.score459) == 0 && Double.compare(score545, that.score545) == 0 && Double.compare(score546, that.score546) == 0 && Double.compare(score548, that.score548) == 0 && Double.compare(score549, that.score549) == 0 && Double.compare(score550, that.score550) == 0 && Double.compare(totalScore, that.totalScore) == 0 && enterCheckState == that.enterCheckState && studyState == that.studyState && Double.compare(feeNum, that.feeNum) == 0 && feeState == that.feeState && examRoomId == that.examRoomId && checkState == that.checkState && photoAttachId == that.photoAttachId && Objects.equals(year, that.year) && Objects.equals(applyNum, that.applyNum) && Objects.equals(applyType, that.applyType) && Objects.equals(devoteMajor, that.devoteMajor) && Objects.equals(workProvince, that.workProvince) && Objects.equals(workCity, that.workCity) && Objects.equals(workUnit, that.workUnit) && Objects.equals(foreignLangue, that.foreignLangue) && Objects.equals(bachelorMajor, that.bachelorMajor) && Objects.equals(masterCultivateUnitId, that.masterCultivateUnitId) && Objects.equals(masterDate, that.masterDate) && Objects.equals(masterDegreeForm, that.masterDegreeForm) && Objects.equals(researchDirection, that.researchDirection) && Objects.equals(articles, that.articles) && Objects.equals(majorNote, that.majorNote) && Objects.equals(certificateNo, that.certificateNo) && Objects.equals(scoreRemark, that.scoreRemark) && Objects.equals(enterCheckDate, that.enterCheckDate) && Objects.equals(studyStateDate, that.studyStateDate) && Objects.equals(feeApplyTime, that.feeApplyTime) && Objects.equals(feeTime, that.feeTime) && Objects.equals(examClassRoomNum, that.examClassRoomNum) && Objects.equals(examRoomNum, that.examRoomNum) && Objects.equals(examSeatNum, that.examSeatNum) && Objects.equals(examNo, that.examNo) && Objects.equals(checkTime, that.checkTime) && Objects.equals(orderNums, that.orderNums) && Objects.equals(enrollDownloadTime, that.enrollDownloadTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyId, year, applyNum, applyType, peorsonId, devoteMajor, workProvince, workCity, workUnit, foreignLangue, bachelorMajor, masterCultivateUnitId, masterMajorId, masterDate, masterDegreeForm, majorId, tutorId, researchDirection, articles, majorNote, score459, score545, score546, score548, score549, score550, certificateNo, scoreRemark, totalScore, enterCheckState, enterCheckDate, studyState, studyStateDate, feeNum, feeState, feeApplyTime, feeTime, examRoomId, examClassRoomNum, examRoomNum, examSeatNum, examNo, checkTime, checkState, photoAttachId, orderNums, enrollDownloadTime);
    }
}
