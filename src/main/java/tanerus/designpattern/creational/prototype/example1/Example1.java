package tanerus.designpattern.creational.prototype.example1;

import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils;

class Foo implements Serializable
{
    public int stuff;
    public Foo2 foo2;

    public Foo(int stuff, Foo2 foo2)
    {
        this.stuff = stuff;
        this.foo2 = foo2;
    }

    @Override
    public String toString()
    {
        return "Foo{" +
                "stuff=" + stuff +
                ", foo2='" + foo2 + '\'' +
                '}';
    }
}

class Foo2 implements Serializable
{
    public int stuff2;
    public String whatever2;

    public Foo2(int stuff2, String whatever2)
    {
        this.stuff2 = stuff2;
        this.whatever2 = whatever2;
    }

    @Override
    public String toString()
    {
        return "Foo2{" +
                "stuff2=" + stuff2 +
                ", whatever2='" + whatever2 + '\'' +
                '}';
    }
}

class CopyThroughSerializationDemo
{
    public static void main(String[] args)
    {
        Foo foo = new Foo(42, new Foo2(1, "life"));
        // use apache commons!
        Foo foo2 = SerializationUtils.roundtrip(foo);

        foo2.foo2.whatever2 = "xyz";

        System.out.println(foo);
        System.out.println(foo2);

        /*
        * Output :
            Foo{stuff=42, foo2='Foo2{stuff2=1, whatever2='life'}'}
            Foo{stuff=42, foo2='Foo2{stuff2=1, whatever2='xyz'}'}
        * */
    }
}
