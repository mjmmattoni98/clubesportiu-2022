package es.uji.ei1027.clubesportiu.dao;

import es.uji.ei1027.clubesportiu.model.UserDetails;

import java.util.Collection;

public interface UserDao {
    UserDetails loadUserByUsername(String username, String password);
    Collection<UserDetails> listAllUsers();
}
