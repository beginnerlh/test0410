/*假定一种编码的编码范围是a ~ y的25个字母，从1位到4位的编码，如果我们把该编码按字典序排序，
形成一个数组如下： a, aa, aaa, aaaa, aaab, aaac, … …, b, ba, baa, baaa, baab, baac … …, yyyw, yyyx, yyyy
其中a的Index为0，aa的Index为1，aaa的Index为2，以此类推。 编写一个函数，输入是任意一个编码，输出这个编码对应的Index.

        输入描述:

        输入一个待编码的字符串,字符串长度小于等于100.

        输出描述:

        输出这个编码的index

         

        示例1

        输入：

        baca

        输出：

        16331*/
package lianxi0410;

import java.util.*;
public class test0410{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] chars = s.toCharArray();
        int count2 = 0;
        for(int i = 0; i < chars.length; i++){
            int a = 4 - i -1;
            int count = 1;
            while(a > 0){
                count = count * 25 + 1;
                a--;
            }
            count = count * (int)(chars[i] - 'a') + 1;
            count2 += count;
        }

            System.out.println(count2  - 1);

    }
}
