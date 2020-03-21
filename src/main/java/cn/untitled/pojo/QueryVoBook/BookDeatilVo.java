package cn.untitled.pojo.QueryVoBook;

import cn.untitled.pojo.Book;

import java.util.ArrayList;
import java.util.List;

/**detail页面数据
 * book: {
 *                 type: "传统文学",
 *                 age: "0-2岁"(int),
 *                 imgurl: "book1.jpg",
 *                 bookname: "安徒生童话",
 *                 author: "安徒生",
 *                 publisher: "西北大学出版社",
 *                 pubdate: "2000.1.1",
 *                 isbn: "666666666",
 *                 address: "http://www.dangdang.com",
 *                 location: [
 *                         {library: "西安图书馆", region: "儿童文学"},
 *                         {library: "长安图书馆", region: "儿童文学"},
 *                     ],
 *                 bookinfo: "12岁的阿富汗富家少爷阿米尔与仆人哈桑情同手足。然而，在一场风筝比赛后，发生了一件悲惨不堪的事，阿米尔为自己的懦弱感到自责和痛苦，逼走了哈桑，不久，自己也跟随父亲逃往美国。 成年后的阿米尔始终无法原谅自己当年对哈桑的背叛。为了赎罪，阿米尔再度踏上暌违二十多年的故乡，希望能为不幸的好友尽最后一点心力，却发现一个惊天谎言，儿时的噩梦再度重演，阿米尔该如何抉择？ 故事如此残忍而又美丽，作者以温暖细腻的笔法勾勒人性的本质与救赎，读来令人荡气回肠。",
 *                 authorinfo: ""
 *             }
 */
public class BookDeatilVo {
    private String type;
    private Integer age;
    private String imgurl;
    private String bookname;
    private String author;
    private String publisher;
    private String pubdate;
    private String isbn;
    private String address;
    private List<Location> location;
    private String bookinfo;
    private String authorinfo;

    public BookDeatilVo() {
    }

    public BookDeatilVo(String type, Integer age, String imgurl, String bookname, String author, String publisher, String pubdate, String isbn, String address, List<Location> location, String bookinfo, String authorinfo) {
        this.type = type;
        this.age = age;
        this.imgurl = imgurl;
        this.bookname = bookname;
        this.author = author;
        this.publisher = publisher;
        this.pubdate = pubdate;
        this.isbn = isbn;
        this.address = address;
        this.location = location;
        this.bookinfo = bookinfo;
        this.authorinfo = authorinfo;
    }

    public BookDeatilVo(Book book){
        this.type = book.getBooktype();
        this.age = book.getAge();
        this.imgurl = book.getImgurl();
        this.bookname = book.getBookname();
        this.author = book.getAuthor();
        this.publisher = book.getPublisher();
        this.pubdate = book.getPubdate();
        this.isbn = book.getIsbn();
        this.address = book.getAddress();
        this.bookinfo = book.getBookinfo();
        this.authorinfo = book.getAuthorinfo();
        String[] locationStr = book.getLocation().split("\\#");
        System.out.println(locationStr.length);
        for (String location : locationStr) {
            if(location.length() > 0){
                String[] str = location.split("-");
                System.out.println("location=" + str[0] + " , " +str[1]);
                setLocation(str[0], str[1]);
            }
        }

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }

    public String getBookinfo() {
        return bookinfo;
    }

    public void setBookinfo(String bookinfo) {
        this.bookinfo = bookinfo;
    }

    public String getAuthorinfo() {
        return authorinfo;
    }

    public void setAuthorinfo(String authorinfo) {
        this.authorinfo = authorinfo;
    }


    public void setLocation(String library, String region){
        if(this.location == null)
            this.location = new ArrayList<Location>();
        this.location.add(new Location(library, region));
    }

    class Location{
        private String library;
        private String region;
        public Location(){

        }
        public Location(String library, String region){
            this.library = library;
            this.region =region;
        }

        public String getLibrary() {
            return library;
        }

        public void setLibrary(String library) {
            this.library = library;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }
}
