package cn.bdqn.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Players {
    private int pid;
    private String pname;
    private int weight;
    private int height;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String position;
    private int cid;
    private String cname;
}
