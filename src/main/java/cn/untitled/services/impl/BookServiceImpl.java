package cn.untitled.services.impl;

import cn.untitled.mapper.BookMapper;
import cn.untitled.pojo.Book;
import cn.untitled.pojo.QueryVoBook.*;
import cn.untitled.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookServices {
    @Autowired
    private BookMapper bookMapper;

    public List<ImgList> getImgList(String keywords) {

        List<Book> bookList = bookMapper.selectByBookname(keywords);

        if(bookList.size() <= 0)
            return null;
        List<ImgList> imgList = new ArrayList<ImgList>();
        for (Book book : bookList) {
            imgList.add(new ImgList(book.getBookname()));
        }
        return imgList;
    }

    public List<BookList> getIndexBooks() {
        List<Book> bookList = bookMapper.selectAll(8);

        if(bookList.size() <= 0)return null;
        List<BookList> list = new ArrayList<BookList>();
        for (Book book : bookList) {
            list.add(new BookList(book.getImgurl(), book.getBookname(), book.getId()));
        }
        return list;
    }



    public ListPage searchByExample(Condation condation) {
        List<Book> bookList = bookMapper.selectByExample(condation);

        if(bookList.size() <= 0)
            return null;

        ListPage page = new ListPage();
        int totalData = bookMapper.selectCount();
        int totalPage = totalData / (condation.MAX_SIZE) + ((totalData%condation.MAX_SIZE==0)?0:1);
        page.setTotaldata(totalData);
        page.setTotalpage(totalPage);
        for (Book book : bookList) {
            page.addToBookList(book.getImgurl(), book.getId(), book.getBookname(), book.getAuthor(),book.getBookinfo());
        }
        return page;
    }



    public BookDeatilVo selectBookById(int id) {
        Book book =  bookMapper.selectByPrimaryKey(id);
        BookDeatilVo deatilVo = new BookDeatilVo(book);
        return deatilVo;
    }

}
