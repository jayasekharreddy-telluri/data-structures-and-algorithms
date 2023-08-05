class Solution {
    public int maxVowels(String s, int k) {
            
        int vowelCount = 0;
        int maxCount = 0;
        //to count the number of vowels in the first substring of length 'k'
        for(int i = 0 ;i < k ; i ++){
            if(isVowel(s.charAt(i))){
                vowelCount ++;
            }
        }
        maxCount = Math.max(maxCount,vowelCount);
        for(int i = k; i < s.length(); i ++){
            //to avoids unnecessary computations when the maximum count is already equal to 'k'.
            if(maxCount == k){
                return maxCount;
            }
            //to remove the first element from substring so that we can move our sliding boundary one step forward
            if(isVowel(s.charAt(i-k))){
                vowelCount--;
            }
            //adding new element into the sliding boundary
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
            //to keep track of maxCount
            maxCount = Math.max(maxCount,vowelCount);
        }
        return maxCount;
    }
    //it return true if the character is vowel
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
        
  
}