import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class KataTest {
    @Test
    public void testSomething() {
      
      int[] input = new int[] {-1,-2,-3,-4,-5};
      int[] expected = new int[] {1,2,3,4,5};
      assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));
      
      input = new int[] {-1,2,-3,4,-5};
      expected = new int[] {1,-2,3,-4,5};
      assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));
      
      input = new int[] {};
      expected = new int[] {};
      assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));
      
      input = new int[] {0};
      expected = new int[] {0};
      assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));
    }
}

public class Kata {
  public static int[] invert(int[] array) {
        
    // For que recorre el array
    for(int i = 0;i < array.length; i++){
      // Si hay algun numero menor a 0 entra
        if(array[i] < 0){
          // convierte los numeros negativos a positivos
          array[i] *= -1; 
        }else{
          // Convierte los numeros positivos a nehgativos
          array[i] /= -1;
        }
      }
    
  return array;
  }
}
