
import java.util.ArrayList;

//取得旋转数组中的某数位置，最小值(一个有序数组的旋转)
public class class3 {

    public static Integer Min(ArrayList<Integer> data, int find){

        Integer i = 0;
        Integer j = data.size()-1;
        Integer midNum = i;

        //取旋转数组中最小值
        while(data.get(i) >= data.get(j)){
            midNum = (i+j)/2;
            if( data.get(i) >= data.get(midNum) ){
                i = midNum;
            }

            if( data.get(j) <= data.get(midNum) ){
                j = midNum;
            }
        }
        return data.get(midNum);
    }

    public static int search(int n,ArrayList<Integer> array){
        int low = 0;
        int high = array.size()-1;
        while(low<=high){
            int middle = (low+high)/2;
            if(array.get(middle) == n) return middle;
            if(array.get(middle) > array.get(low)){
                //大数组内
                if(n <= array.get(middle) && n >= array.get(low)){
                    high = middle-1;
                }else {
                    low = middle+1;
                }
            }else {
                //小数组内
                if(n>= array.get(middle) && n<= array.get(high)){
                    low = middle+1;
                }else {
                    high = middle-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        class3 x = new class3();
        ArrayList arrayList = new ArrayList();

        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(18);
        arrayList.add(20);
        arrayList.add(114);
        arrayList.add(1);
        arrayList.add(3);

        System.out.println(x.search(6,arrayList));
//        x.Min(arrayList,6);
    }
}
