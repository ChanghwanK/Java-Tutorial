package IOStudy;

import java.io.IOException;

public class SystemInEx {

    public static void main(String[] args) throws IOException {
        var inputStream = System.in;
        System.out.println();
        var data = (char) inputStream.read();

        switch(data) {
            case '1':
                System.out.println("1");
                break;
            case '2':
                System.out.println("2");
                break;
        }
    }

}
