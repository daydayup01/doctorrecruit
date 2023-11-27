package demo.doctorrecruit.daoImpl;

import demo.doctorrecruit.dao.InfoPersonInfoDao;
import demo.doctorrecruit.model.DoctorRecruitApplyInfo;
import demo.doctorrecruit.model.InfoPersonInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class InfoPersonInfoDaoImpl implements InfoPersonInfoDao {
    Connection conn = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    @Override
    public List<InfoPersonInfo> GetAll(){
        try{

            conn = FactoryDB.GetConnection();
            pre=conn.prepareStatement("select * from info_person_info");
            res=pre.executeQuery();
            List<InfoPersonInfo> list=new LinkedList<InfoPersonInfo>();
            while(res.next()){
                list.add(new InfoPersonInfo(

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
            pre = conn.prepareStatement("delete from info_person_info where personId=?");
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
