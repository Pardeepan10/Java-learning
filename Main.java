public class Main {
    public static void main(String[] args) {
        String par="Let's take LeetCode contest";
        System.out.println(par);
        char[] word=par.toCharArray();
        int start=0;
        int end=par.length()-1;
        char temp=0;
        while(start<end){
            temp=word[start];
            word[start]=word[end];
            word[end]=temp;
            start++;
            end--;
        }
        System.out.println(word);

    }
}