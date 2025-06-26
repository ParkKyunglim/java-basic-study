package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        // 같은 이름의 클래스는 하나만 import
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
