package cn.xdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.xdl.dao.EtAdminDao;
import cn.xdl.entity.EtAdmin;

import java.util.List;

@Service
public class EtAdminService {

    @Autowired
    private EtAdminDao dao;

    public List<EtAdmin> getAll(){
        return dao.getAll();
    }
}
