
什么是Lambda?
------------

我们知道，对于一个Java变量，我们可以赋给其一个“值”。

    int value = 129;
    String str = "hello world";
    Boolean bool = true;


如果你想把“一块代码”赋给一个Java变量，应该怎么做呢？

比如，我想把一块代码，赋给一个叫做aBlockOfCode的Java变量：

    interface MyLamdba {
        void doSomeThing(String s);
    }
    
    // java 7 -:
    public class MyLamdbaImpl implements MyLamdba {
        @Override
        public void doSomeThing(String s) {
            System.out.print(s);
        }
    }
    
    MyLamdba myLamdba = new MyLamdbaImpl();
    myLamdba.doSomeThing("nihao");

    //java 8
    MyLamdba aBlockOfCode = (s)->System.out.println(s);
    aBlockOfCode.doSomeThing("nihao");



参考：  

https://www.zhihu.com/question/20125256

http://www.importnew.com/16436.html

