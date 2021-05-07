package cn.wisdsoft.controller;

import cn.wisdsoft.entity.Menu;
import cn.wisdsoft.entity.MenuVO;
import cn.wisdsoft.feign.MenuFeign;
import com.thoughtworks.xstream.annotations.XStreamContainedType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller //视图解析
@RequestMapping("/client")
public class CLientHandler {

    @Autowired
    private MenuFeign menuFeign;

    @GetMapping("/findAll")
    @ResponseBody //只反数组不反视图
    public MenuVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        int index = (page-1)*limit;
        return menuFeign.findAll(index, limit);
    }

    @GetMapping("/redirect/{location}")
    //后台映射th标签
    public String redirect(@PathVariable("location") String location){
        return location;
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        menuFeign.deleteById(id);
        return "redirect:/client/redirect/index";
    }
}
