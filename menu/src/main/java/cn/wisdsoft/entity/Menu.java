package cn.wisdsoft.entity;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import lombok.Data;

@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
}
