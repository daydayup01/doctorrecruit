package demo.doctorrecruit.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
//人员表的持久化类
@Entity
@Table(name = "info_person_info", schema = "doctorrecruit")
public class InfoPersonInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "personId")
    private int personId;
    @Basic
    @Column(name = "perName")
    private String perName;
    @Basic
    @Column(name = "perNum")
    private String perNum;
    @Basic
    @Column(name = "perIdCard")
    private String perIdCard;
    @Basic
    @Column(name = "hometown")
    private String hometown;
    @Basic
    @Column(name = "peopleCode")
    private String peopleCode;
    @Basic
    @Column(name = "familyProvince")
    private String familyProvince;
    @Basic
    @Column(name = "familyCity")
    private String familyCity;
    @Basic
    @Column(name = "familyTown")
    private String familyTown;
    @Basic
    @Column(name = "perBirthday")
    private Timestamp perBirthday;
    @Basic
    @Column(name = "telephone")
    private int telephone;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "postalCode")
    private String postalCode;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "mobilePhone")
    private String mobilePhone;
    @Basic
    @Column(name = "collegeId")
    private int collegeId;
    @Basic
    @Column(name = "collegeId1")
    private int collegeId1;
    @Basic
    @Column(name = "lastDegree")
    private String lastDegree;
    @Basic
    @Column(name = "lastStudyLevel")
    private String lastStudyLevel;
    @Basic
    @Column(name = "genderCode")
    private String genderCode;
    @Basic
    @Column(name = "politicalStatus")
    private String politicalStatus;
    @Basic
    @Column(name = "grade")
    private String grade;
    @Basic
    @Column(name = "MasterDegree")
    private String masterDegree;
    @Basic
    @Column(name = "perTypeCode")
    private int perTypeCode;
    @Basic
    @Column(name = "secondPerType")
    private int secondPerType;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public String getPerNum() {
        return perNum;
    }

    public void setPerNum(String perNum) {
        this.perNum = perNum;
    }

    public String getPerIdCard() {
        return perIdCard;
    }

    public void setPerIdCard(String perIdCard) {
        this.perIdCard = perIdCard;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getPeopleCode() {
        return peopleCode;
    }

    public void setPeopleCode(String peopleCode) {
        this.peopleCode = peopleCode;
    }

    public String getFamilyProvince() {
        return familyProvince;
    }

    public void setFamilyProvince(String familyProvince) {
        this.familyProvince = familyProvince;
    }

    public String getFamilyCity() {
        return familyCity;
    }

    public void setFamilyCity(String familyCity) {
        this.familyCity = familyCity;
    }

    public String getFamilyTown() {
        return familyTown;
    }

    public void setFamilyTown(String familyTown) {
        this.familyTown = familyTown;
    }

    public Timestamp getPerBirthday() {
        return perBirthday;
    }

    public void setPerBirthday(Timestamp perBirthday) {
        this.perBirthday = perBirthday;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public int getCollegeId1() {
        return collegeId1;
    }

    public void setCollegeId1(int collegeId1) {
        this.collegeId1 = collegeId1;
    }

    public String getLastDegree() {
        return lastDegree;
    }

    public void setLastDegree(String lastDegree) {
        this.lastDegree = lastDegree;
    }

    public String getLastStudyLevel() {
        return lastStudyLevel;
    }

    public void setLastStudyLevel(String lastStudyLevel) {
        this.lastStudyLevel = lastStudyLevel;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMasterDegree() {
        return masterDegree;
    }

    public void setMasterDegree(String masterDegree) {
        this.masterDegree = masterDegree;
    }

    public int getPerTypeCode() {
        return perTypeCode;
    }

    public void setPerTypeCode(int perTypeCode) {
        this.perTypeCode = perTypeCode;
    }

    public int getSecondPerType() {
        return secondPerType;
    }

    public void setSecondPerType(int secondPerType) {
        this.secondPerType = secondPerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoPersonInfo that = (InfoPersonInfo) o;
        return personId == that.personId && telephone == that.telephone && collegeId == that.collegeId && collegeId1 == that.collegeId1 && perTypeCode == that.perTypeCode && secondPerType == that.secondPerType && Objects.equals(perName, that.perName) && Objects.equals(perNum, that.perNum) && Objects.equals(perIdCard, that.perIdCard) && Objects.equals(hometown, that.hometown) && Objects.equals(peopleCode, that.peopleCode) && Objects.equals(familyProvince, that.familyProvince) && Objects.equals(familyCity, that.familyCity) && Objects.equals(familyTown, that.familyTown) && Objects.equals(perBirthday, that.perBirthday) && Objects.equals(address, that.address) && Objects.equals(postalCode, that.postalCode) && Objects.equals(email, that.email) && Objects.equals(mobilePhone, that.mobilePhone) && Objects.equals(lastDegree, that.lastDegree) && Objects.equals(lastStudyLevel, that.lastStudyLevel) && Objects.equals(genderCode, that.genderCode) && Objects.equals(politicalStatus, that.politicalStatus) && Objects.equals(grade, that.grade) && Objects.equals(masterDegree, that.masterDegree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, perName, perNum, perIdCard, hometown, peopleCode, familyProvince, familyCity, familyTown, perBirthday, telephone, address, postalCode, email, mobilePhone, collegeId, collegeId1, lastDegree, lastStudyLevel, genderCode, politicalStatus, grade, masterDegree, perTypeCode, secondPerType);
    }
}
