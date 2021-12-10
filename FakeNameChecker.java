public class FakeNameChecker {
    
    public boolean isSuspicious(String nameA, String nameB) {
        
        if (nameA == nameB){
            return true;
        }

        for(int reference = 0; reference < nameA.length()-1; reference++){
            int count_charA = 0, count_charB = 0;
            for(int indexA = 0; indexA < nameA.length(); indexA++){
                if(nameA.toUpperCase().charAt(reference) == nameA.toUpperCase().charAt(indexA)){
                    count_charA++;
                }
            }

            for(int indexB = 0; indexB < nameB.length(); indexB++){
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
}