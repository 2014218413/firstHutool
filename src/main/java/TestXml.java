import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.XmlUtil;
import org.w3c.dom.NodeList;

import java.io.File;

public class TestXml {
    public static void main(String[] args) {
        File file = new File("D:\\firstHutool\\src\\main\\java\\a.xml");

        System.out.println(XmlUtil.readXML(file).getElementsByTagName("SDPurchaseOrder").getLength());

        System.out.println(XmlUtil.readXML(file).getLastChild().getNodeName());


        String message = "a/b/c/d";
        String op = "123";
        StringBuffer stringBuffer = new StringBuffer(message);
        StringBuffer stringBuffer2 = new StringBuffer(op);
        System.out.println(stringBuffer.reverse());

        System.out.println(stringBuffer.replace(0, 2, "789"));

        System.out.println("git---------------");
        System.out.println("git---------------");


    }
}
