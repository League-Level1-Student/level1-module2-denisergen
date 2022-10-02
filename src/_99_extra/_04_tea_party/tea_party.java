package _99_extra._04_tea_party;

public class tea_party {
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
        if (name == "Austen" && isWoman == true && isKnighted == false) 
        {
        System.out.println("Hello Ms. Austen");
        return "Hello Ms. Austen";	
        }
        if (name == "Orwell" && isWoman == false && isKnighted == false) 
        {
        System.out.println("Hello Mr. Orwell");
        return "Hello Mr. Orwell";	
        }
        if (name == "Isaac Newton" && isWoman == false && isKnighted == true) 
        {
        System.out.println("Hello Sir Isaac Newton");
        return "Hello Sir Isaac Newton";	
        }
        if (name == "Laura" && isWoman == true && isKnighted == true) 
        {
        System.out.println("Hello Lady Laura");
        return "Hello Lady Laura";	
        }else
    	return "poop";
    }
}