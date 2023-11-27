package demo.doctorrecruit.dao;
import demo.doctorrecruit.model.DoctorRecruitApplyInfo;
import demo.doctorrecruit.model.InfoPersonInfo;

import java.util.List;

//人员表的访问接口类
public interface InfoPersonInfoDao {
    public List<InfoPersonInfo> GetAll();
    public boolean DeleteById(Integer id);
}
