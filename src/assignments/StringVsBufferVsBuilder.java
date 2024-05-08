package assignments;

public class StringVsBufferVsBuilder {
    public static void main(String[] args) {
        String s="Immutable";
        s.concat("Can't change original values");
        System.out.println(s);  //After concat , no value change i.e immutable
        String s_concat=s.concat("concantenated");
        System.out.println(s_concat); //After assigning value changes

        StringBuilder str_build=new StringBuilder("mutable");
        str_build.append("Original value can be modified");
        System.out.println(str_build);

        StringBuffer s_buffer=new StringBuffer("Mutable");
        s_buffer.insert(7," modified");
        System.out.println(s_buffer);

    }
}
/*
Immutable
Immutableconcantenated
mutableOriginal value can be modified
Mutable modified
 */