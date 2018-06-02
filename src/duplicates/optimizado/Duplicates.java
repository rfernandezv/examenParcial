package duplicates.optimizado;

import java.util.Arrays;
import java.util.List;


public class Duplicates {
    static Integer steps;
    static Integer position;
    
    public static void main(String[] args) {
        boolean hasDuplicate = false;
        Integer positionBusqueda;
        steps = 0;
        List<Integer> valueList = Arrays.asList(1, 2, 4, 5, 6, 7, 10, 21, 22, 34, 35, 36, 39, 67, 68, 68);
        try {
             for(int contador = 0; contador < valueList.size() ; contador++){
                position = contador;
                positionBusqueda = binarySearch(valueList, valueList.get(contador), 0, valueList.size() - 1);
                if(positionBusqueda != null){
                    hasDuplicate = true;
                    break;
                }
            }
            
            System.out.println("N: " + valueList.size());
            if(hasDuplicate){
                System.out.println("Has duplicate values ");
            }else{
                System.out.println("Don't have duplicate values");
            }
            System.out.println("Steps: " + steps);
        } catch (Exception e) {
        }   
    }
    
    public static Integer binarySearch(List<Integer> valueList, int needle, int min, int max) throws Exception {
        int midpoint = (max + min) / 2;
        steps++;
        if (valueList.size() > 0 && valueList.get(midpoint) == needle && midpoint != position) {
            return midpoint;
        }
        if (min >= max) {
            return null;
        }
        if (valueList.get(midpoint) > needle) {
            return binarySearch(valueList, needle, min, midpoint - 1);
        }
        return binarySearch(valueList, needle, midpoint + 1, max);
    }
}
