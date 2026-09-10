class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1 && word.charAt(0) == '$') {
                boolean valid = true;
                long price = 0;

                for (int i = 1; i < word.length(); i++) {
                    if (!Character.isDigit(word.charAt(i))) {
                        valid = false;
                        break;
                    }
                    price = price * 10 + (word.charAt(i) - '0');
                }

                if (valid) {
                    long dollars = price * (100 - discount);
                    sb.append('$')
                      .append(dollars / 100)
                      .append('.')
                      .append(String.format("%02d", dollars % 100));
                } else {
                    sb.append(word);
                }
            } else {
                sb.append(word);
            }

            sb.append(' ');
        }

        return sb.toString().trim();
    }
}
