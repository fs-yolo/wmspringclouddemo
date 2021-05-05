package cn.wisdsoft.repository;

import cn.wisdsoft.entity.Menu;

import java.util.List;

public interface MenuRepostitory {
    public List<Menu> findAll(int index,int limit);
    public int count();
    public Menu findByid(long id);
    public void save(Menu menu);
    public void uodate(Menu menu);
    public void deleteById(long id);

}
