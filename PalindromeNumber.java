// Consumes o(N) time and O(1) space.
class PalindromeNumber {
    public boolean solve(int x) {
        if(x < 0) return false; 
        int original = x;
        int reversed = 0;
        while (x != 0) {
            reversed = (reversed * 10) + (x % 10);
            x = x / 10;
        }
        return original == reversed;
    }
}
