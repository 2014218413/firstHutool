import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class sss {
    public static void main(String[] args) {
        S s = new S("asd","dasdsa");
        AtomicReference<S> atomicReference = new AtomicReference<>(s);
        System.out.println(atomicReference.get().address);
        s.setAddress("sadasdasdasd");
        System.out.println(atomicReference.compareAndSet(s, new S("1", "1")));
    }
    static class S {
        private String name;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public S(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
