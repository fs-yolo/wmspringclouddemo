package cn.wisdsoft.controller;

import cn.wisdsoft.entity.MenuVO;
import cn.wisdsoft.repository.MenuRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private MenuRepostitory menuRepostitory;

    @GetMapping("/index")
    public  String index(){
        return this.port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index,@PathVariable("limit") int limit){
        return new MenuVO(0,"",menuRepostitory.count(), menuRepostitory.findAll(index, limit));
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        menuRepostitory.deleteById(id);
    }

}
