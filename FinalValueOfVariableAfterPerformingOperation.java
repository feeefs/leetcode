class FinalValueOfVariableAfterPerformingOperation {
        // Complexity Analysis: Time Complxity --> O(N) | Space Complexity --> O(1)
        public int solve(String[] operations) {
                int x =0;
                for (String operation : operations) x += (44 - operation.charAt(1));
                return x;
        }
}
