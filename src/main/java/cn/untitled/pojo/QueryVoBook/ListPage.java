package cn.untitled.pojo.QueryVoBook;

import java.util.ArrayList;
import java.util.List;

//this.pages = response.data.totalpage;//设置总页数
//        this.totaldata = response.data.totaldata;//设置总数据数目
//        this.booklist = response.data.booklist;//设置书籍列表
public class ListPage {
    private int totaldata;
    private int totalpage;
    private List<BookList> booklist;

    public ListPage() {
    }

    public ListPage(int totaldata, int totalpage, List<BookList> booklist) {
        this.totaldata = totaldata;
        this.totalpage = totalpage;
        this.booklist = booklist;
    }

    public int getTotaldata() {
        return totaldata;
    }

    public void setTotaldata(int totaldata) {
        this.totaldata = totaldata;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public List<BookList> getBooklist() {
        return booklist;
    }

    public void setBooklist(List<BookList> bookList) {
        this.booklist = booklist;
    }

    public void addToBookList(String imageurl, int bookid, String bookname, String author, String bookinfo){
        if(booklist == null)
            booklist = new ArrayList<BookList>();
        booklist.add(new BookList(imageurl, bookid, bookname, author, bookinfo));
    }

    @Override
    public String toString() {
        return "ListPage{" +
                "totaldata=" + totaldata +
                ", totalpage=" + totalpage +
                ", booklist=" + booklist +
                '}';
    }
    //list的bookList
    public class BookList{
        private String imageurl;
        private int bookid;
        private String bookname;
        private String author;
        private String bookinfo;
        public BookList(){

        }

        public BookList(String imageurl, int bookid, String bookname, String author, String bookinfo) {
            this.imageurl = imageurl;
            this.bookid = bookid;
            this.bookname = bookname;
            this.author = author;
            this.bookinfo = bookinfo;
        }

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }

        public int getBookid() {
            return bookid;
        }

        public void setBookid(int bookid) {
            this.bookid = bookid;
        }

        public String getBookname() {
            return bookname;
        }

        public void setBookname(String bookname) {
            this.bookname = bookname;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getBookinfo() {
            return bookinfo;
        }

        public void setBookinfo(String bookinfo) {
            this.bookinfo = bookinfo;
        }

        @Override
        public String toString() {
            return "BookList{" +
                    "imageurl='" + imageurl + '\'' +
                    ", bookid=" + bookid +
                    ", bookname='" + bookname + '\'' +
                    ", author='" + author + '\'' +
                    ", bookinfo='" + bookinfo + '\'' +
                    '}';
        }
    }
}
