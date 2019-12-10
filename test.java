public class test{
    public int items = 10;

    public void addItem(){
        items = items + 1;
        System.out.println("Number of Items = " + items);
    }
    public void deleteItem(){
        items = items - 1;
        System.out.println("Number of Items = " + items);
    }
    public static void main(String args[]){
        test a = new test();
        test b = new test();
        a.addItem();
        b.deleteItem();
        // TODO why there is not need to do a.close() to close the mem slot and no res leak error?
        // FIXME test
        
    }
}