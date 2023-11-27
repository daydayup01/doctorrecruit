package demo.doctorrecruit.dao;
import demo.doctorrecruit.model.DoctorRecruitApplyInfo;
import java.util.List;
//报考申请表的访问接口类
public interface DoctorRecruitApplyInfoDao {
    public List<DoctorRecruitApplyInfo> GetAll();
    public boolean DeleteById(Integer id);
}
