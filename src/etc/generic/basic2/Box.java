package etc.generic.basic2;

//멀티 제네릭(key,value)
public class Box<k,v>{
    private  k key;
    private  v value;

    public Box(k key, v value) {
        this.key = key;
        this.value = value;
    }

    public void put(k key, v value){
        this.key = key;
        this.value=value;
    }

    public  v get(k key){
        return this.value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
