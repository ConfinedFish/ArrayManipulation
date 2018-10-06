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
    @Override
    public String toString(){
        String str = "";
        for (int i = 0; i < myVector.size(); i++){
            str += myVector.get(i).toString() + " ";
        }
        return str;
    }
    public MyVector plus(MyVector source) throws Exception{
        if(source.getLength() != this.getLength()){
            throw new Exception();
        }
        MyVector localVector = new MyVector();
        for (int i = 0; i < source.getLength(); i++){
            double value = myVector.get(i) + source.getValueAt(i);
            localVector.add(value);
        }
        return localVector;
    }
    public MyVector minus(MyVector source) throws Exception{
        if(source.getLength() != this.getLength()){
            throw new Exception();
        }
        MyVector localVector = new MyVector();
        for (int i = 0; i < source.getLength(); i++){
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
    public MyVector abs(){
        MyVector localVector = new MyVector(this);
        for (int i = 0; i < localVector.getLength(); i++){
            localVector.setValueAt(i, Math.sqrt(localVector.getValueAt(i) * localVector.getValueAt(i)));
        }
        return localVector;
    }
    public double dotProduct(MyVector source){
        double collect = 0.0;
        for (int i = 0; i < source.getLength(); i++){
            collect += (myVector.get(i) * source.getValueAt(i));
        }
        return collect;
    }
}
