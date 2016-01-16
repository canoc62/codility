import java.util.*;

class IsAnagramPalindrome{

	public static boolean isAnagramOfPalindrome(String s){

        if(s.length() == 0){
        	return false;
        }
        if(s.length() == 1){
        	return true;
        }
        int [] count = new int[26];

    	int spaceCount = 0;

        for( int i = 0; i < s.length(); i++ )
        {
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch != ' '){
            	count[ch-'a']++;
            }
            else{
            	spaceCount++;
            }
        }
        
        int oddOccur = 0;
        if(spaceCount%2 == 1){
        	oddOccur++;
        }
        for( int cnt:count )
        {
            if( oddOccur > 1)
                return false;
            if( cnt%2 == 1 )
                oddOccur++;
        }
        return true;

	}

	public static void main(String[] args){

		System.out.println(isAnagramOfPalindrome("abbc "));
		System.out.println(isAnagramOfPalindrome("aabbcd"));
		System.out.println(isAnagramOfPalindrome("Aab c c"));
	}
}