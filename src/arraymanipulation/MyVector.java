package arraymanipulation;

import java.util.ArrayList;

public class MyVector {
    private final ArrayList<Double> myVector;
    public MyVector(double[] initvalues){
        myVector = new ArrayList<>();
        for (int i = 0; i < initvalues.length; i++){
            myVector.add(initvalues[i]);
        }
    }
    public MyVector(MyVector source){
        myVector = new ArrayList<>();
        for (int i = 0; i < source.getLength(); i++){
            myVector.add(source.getValueAt(i));
        }
    }
    public MyVector(){
        myVector = new ArrayList<>();
    }
    public int getLength(){
        return myVector.size();
    }
    public double getValueAt(int k){
        return myVector.get(k);
    }
    public void setValueAt(int k, double value){
        myVector.set(k, value);
    }
    public void add(double value){
        myVector.add(value);
    }
    
    public MyVector plus(MyVector source){
        
        MyVector localVector = new MyVector();
        if(source.getLength() != this.getLength()){
            return source;
        }
        for (int i = 0; i < source.getLength(); i++){
            double value = myVector.get(i) + source.getValueAt(i);
            localVector.add(value);
        }
        return localVector;
    }
    public MyVector minus(MyVector source){
        int size;
        MyVector localVector = new MyVector();
        if (source.getLength() > myVector.size()){
            size = source.getLength();
        }else{
            size = myVector.size();
        }
        for (int i = 0; i < size; i++){
            double value = myVector.get(i) - source.getValueAt(i);
            localVector.add(value);
        }
        return localVector;
    }
    public MyVector scaleBy(int scale){
        MyVector localVector = new MyVector();
        for (int i = 0; i < myVector.size(); i++){
            localVector.add(myVector.get(i) * scale);
        }
        return localVector;
    }
    @Override
    public boolean equals(Object source){
        if (!(source instanceof MyVector)){
            return false;
        }
        boolean localbool = true;
        MyVector localVector = (MyVector)source;
        for (int i = 0; i < myVector.size(); i++){
            if (myVector.get(i) != localVector.getValueAt(i)){
                localbool = false;
            }
        }
        return localbool;
    }
    public MyVector abs(){
        MyVector localVector = new MyVector(this);
        for (int i = 0; i < localVector.getLength(); i++){
            localVector.setValueAt(i, Math.sqrt(localVector.getValueAt(i) * localVector.getValueAt(i)));
        }
        return localVector;
    }
    public MyVector dotProduct(MyVector source){
        MyVector localVector = new MyVector();
        for (int i = 0; i < source.getLength(); i++){
            localVector.add(myVector.get(i) * source.getValueAt(i));
        }
        return localVector;
    }
    @Override
    public String toString(){
        String str = "Values of Array: ";
        for (int i = 0; i < myVector.size(); i++){
            str += myVector.get(i).toString() + " ";
        }
        return str;
    }
}
