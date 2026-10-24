for(int i = 0; i <= s1.length() - k; i++) {
    String substr = s1.substring(i, i + k);

    HashSet<Character> set = new HashSet<>();
    boolean hasDuplicate = false;

    for(char ch : substr.toCharArray()) {
        if(set.contains(ch)) {
            hasDuplicate = true;
            break;
        }
        set.add(ch);
    }

    if(!hasDuplicate) {
        System.out.println(substr);
    }
}