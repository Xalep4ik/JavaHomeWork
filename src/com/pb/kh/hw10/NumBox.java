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
        if (index<size) {
            return number[index];
        }
        else throw new ArrayIndexOutOfBoundsException();
    }
    public int length(){
        return size;
    }

    public double average() {
        double average = 0;
        for (int i = 0; i < size; i++) {
            average += number[i].doubleValue();
        }
        return average/size;
    }
    public double sum(){
        double sum = 0.0;
        for (T i : number) {
            if(i == null) {
                sum += 0;
            }else sum+=i.doubleValue();
        }
       return sum;
    }
    public T max (){
        T maxval = number[0];
        for (int i =0; i<size; i++) {
            if (maxval instanceof Integer) {
                if ( number[i].intValue() >  maxval.intValue()) {
                    maxval = number[i];
                }
            }
            if (maxval instanceof Float) {
                if (number[i].floatValue()>maxval.floatValue()) {
                 maxval = number[i];
                }
            }
            if (maxval instanceof Double){
                if (number[i].doubleValue()>maxval.doubleValue()){
                    maxval=number[i];
                }
            }
        }
        return maxval;
    }
}

