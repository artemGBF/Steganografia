package program;


import bmp.BmpImage;
import bmp.BmpReader;
import bmp.BmpWriter;

import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("file.bmp");
        BmpImage bmp;
        try {
            bmp = BmpReader.read(in);
        } finally {
            in.close();
        }

        OutputStream out = new FileOutputStream("Demo.bmp");
        try {
            BmpWriter.write(out, bmp);
        } finally {
            out.close();
        }
    }
}
