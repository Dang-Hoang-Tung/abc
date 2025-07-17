public int[] compare(int[] scores, int[] guesses) {
    
    int[] differences = new int[scores.length];

    
    for (int i = 0; i < scores.length; i++) {
        
        differences[i] = Math.abs(scores[i] - guesses[i]);
    }

    
    return differences;
} 


public static void main(String[] args) {
    int[] scores = {1, 2, 3, 4, 5, 1};
    int[] guesses = {1, 2, 3, 4, 2, -2};
    int[] result = compare(scores, guesses);
    System.out.println(Arrays.toString(result)); 

    int[] scores2 = {0, 5, 0, 0, 0, 4};
    int[] guesses2 = {4, 1, 1, 0,