package 爬虫.数据解析.豆瓣图书深度爬取;

import java.util.LinkedList;

public class Queue {
    // 队列
    private LinkedList<String> queue = new LinkedList<String>() ;
    // 加入
    public void enQueue(String t){
        queue.addLast(t);
    }
    // 移除
    public String deQueue(){
        return queue.removeFirst();
    }
    public int size(){
        return queue.size();
    }
    // 是否为空     空->true
    public boolean isQueueEmpty(){
        return queue.isEmpty();
    }
    // 是否包含t   包含->true
    public boolean contains(String t){
        return queue.contains(t);
    }
}
