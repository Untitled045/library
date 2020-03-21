package cn.untitled.mapper;

import cn.untitled.pojo.Book;
import cn.untitled.pojo.QueryVoBook.Condation;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> selectByBookname(String keywords);

    List<Book> selectAll(int count);

    int selectCount();

    List<Book> selectByExample(Condation condation);
}