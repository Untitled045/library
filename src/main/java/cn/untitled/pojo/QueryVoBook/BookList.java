package cn.untitled.pojo.QueryVoBook;
//index的bookList
public class BookList {
//    {imgurl: "book1.jpg", bookname: "安徒生童话", id: "123"},
    private String imgurl;
    private String bookname;
    private int id;

    public BookList(String imgurl, String bookname, int id) {
        this.imgurl = imgurl;
        this.bookname = bookname;
        this.id = id;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
