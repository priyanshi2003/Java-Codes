import java.util.*;
public class Chaining {

        private int size=20;
        data [] hashtable =new  data[size];

        public int index(int key){
            return key % size;
        }

        public  void insert(data data1){
            int key1=data1.data_key();
            int value1 = data1.data_value();
            data next1=null;
            int index1= index(key1);
            if(hashtable[index1]==null){
                hashtable[index1]=data1;
            }
            else{
                data data2=hashtable[index1];//referring to 1st data item stored at that index
                while(data2.data_next()!=null && data2.data_key()!=key1){
                    data2=data2.data_next();
                }
                data2.data_next1(data1);//previous pointer pointing to new inserted data item
            }

        }

        public void display(int key){
            int index1 = index(key);
            if(hashtable[index1]==null){
                System.out.println("no item stored");
            }
            else{
                data data1=hashtable[index1];
                while(data1!=null){
                    System.out.println(data1.data_key());
                    System.out.println(data1.data_value());
                    data1=data1.data_next();
                }
            }
        }


        public static void main(String[] args) {
            
            data da1=new data(4, 676);
            data da2=new data(24, 686);
            data da3=new data(23, 696);
            Chaining h1 = new Chaining();
            h1.insert(da1);
            h1.insert(da2);
            h1.insert(da3);
            h1.display(2);

        }
    }
    class data {
        private int key;
        private int value;
        private data next;
        data(int key1, int value1){
            key=key1;
            value=value1;
            next = null;
        }
        int data_key(){
            return key;
        }
        int data_value(){
            return value;
        }
        data data_next(){
            return next;
        }
        void  data_next1(data next1){
            next=next1;
        }
    }

