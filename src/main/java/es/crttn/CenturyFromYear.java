package es.crttn;

public class CenturyFromYear {

    int solution(int year) {
        return ((year - 1) / 100) + 1;
    }
}
