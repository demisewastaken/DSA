int lengthOfLastWord(char* s) {
    int length = 0;
    int i = 0;
    while (*(s + i++) != '\0') length++;

    int lenlast = 0;
    i = length - 1;
    int flag = 0;
    while (i >= 0) {
        if (*(s + i) == ' ') {
            i--;
        }else {
            break;
        }
    }
    while (i >= 0) {
        if (*(s + i) != ' ') {
            lenlast++;
        }else {
            break;
        }
        i--;
    }

    return lenlast;
}