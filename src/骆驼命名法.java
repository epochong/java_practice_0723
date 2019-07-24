import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/22 22:52
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 骆驼命名法 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String c = input.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < c.length(); i++) {
                if (c.charAt(i) == '_') {
                    sb.append(String.valueOf(c.charAt(i + 1)).toUpperCase());
                    i++;
                } else {
                    sb.append(c.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
