package com.vikastadge.hibernate.onetomany.service;

import com.vikastadge.hibernate.onetomany.dao.SpeakerDAO;
import com.vikastadge.hibernate.onetomany.dao.entity.SpeakerEntity;

public class SpeakerService {

    SpeakerDAO speakerDAO = new SpeakerDAO();

    public SpeakerEntity get(int id){
        return speakerDAO.get(id);
    }
}
