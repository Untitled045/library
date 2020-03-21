package cn.untitled.controller;

import cn.untitled.pojo.QueryVoBook.*;
import cn.untitled.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookServices bookServices;

    @RequestMapping("keywords")
    public @ResponseBody List<ImgList> queryKeywords(@RequestBody Keywords keywords){
        System.out.println(keywords.getKeywords());
        System.out.println("进入queryKeywords，，，，，，，，，，，，，，，，，，，，，");

        return bookServices.getImgList(keywords.getKeywords());
    }

    @RequestMapping("index_books")
    public @ResponseBody List<BookList> queryIndexBooks(){
        System.out.println("进入queryIndexBooks，，，，，，，，，，，，，，，，，，，，，");
        return bookServices.getIndexBooks();
    }

    @RequestMapping("search")
    public @ResponseBody ListPage queryByCondition(@RequestBody Condation condation){
        System.out.println("进入queryByCondition，，，，，，，，，，，，，，，，，，，，，");
        ListPage page = bookServices.searchByExample(condation);
        System.out.println(page);
        return page;
    }

    @RequestMapping("book_detail")
    public @ResponseBody BookDeatilVo getBookDetail(@RequestParam("id") int id){
        System.out.println("进图getBookDetail。。。。。。。。。。。。。。。。");
        return bookServices.selectBookById(id);
    }
}
