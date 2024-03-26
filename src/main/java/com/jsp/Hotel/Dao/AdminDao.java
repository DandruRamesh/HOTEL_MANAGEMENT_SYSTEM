package com.jsp.Hotel.Dao;

import java.util.List;

import com.jsp.Hotel.Entity.Admin;
import com.jsp.Hotel.Entity.UserInformation;

public interface AdminDao {
Admin adminLogin(String emailid,String password);
List<UserInformation> getAllUser();
/**
 * @param id
 * @return
 */
UserInformation getUserById(int id);

}
