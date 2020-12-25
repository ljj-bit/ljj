import com.itheima.po.Province;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) {
        try{
            Class<Province> class1=Province.class;
            Province province=class1.newInstance();
            Field field=class1.getDeclaredField("provincename");
            field.set(province,"name");
            System.out.println(field.getClass().getField("name"));



        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
