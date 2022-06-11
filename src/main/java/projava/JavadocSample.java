package projava;

public class JavadocSample {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(new Olympic().isSummerOlympicYear(2020));
    }
}

class Olympic {
    /**
     * 渡された西暦年が夏季近代オリンピック開催年であるかどうか判定する
     * @param year 西暦年
     * @return 夏季オリンピック開催年であればtrue
     * @throws IllegalAccessException まだオリンピック開催が確定していない年を渡した場合
     */
    public boolean isSummerOlympicYear(int year) throws IllegalAccessException {
        if (2032 < year) {
            throw new IllegalAccessException("2032年までサポートしています。入力：" + year);
        }
        return year % 4 == 0;
    }
}