/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Role;

/**
 *
 * @author ADMIN
 */
public class manager {
public List<Role> ListRole ;
public List<Account> listAccount;
    public manager() {
        ListRole = new ArrayList<>();
       
        ListRole.add(new Role(1, "admin"));
        ListRole.add(new Role(2, "student"));
        ListRole.add(new Role(3, "user"));
        listAccount = new ArrayList<Account>() ;
        Role role = new Role(5, "hihi");
        String[] array = {"asd","asd"};
        listAccount.add(new Account("abc", "abc", "male", role,array));
        listAccount.add(new Account("abcd", "abc", "male", role,array));
        listAccount.add(new Account("abcde", "abc", "male", role,array));
        listAccount.add(new Account("abcdef", "abc", "male", role,array));
        listAccount.add(new Account("abcdefg", "abc", "male", role,array));
    }

    public List<Account> getListAccount() {
        return listAccount;
    }

    public void setListAccount(List<Account> listAccount) {
        this.listAccount = listAccount;
    }

    public List<Role> getListRole() {
        return ListRole;
    }

    public void setListRole(List<Role> ListRole) {
        this.ListRole = ListRole;
    }

    public manager(List<Role> ListRole) {
        this.ListRole = ListRole;
    }
       String convertIdRode(int number)
    {
        for (int i = 0; i < ListRole.size(); i++) {
             if(ListRole.get(i).getId()==number){
                                 return ListRole.get(i).getName();
             }
        }
        return null;
    }
       Role getRoleByID(int number)
       {
           for (Role role : ListRole) {
               if(role.getId()==number)
               {
                   return role;
               }
           }
           return null;
       }

    List<Account> searchAccByUser(String name) {
        List<Account> listSearch = new ArrayList<>();
        for (Account account : listAccount) {
            if(account.getUsername().contains(name))
            {
                listSearch.add(account);
            }
        }
        return listSearch;
    }
}
