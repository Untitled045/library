package cn.untitled.pojo;

public class Book {
    private Integer id;

    private String isbn;

    private String bookname;

    private String author;

    private String publisher;

    private String pubdate;

    private String address;

    private String imgurl;

    private Integer age;

    private String bookinfo;

    private String authorinfo;

    private String booktype;

    private String location;

    public Book(Integer id, String isbn, String bookname, String author, String publisher, String pubdate, String address, String imgurl, Integer age, String bookinfo, String authorinfo, String booktype, String location) {
        this.id = id;
        this.isbn = isbn;
        this.bookname = bookname;
        this.author = author;
        this.publisher = publisher;
        this.pubdate = pubdate;
        this.address = address;
        this.imgurl = imgurl;
        this.age = age;
        this.bookinfo = bookinfo;
        this.authorinfo = authorinfo;
        this.booktype = booktype;
        this.location = location;
    }

    public Book() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate == null ? null : pubdate.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBookinfo() {
        return bookinfo;
    }

    public void setBookinfo(String bookinfo) {
        this.bookinfo = bookinfo == null ? null : bookinfo.trim();
    }

    public String getAuthorinfo() {
        return authorinfo;
    }

    public void setAuthorinfo(String authorinfo) {
        this.authorinfo = authorinfo == null ? null : authorinfo.trim();
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}