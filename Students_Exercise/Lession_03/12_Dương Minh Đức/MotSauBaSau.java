class Solution {
    
    public class Bang  {
    public int value;
    public int fre;
    public Bang(int value, int fre) {
        this.value = value;
        this.fre = fre;
    }

    public Bang() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getFre() {
        return fre;
    }

    public void setFre(int fre) {
        this.fre = fre;
    }



    @Override
    public String toString() {
        return "Bang{" +
                "value=" + value +
                ", fre=" + fre +
                '}';
    }


}
    
    public class FreComparator implements Comparator<Bang> {
    @Override
    public int compare(Bang o1, Bang o2) {
        if(o1.fre == o2.fre)
        {
            return  0 ;
        }
        else if(o1.fre>o2.fre)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

}
    
    public class ValueCompartor implements Comparator<Bang>{
    @Override
    public int compare(Bang o1, Bang o2) {
        if(o1.value == o2.value)
        {
            return  0 ;
        }
        else if(o1.value<o2.value)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
    
    public int[] frequencySort(int[] a) {
        
       List<Bang> b = new ArrayList<>();
       int[] a1 = new int[a.length];
       int[] result = new int[a.length];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = -1;
        }

        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j])
                {
                    count++;
                    a1[j] = 0;
                }
            }
            if (a1[i] != 0)
            {
                a1[i] = count;
            }
        }


        for (int i = 0; i < a1.length; i++) {

            if (a1[i] != 0)
            {
                Bang b1 = new Bang(a[i] , a1[i]);
                b.add(b1);
            }
        }
        Collections.sort(b,new ValueCompartor());
        Collections.sort(b,new FreComparator());

        for (int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i).toString());
        }
        int j = 0;

        for (int i = 0; i < b.size(); i++) {

            int x = b.get(i).getFre();
            while (x>0)
            {
                result[j] =  b.get(i).getValue();
                j++;
                x--;
            }

        }
        
        return result;
        
    }
}