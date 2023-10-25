package cn.bdqn.mapper;

import cn.bdqn.pojo.Players;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PlayersMapper {
    public List<Players> playersList(@Param("pname")String pname,@Param("cid")Integer cid,@Param("pageSize")Integer pageSize,@Param("currPageNo") Integer currPageNo);
    public int findCount(@Param("pname")String pname,@Param("cid") Integer cid);

    int add(Players players);

    int delete(Integer pid);
}
