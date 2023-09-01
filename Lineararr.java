public class Lineararr {
    public static void main(String[] args) {
       String fruits[]={"mango","kiwi","papaya","bannana","orange","litchi"};
       String tar="watermelon";
       boolean flag = true; 
       for(int i=0;i<fruits.length; i++){
        if(fruits[i].equals(tar))
       
        System.out.println(tar+ "Is present ");
        break;
       }
    
    if(flag ==false);{
        System.out.println("Not present");
    }
}
}