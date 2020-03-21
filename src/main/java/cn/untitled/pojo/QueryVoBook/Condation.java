package cn.untitled.pojo.QueryVoBook;
//var send = {
//        type: type,
//        author: author,
//        publisher: publisher,
//        age: age,
//        keywords: {flag: 0, key: ""},
//        currentpage: 1
//        };
public class Condation {
    public static final int MAX_SIZE = 5;
    private int startNumber;
    private Keywords booktype;
    private Keywords author;
    private Keywords publisher;
    private Keywords age;
    private Keywords keywords;
    private int currentpage;

    public Condation(){}

    public Condation(Keywords booktype, Keywords author, Keywords publisher, Keywords age, Keywords keywords, int currentpage) {
        this.booktype = booktype;
        this.author = author;
        this.publisher = publisher;
        this.age = age;
        this.keywords = keywords;
        this.currentpage = currentpage;
    }

    public Keywords getType() {
        return booktype;
    }

    public void setType(Keywords booktype) {
        this.booktype = booktype;
    }

    public Keywords getAuthor() {
        return author;
    }

    public void setAuthor(Keywords author) {
        this.author = author;
    }

    public Keywords getPublisher() {
        return publisher;
    }

    public void setPublisher(Keywords publisher) {
        this.publisher = publisher;
    }

    public Keywords getAge() {
        return age;
    }

    public void setAge(Keywords age) {
        this.age = age;
    }

    public Keywords getKeywords() {
        return keywords;
    }

    public void setKeywords(Keywords keywords) {
        this.keywords = keywords;
    }

    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {
        this.currentpage = currentpage;
        this.startNumber = (currentpage-1) * MAX_SIZE;
    }

    @Override
    public String toString() {
        return "Condation{" +
                "startNumber=" + startNumber +
                ", booktype=" + booktype +
                ", author=" + author +
                ", publisher=" + publisher +
                ", age=" + age +
                ", keywords=" + keywords +
                ", currentpage=" + currentpage +
                '}';
    }

    public class Keywords{
        private int flag;
        private String key;

        public Keywords(){}

        public Keywords(int flag, String key){
            this.flag = flag;
            this.key = key;
        }

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return "Keywords{" +
                    "flag=" + flag +
                    ", key='" + key + '\'' +
                    '}';
        }
    }
}
