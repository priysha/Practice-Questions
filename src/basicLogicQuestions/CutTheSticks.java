package basicLogicQuestions;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {
	
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int _lengths_size = Integer.parseInt(in.nextLine());
        int[] _lengths = new int[_lengths_size];
        int _lengths_item;
        for(int _lengths_i = 0; _lengths_i < _lengths_size; _lengths_i++) {
            _lengths_item = Integer.parseInt(in.nextLine());
            _lengths[_lengths_i] = _lengths_item;
        }
        
        cutSticks(_lengths);
        
    }

	static void cutSticks(int[] lengths) {
        Arrays.sort(lengths);
        do {
            int count =0;
            int smallest = lengths[0];
            for (int j=0; j < lengths.length; j++){
                lengths[j] = lengths[j] - smallest;
                count++;
                }
            System.out.println(count);
            List<Integer> output = new LinkedList<Integer>();
            for ( int i=0; i< lengths.length; i++){
                if (lengths[i] != 0){
                output.add(lengths[i]);
            }
        }
        int arr[] = new int[output.size()];
        for (int i = 0; i < output.size(); i ++){
          arr[i] = output.get(i);
      }
      lengths = arr;
        } while (lengths.length > 0);

    }

}

