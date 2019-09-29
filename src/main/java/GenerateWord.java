public class GenerateWord {

    public static StringBuilder getString(){
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randString = new StringBuilder();
        int count = (int)(Math.random()*10);
        for(int i=0;i<count;i++)
            randString.append(symbols.charAt((int)(Math.random()*symbols.length())));
        return randString;
    }
}
