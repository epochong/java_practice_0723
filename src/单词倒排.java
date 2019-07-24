import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/22 23:01
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * 题目描述
 * 对字符串中的所有单词进行倒排。
 *
 * 说明：
 *
 * 1、每个单词是以 26 个大写或小写英文字母构成；
 *
 * 2、非构成单词的字符均视为单词间隔符；
 *
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 *
 * 4、每个单词最长 20 个字母；
 *
 * 输入描述:
 * 输入一行以空格来分隔的句子
 *
 * 输出描述:
 * 输出句子的逆序
 *
 * 示例 1
 * 输入
 * 复制
 * I am a student
 * 输出
 * 复制
 * student a am I
 */
public class 单词倒排 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] strings = s.split("[^a-zA-Z]+");
            for(int i = strings.length - 1 ; i > 1 ; i--){
                System.out.print(strings[i] + " ");
            }
            //如果strings[0]是空字符串 那么strings[1]输出带空格就会使得字符串尾多一个空格,string[1]也有可能为空啊，为什么不要考虑
            if(strings[0].length() == 0){
                System.out.println(strings[1]);
            } else {
                System.out.println(strings[1] + " " + strings[0]);
            }
        }
    }
}

/*
epochong:
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String str = input.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                String tem = String.valueOf(str.charAt(i));
                if (tem.matches("[a-zA-Z]")) {
                    sb.append(tem);
                } else {
                    sb.append(" ");
                }
            }
            for (int i = 0; i < sb.length(); i++) {

            }
            String[] res = sb.toString().split(" ");
            for (int i = res.length - 1; i >= 0; i--) {
                if (i > 0 && res[i].length() > 0) {
                    System.out.print(res[i] + " ");
                } else {
                    System.out.println(res[i]);
                }
            }
        }
    }
}

*/