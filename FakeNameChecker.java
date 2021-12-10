public class FakeNameChecker {

    public static boolean isSuspicious(String nameA, String nameB) {
        
        int count_charA = 0, count_charB = 0;

        for(int reference = 0; reference < nameA.length()-1; reference++){
            for(int indexA = reference+1; indexA < nameA.length(); indexA++){
                if(nameA.charAt(reference) == nameA.charAt(indexA)){
                    count_charA++;
                }
            }
            for(int indexB = 0; indexB < nameB.length(); indexB++){
                if(nameA.charAt(reference) == nameB.charAt(indexB)){
                    count_charB++;
                }
            if(count_charA != count_charB){
                return false;
                }
            }        
        }
    return true;
    }

    public static void main(String[] args) {
        System.out.println(isSuspicious("Orlando","Ronaldo"));
    }


}