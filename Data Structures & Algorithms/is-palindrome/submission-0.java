class Solution {
    public boolean isPalindrome(String s) {

        String s2 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //String s2 = cleanString.tolower();
        System.out.println(s2);

        int size = s2.length();

        int left = 0;
        int right = s2.length() - 1 ;


        while(left < size/2){

            if(s2.charAt(left) == s2.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }

        return true;

    }
}
