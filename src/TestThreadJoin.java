
public class TestThreadJoin {
    public static void main(String[] args){
        MyThread thread = new MyThread("t1. ");//t1.给线程一个名字
        thread.start();

        try{
            thread.join();//首先执行完 thread线程中的所有内容， 再执行主线程的
        }catch (InterruptedException e){}


        for(int i=1; i<10; i++){
            System.out.println("I am main thread");
        }
    }
}

class MyThread extends Thread{
    MyThread(String s){ //得到主线程所传递的名字
        super(s);//使用父类方法
    }
    public void run(){
        for(int i=0; i<=10;i++){
            System.out.print("I am "+ getName()); //得到主函数的名字 ,并输出
            try {
                sleep(1000);//每一秒输出一次
            }catch (InterruptedException e){
                return;
            }
        }
    }
}
