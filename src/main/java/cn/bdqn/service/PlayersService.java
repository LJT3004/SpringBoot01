package cn.bdqn.service;

import cn.bdqn.pojo.PageBean;
import cn.bdqn.pojo.Players;
import org.apache.ibatis.annotations.Param;


public interface PlayersService {
    public PageBean<Players> playersList(@Param("pname")String pname, @Param("cid")Integer cid, @Param("pageSize")Integer pageSize, @Param("currPageNo") Integer currPageNo);
    public int findCount(@Param("pname")String pname,@Param("cid") Integer cid);

    int add(Players players);

    int delete(Integer pid);
}
