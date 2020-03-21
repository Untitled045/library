package cn.untitled.pojo.QueryVoBook;

import java.util.List;

/**
 * index页面联想词接收的数据类
 */
public class ImgList {
    String word;

    public ImgList(String word){
        this.word =word;
    }
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
