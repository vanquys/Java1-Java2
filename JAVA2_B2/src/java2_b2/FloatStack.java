
package java2_b2;

import java.util.Vector;

public class FloatStack {
    Vector<Float> list;

    public FloatStack() {
        list = new Vector<>();
    }
    
    public void push(Float obj){
        list.add(0, obj);
    }
    public float seek(){
        Float obj = null;
        if (!(list.isEmpty())) {
            obj = list.elementAt(0);
        }
        return obj;
    }
    public float pop(){
        Float obj = list.elementAt(0);
        list.remove(0);
        return obj;
        
    }
    public static void main(String[] args) {
        FloatStack list = new FloatStack();
        
        list.push(new Float(1.2));
        list.push(new Float(3.4));
        list.push(new Float(5.6));
        list.push(new Float(7.8));
    
        System.out.println("number seek : " + list.seek());
        
        System.out.println("");
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        
        
    }
   
}
