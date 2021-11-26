package com.pb.kh.hw10;

public class NumBox <T extends Number>{

    public T[] number;
    int size;

    public NumBox(int size) {
        number = (T[]) new Number[size];
    }

    public void add(T numbe) {
            if (size < number.length) {
                number[size] = numbe;
                size++;
            }else throw new RuntimeException();
    }
    public T get(int index) {
        return number[index];
    }
    public int length(){
        return size;
    }

/*    public double average() {
        double average1 = 0;
        for (int i = 0; i < average1; i++) {
            average1 += number[i];
        }
        return average1;
    }*/
    public double sum(){
        double sum = 0.0;
        for (T i : number) {
            if(i == null) {
                sum += 0;
            }else sum+=i.doubleValue();
        }
       return sum;
    }
/*    public T max (){
        T maxval = number[0];
        for (int i =0; i<number.length; i++) {
            if (maxval instanceof Integer) {
                if ((int) number[i] > (int) maxval) {
                    maxval = number[i];
                }
            }
        }
        return maxval;
    }*/
}

