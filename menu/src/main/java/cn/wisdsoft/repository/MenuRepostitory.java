package cn.wisdsoft.repository;

import cn.wisdsoft.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepostitory {
    public List<Menu> findAll(int index,int limit);
    public int count();
    public Menu findById(long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);


}
