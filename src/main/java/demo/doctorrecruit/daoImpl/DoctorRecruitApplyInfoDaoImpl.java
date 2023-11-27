package demo.doctorrecruit.daoImpl;

import demo.doctorrecruit.dao.DoctorRecruitApplyInfoDao;
import demo.doctorrecruit.model.DoctorRecruitApplyInfo;

import java.sql.*;
import java.util.List;
import java.util.LinkedList;
public class DoctorRecruitApplyInfoDaoImpl implements DoctorRecruitApplyInfoDao {
    Connection conn = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    @Override
    public List<DoctorRecruitApplyInfo> GetAll(){
        try{

            conn = FactoryDB.GetConnection();
            pre=conn.prepareStatement("select * from doctor_recruit_apply_info");
            res=pre.executeQuery();
            List<DoctorRecruitApplyInfo> list=new LinkedList<DoctorRecruitApplyInfo>();
            while(res.next()){
                list.add(new DoctorRecruitApplyInfo(

                ));
            }
            FactoryDB.Close(conn,pre,res);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean DeleteById(Integer id){
        try {
            conn = FactoryDB.GetConnection();
            pre = conn.prepareStatement("delete from doctor_recruit_apply_info where applyId=?");
            pre.setInt(1,id);
            int isf = pre.executeUpdate();
            FactoryDB.Close(conn, pre, res);
            return isf != -1;
        } catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }


}
