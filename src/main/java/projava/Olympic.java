package projava;

public class Olympic {
    public boolean isSummerOlympicYear(int year) {
        if (year < 1896) {
            return false;
        }
        if (year == 1916 || year == 1940 || year == 1944 || year == 2020) {
            return false;
        }
        if (year == 2021) {
            return true;
        }
        if (2032 < year) {
            throw new IllegalArgumentException(
                    "2032年までをサポートしています。入力：" + year);
        }
        return year % 4 == 0;
    }
}
