package My.test资质;

import cn.hutool.core.io.FileUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;

public class TestZiZhi {
    public static void main(String[] args) throws IOException, DocumentException {
//        ImgUtil.pressImage(
//                FileUtil.file("d:/zhengzhao.png"),
//                FileUtil.file("d:/zhengzhao1.png"),
//                ImgUtil.read(FileUtil.file("d:/guoyao.png")),
//                0,
//                0,
//                0.9f
//        );

File file = new File("d:/zhengzhao1.png");
generatePdfFile(file);
    }
    public static void generatePdfFile (File file) throws IOException, DocumentException {
        String name = FileUtil.getName(file);
        String pdfName = name.substring(0,name.lastIndexOf("."))+".pdf";
        Document document = new Document(PageSize.A4,20,20,20,20);
        PdfWriter.getInstance(document,new FileOutputStream("d:/"+pdfName));
        document.open();
        document.newPage();
        FileInputStream fileInputStream = new FileInputStream(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1000);
        byte[] bytes = new byte[1000];
        int n;
        while ((n = fileInputStream.read(bytes)) != -1) {
            byteArrayOutputStream.write(bytes,0,n);
        }
        fileInputStream.close();
        byteArrayOutputStream.flush();
        byte[] data  = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        Image image = Image.getInstance(data);
        float height = image.getHeight();
        float width = image.getWidth();
        int percent = getPercent(height,width);
        image.setAlignment(Image.MIDDLE);
        image.scalePercent(percent);
        document.add(image);
        document.close();

    }

    private static int getPercent (float height,float weight) {
        float percent = 0.0F;
        if (height>weight) {
            percent = PageSize.A4.getHeight()/height*100;
        }
        else {
            percent = PageSize.A4.getWidth()/weight*100;
        }
        return Math.round(percent);
    }
}
