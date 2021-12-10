public class FakeNameChecker {

    public static boolean isSuspicious(String nameA, String nameB) {
        
        if (nameA == nameB){
            return true;
        }

        for(int reference = 0; reference < nameA.length()-1; reference++){
            int count_charA = 1, count_charB = 0;
            //System.out.println("Reference: " + nameA.charAt(reference));
            for(int indexA = reference + 1; indexA < nameA.length(); indexA++){
                //System.out.println("IndexA: " + nameA.toUpperCase().charAt(indexA));
                if(nameA.toUpperCase().charAt(reference) == nameA.toUpperCase().charAt(indexA)){
                    count_charA++;
                }
            }
            for(int indexB = 0; indexB < nameB.length(); indexB++){
                //System.out.println("IndexB: " + nameB.toUpperCase().charAt(indexB));
                if(nameA.toUpperCase().charAt(reference) == nameB.toUpperCase().charAt(indexB)){
                    count_charB++;
                }
            }
            if(count_charA != count_charB){
                return false;
            }              
        }
    return true;
    }

    public static void main(String[] args) {
    // isSuspicious("Ajahni", "Naijah") should return true
    // isSuspicious("Ronaldo", "Orlando") should return true
    // isSuspicious("Leanora", "Elanora") should return true
    // isSuspicious("Nina", "Nina") should return true
    // isSuspicious("", "") should return true
    
    // isSuspicious("James", "Johnny") should return false
    // isSuspicious("Sam", "Bob") should return false
    // ```
        System.out.println(isSuspicious("Orlando","Ronaldo"));
        System.out.println(isSuspicious("Ajahni", "Naijah"));
        System.out.println(isSuspicious("Leanora", "Elanora"));
        System.out.println(isSuspicious("Nina", "Nina"));
        System.out.println(isSuspicious("", ""));
        System.out.println(isSuspicious("James", "Johnny"));
        System.out.println(isSuspicious("Sam", "Bob"));
    }


}