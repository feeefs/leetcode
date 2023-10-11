// Complexity Analysis --> Time and space complexity of O(N)
class ReverseVowelsOfAString {
    public String solve(String s) {
        char[] characters = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            if(!isVowel(characters[start])) {
                start++;
            }
            else if(!isVowel(characters[end])) {
                end--;
            } else {
                char t = characters[start];
                characters[start] = characters[end];
                characters[end] = t;
                start++;
                end--;
            }
        }
        return new String(characters);
    }
    public boolean isVowel(char character) {
        return (character == 'a'|| character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A'|| character == 'E' || character == 'I' || character == 'O' || character == 'U');
    }
}
