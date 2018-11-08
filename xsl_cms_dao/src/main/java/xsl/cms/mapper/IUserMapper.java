package xsl.cms.mapper;

import org.apache.ibatis.annotations.Param;

public interface IUserMapper {
    int isUsername(@Param("username") String username);
    int isUser(@Param("username") String username,@Param("password") String password );
}
