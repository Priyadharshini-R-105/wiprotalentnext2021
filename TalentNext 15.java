//Permutation of 8

 if (l < 3)  
        { 
            if (Integer.parseInt(n) % 8 == 0) 
                return true; 
      
            // check for the reverse 
            // of a number 
            n = new String((new StringBuilder()).append(n).reverse()); 
              
            if (Integer.parseInt(n) % 8 == 0) 
                return true; 
            return false; 
        } 
      
        // Stores the Frequency of 
        // characters in the n. 
        int []hash = new int[10]; 
        for (int i = 0; i < l; i++) 
            hash[n.charAt(i) - '0']++; 
      
        // Iterates for all  
        // three digit numbers 
        // divisible by 8 
        for (int i = 104; i < 1000; i += 8)  
        { 
            int dup = i; 
      
            // stores the frequency of  
            // all single digit in  
            // three-digit number 
            int []freq = new int[10]; 
            freq[dup % 10]++; 
            dup = dup / 10; 
            freq[dup % 10]++; 
            dup = dup / 10; 
            freq[dup % 10]++; 
      
            dup = i; 
      
            // check if the original  
            // number has the digit 
            if (freq[dup % 10] >  
                hash[dup % 10]) 
                continue; 
            dup = dup / 10; 
      
            if (freq[dup % 10] >  
                hash[dup % 10]) 
                continue; 
            dup = dup / 10; 
      
            if (freq[dup % 10] >  
                hash[dup % 10]) 
                continue; 
      
            return true; 
        } 
      
        // when all are checked  
        // its not possible 
        return false;
