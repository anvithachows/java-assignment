class Main {
    public static void main(String[] args){
        String str = "anvithaanvi";
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        System.out.println("Original string:" + str);
        System.out.println("After removing duplicates:" + result);
    }
}