package com.chamodshehanka.heshanhardware.service;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public interface SuperService<T, ID> {

    public void add(T t);

    public T getByID(ID id);

    public T update(ID id, T t);

    public void remove(ID id);

    public ArrayList<T> getAll();

}
