package cn.untitled.services;

import cn.untitled.pojo.QueryVoBook.*;

import java.util.List;

public interface BookServices {

    public List<ImgList> getImgList(String keywords);

    public List<BookList> getIndexBooks();

    public BookDeatilVo selectBookById(int id);

    public ListPage searchByExample(Condation condation);
}
