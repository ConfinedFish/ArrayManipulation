package arraymanipulation;

import java.util.ArrayList;

public class MyVector {
    private ArrayList<Double> myVector;
    public MyVector(double[] initvalues){
        myVector = new ArrayList<>();
        for (int i = 0; i < initvalues.length; i++){
            myVector.add(initvalues[i]);
        }
    }
    public MyVector(MyVector source){
        myVector = new ArrayList<>();
        for (int i = 0; i < source.getList().size(); i++){
            myVector.add(source.getValueAt(i));
        }
    }
    public MyVector(){
        myVector = new ArrayList<>();
    }
    public double getValueAt(int k){
        return myVector.get(k);
    }
    public ArrayList<Double> getList(){
        return myVector;
    }
    public MyVector plus(MyVector source){
        int size;
        MyVector localVector = new MyVector();
        if (source.getList().size() > myVector.size()){
            size = source.getList().size();
        }else{
            size = myVector.size();
        }
        for (int i = 0; i < size; i++){
            double value = myVector.get(i) + source.getValueAt(i);
            localVector.getList().add(value);
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
