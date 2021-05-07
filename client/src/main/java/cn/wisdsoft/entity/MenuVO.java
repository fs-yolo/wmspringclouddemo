package cn.wisdsoft.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//带参构造法
public class MenuVO {
    private int code;
    private String msg;
    private int count;
    private List<Menu> data;
}
